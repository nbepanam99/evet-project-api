package com.events.domain.model;

import java.time.LocalDateTime;

public record Event(
        EventId eventId,
        LocalDateTime dateTime,
        String name,
        Address address,
        String description) {


    public static final class EventBuilder {
        private EventId eventId;
        private LocalDateTime dateTime;
        private String name;
        private Address address;
        private String description;

        private EventBuilder() {
        }

        public static EventBuilder anEvent() {
            return new EventBuilder();
        }

        public EventBuilder withEventId(EventId eventId) {
            this.eventId = eventId;
            return this;
        }

        public EventBuilder withDateTime(LocalDateTime dateTime) {
            this.dateTime = dateTime;
            return this;
        }

        public EventBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public EventBuilder withAddress(Address address) {
            this.address = address;
            return this;
        }

        public EventBuilder withDescription(String description) {
            this.description = description;
            return this;
        }

        public Event build() {
            return new Event(eventId, dateTime, name, address, description);
        }
    }
}
