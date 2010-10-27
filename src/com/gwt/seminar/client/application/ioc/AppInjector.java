package com.gwt.seminar.client.application.ioc;

import com.google.gwt.inject.client.Ginjector;
import com.gwt.seminar.client.application.AcrintaSeminarApp;

// Interface for that forces or "extending" injectors (who are interfaces)
// to return an AcrintaSeminarApp
public interface AppInjector extends Ginjector {
	// not too exciting. just setting up our interface
	AcrintaSeminarApp getAcrintaSeminarApp();
}
