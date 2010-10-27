package com.gwt.seminar.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

public class DesktopShell extends Composite {

	private static DesktopShellUiBinder uiBinder = GWT
			.create(DesktopShellUiBinder.class);

	interface DesktopShellUiBinder extends UiBinder<Widget, DesktopShell> {}

	@UiField SimplePanel content;
	@UiField SimplePanel home_link;
	@UiField SimplePanel rsvp_link;
	@UiField SimplePanel about_link;
	@UiField SimplePanel location_link;
	@UiField SimplePanel resources_link;
	@UiField SimplePanel contact_link;
	
	public DesktopShell() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	public SimplePanel getContent(){
		return content;
	}
	
	public SimplePanel getHomeLink(){
		return home_link;
	}
	
	public SimplePanel getRsvpLink(){
		return rsvp_link;
	}
	
	public SimplePanel getAboutLink(){
		return about_link;
	}
	
	public SimplePanel getLocationLink(){
		return location_link;
	}
	
	public SimplePanel getResourcesLink(){
		return resources_link;
	}
	
	public SimplePanel getContactLink(){
		return contact_link;
	}

}
