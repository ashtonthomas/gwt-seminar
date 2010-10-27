package com.gwt.seminar.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class RsvpView extends Composite {

	private static RsvpViewUiBinder uiBinder = GWT
			.create(RsvpViewUiBinder.class);

	interface RsvpViewUiBinder extends UiBinder<Widget, RsvpView> {
	}

	public RsvpView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
