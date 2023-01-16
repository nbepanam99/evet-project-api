package com.events.services;

import com.events.domain.event.core.model.Event;

public class EventService {

    public Event getEventByAddress(){

        Event event = Event.EventBuilder.anEvent().withName("test").build();

        return event;
    }
    

}
