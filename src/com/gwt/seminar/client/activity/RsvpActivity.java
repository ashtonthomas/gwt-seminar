package com.gwt.seminar.client.activity;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.gwt.seminar.client.view.RsvpView;

public class RsvpActivity extends AbstractActivity {
	private RsvpView view;
	
	@Inject
	public RsvpActivity(RsvpView view){
		this.view = view;
	}
	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		panel.setWidget(view.asWidget());
	}

}
