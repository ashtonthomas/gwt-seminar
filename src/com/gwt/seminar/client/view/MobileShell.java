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

public class MobileShell extends Composite {

	private static MobileShellUiBinder uiBinder = GWT
			.create(MobileShellUiBinder.class);

	interface MobileShellUiBinder extends UiBinder<Widget, MobileShell> {
	}

	@UiField SimplePanel header;
	@UiField SimplePanel menu;
	@UiField SimplePanel footer;
	@UiField SimplePanel content;
	
	public MobileShell() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	public SimplePanel getHeader(){
		return header;
	}
	
	public SimplePanel getMenu(){
		return menu;
	}
	
	public SimplePanel getFooter(){
		return footer;
	}
	
	public SimplePanel getContent(){
		return content;
	}
}
