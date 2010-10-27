package com.gwt.seminar.client.activity;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.StackLayoutPanel;
import com.google.gwt.user.client.ui.StackPanel;
import com.google.inject.Inject;
import com.gwt.seminar.client.view.ResourcesView;
import com.gwt.seminar.client.view.resources.GwtLinks;
import com.gwt.seminar.client.view.resources.OtherLinks;
import com.gwt.seminar.client.view.resources.SampleCode;
import com.gwt.seminar.client.view.resources.Videos;

public class ResourcesActivity extends AbstractActivity {
	// ResourceView is our containing UiBinder widget
	private ResourcesView view;
	
	// Below are the UiBinder widgets that we are going 
	// to insert into the StackPanel
	private SampleCode sampleCode;
	private Videos videos;
	private GwtLinks gwtLinks;
	private OtherLinks otherLinks;
	private StackPanel stackPanel;
	
	@Inject
	public ResourcesActivity(ResourcesView view, SampleCode sampleCode, Videos videos,
								GwtLinks gwtLinks, OtherLinks otherLinks){
		this.view = view;
		this.sampleCode = sampleCode;
		this.videos = videos;
		this.gwtLinks = gwtLinks;
		this.otherLinks = otherLinks;
		
		/* I injected the views so we can take full advantage of DI
		 * And also so I don't have to worry about not creating the 
		 * views twice. Now the view widgets are only created once 
		 * and then they are reused.
		 * 
		 * I Also go ahead and tie everything into the StackPanel
		 * (Which I'm not sure if I'm using correctly...)
		 * so the full StackPanel is just reused each time
		 * someone visits the Resources Place */
		
		stackPanel = new StackPanel();
		stackPanel.add(sampleCode, "Sample Code");
		stackPanel.add(videos, "Videos");
		stackPanel.add(gwtLinks, "GWT Links");
		stackPanel.add(otherLinks, "Other Links");
		stackPanel.setWidth("100%");
		stackPanel.setHeight("400px");
		
		/* Abstracting everything out into a a new view package (client.view.resources)
		 * may be over kill for this but it shows one way of organizing 
		 * you project.  */
	}
	
	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {		
		view.getContent().add(stackPanel);		
		panel.setWidget(view.asWidget());
	}

}
