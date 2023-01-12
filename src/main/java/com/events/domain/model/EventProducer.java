package com.events.domain.model;

public interface EventProducer {

    void publish(Event event);

}
