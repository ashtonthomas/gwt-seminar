package com.gwt.seminar.client.application.ioc;

import com.google.gwt.inject.client.GinModules;
import com.gwt.seminar.client.application.AcrintaSeminarApp;
import com.gwt.seminar.client.application.MobileApp;

// Okay so we are just going to define an Injector interface 
// that uses the @annotation to point to the particular "AbstractGinModule" class

@GinModules(value = {AppInjectorModule.class})
public interface MobileInjector extends AppInjector {
	MobileApp getAcrintaSeminarApp();
}
