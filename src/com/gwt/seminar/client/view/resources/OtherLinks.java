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

public class OtherLinks extends Composite {

	private static OtherLinksUiBinder uiBinder = GWT
			.create(OtherLinksUiBinder.class);

	interface OtherLinksUiBinder extends UiBinder<Widget, OtherLinks> {
	}


	public OtherLinks() {
		initWidget(uiBinder.createAndBindUi(this));
	}
}
