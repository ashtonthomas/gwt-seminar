package com.gwt.seminar.client.application.ioc;

import com.google.gwt.inject.client.GinModules;
import com.gwt.seminar.client.application.AcrintaSeminarApp;
import com.gwt.seminar.client.application.DesktopApp;

// Okay so we are just going to define an Injector interface 
// that uses the @annotation to point to the particular "AbstractGinModule" class

@GinModules(value = {AppInjectorModule.class})
public interface DesktopInjector extends AppInjector {
	// notice we are returning a "DesktopApp" which extends AcrintaSeminarApp
	// This will tell Gin to create a DesktopApp instead of a MobileApp
	DesktopApp getAcrintaSeminarApp();
}
