package com.gwt.seminar.client.view.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class Videos extends Composite {

	private static VideosUiBinder uiBinder = GWT.create(VideosUiBinder.class);

	interface VideosUiBinder extends UiBinder<Widget, Videos> {
	}
	
	public Videos() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
