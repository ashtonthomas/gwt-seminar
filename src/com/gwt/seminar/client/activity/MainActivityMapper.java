package com.gwt.seminar.client.activity;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.gwt.seminar.client.place.AboutPlace;
import com.gwt.seminar.client.place.ContactPlace;
import com.gwt.seminar.client.place.HomePlace;
import com.gwt.seminar.client.place.LocationPlace;
import com.gwt.seminar.client.place.ResourcesPlace;
import com.gwt.seminar.client.place.RsvpPlace;


/* This is the Main Mapper that tells the ActivityManager
 * which Activity to load given a particular Place. */
public class MainActivityMapper implements ActivityMapper {
	
	/* I am going to use Gin Dependency Injection to Inject 
	 * my dependencies. Therefore, I am going to declare each
	 * dependency as a class varialbe.
	 * 
	 *  And then I will just declare all the dependencies in the constructor
	 *  and annotate it with @Inject and Gin will take care of the rest */
	
	private HomeActivity homeActivity;
	private RsvpActivity rsvpActivity;
	private AboutActivity aboutActivity;
	private ContactActivity contactActivity;
	private LocationActivity locationActivity;
	private ResourcesActivity resourcesActivity;
	
	@Inject 
	public MainActivityMapper(HomeActivity homeActivity, RsvpActivity rsvpActivity, AboutActivity aboutActivity,
								ContactActivity contactActivity, LocationActivity locationActivity, ResourcesActivity resourcesActivity){
		this.homeActivity = homeActivity;
		this.rsvpActivity = rsvpActivity;
		this.aboutActivity = aboutActivity;
		this.contactActivity = contactActivity;
		this.locationActivity = locationActivity;
		this.resourcesActivity = resourcesActivity;
		// Remember Gin will either look at our AppInjectorModule to get
		// the correct Implementation of wht ever class it needs or just
		// call GWT.create on the class
		
	}

	public Activity getActivity(Place place) {
		// there are other ways of doing this
		// but just check the instnaces and return
		// the appropriate Activity
		if(place instanceof HomePlace){
			return homeActivity;
		}
		
		if(place instanceof RsvpPlace){
			return rsvpActivity;
		}
		
		if(place instanceof AboutPlace){
			return aboutActivity;
		}
		
		if(place instanceof ContactPlace){
			return contactActivity;
		}
		
		if(place instanceof LocationPlace){
			return locationActivity;
		}
		
		if(place instanceof ResourcesPlace){
			return resourcesActivity;
		}
				
		// well I guess we didn't know the place
		// return null
		return null;
	}
	

}
