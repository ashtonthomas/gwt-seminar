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

public class SampleCode extends Composite {

	private static SampleCodeUiBinder uiBinder = GWT
			.create(SampleCodeUiBinder.class);

	interface SampleCodeUiBinder extends UiBinder<Widget, SampleCode> {
	}


	public SampleCode() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
