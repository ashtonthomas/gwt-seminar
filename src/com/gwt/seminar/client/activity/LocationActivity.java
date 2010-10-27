package com.gwt.seminar.client.activity;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.maps.client.InfoWindowContent;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.Maps;
import com.google.gwt.maps.client.control.LargeMapControl;
import com.google.gwt.maps.client.geom.LatLng;
import com.google.gwt.maps.client.overlay.Marker;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.gwt.seminar.client.view.LocationView;

public class LocationActivity extends AbstractActivity {
	private LocationView view;
	
	@Inject
	public LocationActivity(LocationView view){
		this.view = view;
	}
	
	
	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		Maps.loadMapsApi("ABQIAAAAk8rLRWihbZB29441zLSI8RTvsi8E-04FGahLkZW1Pu2glbs0CxTtGepadIGgwAjM59a6Cfjfkga7Kg", "2", false, new Runnable(){
			public void run(){
				buildMapsUi();
			}
		});
		
		panel.setWidget(view.asWidget());
	}
	
	public void buildMapsUi(){
		// Open a map centered on 222 Porter Hall at Carnegie Mellon University Information Systems Program
	    LatLng cmu_information_systems = LatLng.newInstance(40.44152, -79.946123);
	    
	    final MapWidget map = new MapWidget(cmu_information_systems, 2);
	    map.setSize("60em", "40em");
	    // Add some controls for the zoom level
	    map.addControl(new LargeMapControl());
	    map.setZoomLevel(16);
	    // Add a marker
	    map.addOverlay(new Marker(cmu_information_systems));

	    // Add an info window to highlight a point of interest
	    map.getInfoWindow().open(map.getCenter(),
	        new InfoWindowContent("Porter Hall 222, CMU Information Systems"));
	    view.getContent().setWidget(null); // clearing the current child widget. probalby not the way to go though...
		view.getContent().add(map.asWidget());
	}

}
