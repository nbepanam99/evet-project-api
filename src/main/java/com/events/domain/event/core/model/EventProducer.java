package com.events.domain.event.core.model;

public interface EventProducer {

    void publish(Event event);

}
