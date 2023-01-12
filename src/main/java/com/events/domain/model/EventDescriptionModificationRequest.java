package com.events.domain.model;

public record EventDescriptionModificationRequest(EventId eventId, String description) {
}
