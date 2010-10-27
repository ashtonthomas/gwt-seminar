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

public class ResourcesView extends Composite {

	private static ResourcesViewUiBinder uiBinder = GWT
			.create(ResourcesViewUiBinder.class);

	interface ResourcesViewUiBinder extends UiBinder<Widget, ResourcesView> {
	}

	public ResourcesView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
