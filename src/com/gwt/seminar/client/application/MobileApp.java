package com.gwt.seminar.client.application;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.CachingActivityMapper;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.inject.Inject;
import com.gwt.seminar.client.activity.MainActivityMapper;
import com.gwt.seminar.client.place.AppPlaceHistoryMapper;
import com.gwt.seminar.client.place.HomePlace;
import com.gwt.seminar.client.view.MobileShell;

public class MobileApp extends AcrintaSeminarApp {
	private final MobileShell shell;
	private final EventBus eventBus;
	private final PlaceController placeController;
	private final MainActivityMapper mainActivityMapper;
	private final AppPlaceHistoryMapper appPlaceHistoryMapper;
	
	private Place defaultPlace = new HomePlace();
	
	@Inject
	public MobileApp(MobileShell shell, EventBus eventBus, PlaceController placeController, 
			MainActivityMapper mainActivityMapper, AppPlaceHistoryMapper appPlaceHistoryMapper){
		this.shell = shell;
		this.eventBus = eventBus;
		this.placeController = placeController;
		this.mainActivityMapper = mainActivityMapper;
		this.appPlaceHistoryMapper = appPlaceHistoryMapper;
	}
	
	public void run(){
		/* Add handlers, setup activities */
		GWT.setUncaughtExceptionHandler(new GWT.UncaughtExceptionHandler() {
			public void onUncaughtException(Throwable e) {
				Window.alert("Hey, something went wrong: " + e.getMessage());
				// we could log this if we were using logging...
				
			}
		});
		
		CachingActivityMapper cached = new CachingActivityMapper(mainActivityMapper);
		final ActivityManager mainActivityManager = new ActivityManager(cached, eventBus);
		
		mainActivityManager.setDisplay(shell.getContent());
		
		// History management 
		AppPlaceHistoryMapper historyMapper = appPlaceHistoryMapper;
		PlaceHistoryHandler historyHandler = new PlaceHistoryHandler(historyMapper);
		historyHandler.register(placeController, eventBus, defaultPlace);
		
		// add out UiBinder shell to the Root Panel (the main html document thingy)
		RootLayoutPanel.get().add(shell);
		historyHandler.handleCurrentHistory();
		
	}
}
