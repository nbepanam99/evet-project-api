package com.events.domain.repository;

import com.events.domain.model.Event;
import com.events.domain.model.EventId;

import java.util.Optional;

public interface EventRepository {

    Optional<Event> find(EventId eventId);

    void save(Event event);

}
