package com.gwt.seminar.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import com.google.inject.Inject;

/**
 * PlaceHistoryMapper interface is used to attach all places which the
 * PlaceHistoryHandler should be aware of. This is done via the @WithTokenizers
 * annotation or by extending PlaceHistoryMapperWithFactory and creating a
 * separate TokenizerFactory.
 */

//@WithTokenizers( { })
public class AppPlaceHistoryMapper implements PlaceHistoryMapper{

	private HomePlace homePlace;
	private RsvpPlace rsvpPlace;
	private AboutPlace aboutPlace;
	private ContactPlace contactPlace;
	private LocationPlace locationPlace;
	private ResourcesPlace resourcesPlace;
	
	@Inject
	public AppPlaceHistoryMapper(HomePlace homePlace, RsvpPlace rsvpPlace, AboutPlace aboutPlace, ContactPlace contactPlace,
									LocationPlace locationPlace, ResourcesPlace resourcesPlace){
		this.homePlace = homePlace;
		this.rsvpPlace = rsvpPlace;
		this.aboutPlace = aboutPlace;
		this.contactPlace = contactPlace;
		this.locationPlace = locationPlace;
		this.resourcesPlace = resourcesPlace;
		
	}

	@Override
	public Place getPlace(String token) {
		
		if(token.startsWith("home")){
			return homePlace;
		}else if(token.startsWith("rsvp")){
			return rsvpPlace;
		}else if(token.startsWith("about")){
			return aboutPlace;
		}else if(token.startsWith("contact")){
			return contactPlace;
		}else if (token.startsWith("location")){
			return locationPlace;
		}else if(token.startsWith("resources")){
			return resourcesPlace;
		}
		
		
		return null;
	}

	@Override
	public String getToken(Place place) {
		if(place instanceof AppPlace){
			return ((AppPlace) place).getToken();
		}
		return null;
	}
	
}
