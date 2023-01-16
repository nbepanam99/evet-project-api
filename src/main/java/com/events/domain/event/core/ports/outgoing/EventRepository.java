package com.events.domain.event.core.ports.outgoing;

import com.events.domain.event.core.model.Event;
import com.events.domain.event.core.model.EventId;

import java.util.Optional;

public interface EventRepository {

    Optional<Event> find(EventId eventId);

    void save(Event event);

}
