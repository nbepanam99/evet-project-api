package com.events.domain.event.core.model;

public record EventDescriptionModificationRequest(EventId eventId, String description) {
}
