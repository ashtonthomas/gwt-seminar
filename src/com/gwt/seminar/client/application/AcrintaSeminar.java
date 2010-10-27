package com.gwt.seminar.client.application;

import com.gwt.seminar.client.application.ioc.DesktopInjectorWrapper;
import com.gwt.seminar.client.application.ioc.InjectorWrapper;
import com.gwt.seminar.shared.FieldVerifier;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.maps.client.InfoWindowContent;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.Maps;
import com.google.gwt.maps.client.control.LargeMapControl;
import com.google.gwt.maps.client.geom.LatLng;
import com.google.gwt.maps.client.overlay.Marker;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class AcrintaSeminar implements EntryPoint {
	// we are going to use our little injectorWrapper to get everything started for us
	// We will use deferred binding so we can create all our different apps (Desktop & Mobile)
	// see the Gwt_seminar.gwt.xml to see how we switch in MobileInjectorWrapper when on a mobile device
	final private InjectorWrapper injectorWrapper = GWT.create(DesktopInjectorWrapper.class);
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		/* use our injectorWrapper to get the appropriate injector and then to use
		 * that to get our platform specific application */
		injectorWrapper.getInjector().getAcrintaSeminarApp().run();
	}
}
