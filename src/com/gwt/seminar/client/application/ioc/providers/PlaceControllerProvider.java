package com.gwt.seminar.client.application.ioc.providers;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Inject;
import com.google.inject.Provider;

/* We are going to define our Provider in its own class
 * and in a sub-package of application.ioc just to keep 
 * things clean. However, you may also define Providers 
 * as an inner class of the Module - AppInjectorModule */
public class PlaceControllerProvider implements Provider<PlaceController>{
	// set up the evenBus to be injected via the constructor
	private final EventBus eventBus;

	// The @Inject annotation tells Gin to inject the constructor parameters
	// In this case, it will inject an EventBus
	// Since we bind SimpleEventBus in configure(), we know our event bus will
	// be of type SimpleEventBus
	@Inject
	public PlaceControllerProvider(EventBus eventBus){
		this.eventBus = eventBus;
	}
	
	public PlaceController get() {
		// okay, long story longer....
		// we want to inject our "Place Controller" in other areas of out application
		// and not just here. so we configure gin with our configure() method
		// where we use a Provider to configure the exact
		// PlaceController we wont to use elsewhere.
		// but our PlaceController also depends on an EventBus.
		// So our EventBus is injected into this Provider
		// which then uses the eventBus to create a new PlaceController
		// Afterward, gin uses the PlaceController return hear 
		// in all the other parts of the app
		return new PlaceController(eventBus);
	}

}


