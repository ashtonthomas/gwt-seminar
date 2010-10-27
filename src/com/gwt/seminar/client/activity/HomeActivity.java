package com.gwt.seminar.client.activity;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.inject.Inject;
import com.gwt.seminar.client.view.HomeView;

public class HomeActivity extends AbstractActivity {
	private HomeView view;
	
	@Inject
	public HomeActivity(HomeView view){
		this.view = view;
	}

	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		panel.setWidget(view.asWidget());
		
	}
	

}
