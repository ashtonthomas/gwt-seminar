package com.gwt.seminar.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

public class LocationView extends Composite {

	private static LocationViewUiBinder uiBinder = GWT
			.create(LocationViewUiBinder.class);

	interface LocationViewUiBinder extends UiBinder<Widget, LocationView> {
	}
	
	@UiField SimplePanel content;

	public LocationView() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	public SimplePanel getContent(){
		return content;
	}

}
