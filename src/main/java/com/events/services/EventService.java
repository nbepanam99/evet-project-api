package com.events.services;

import com.events.domain.model.Event;

public class EventService {

    public Event getEventByAddress(){

        Event event = new Event.EventBuilder().withName("test").build();

        return event;
    }
    

}
