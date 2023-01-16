package com.events.domain.user.core.model;

import java.util.UUID;

public class UserIdentifier {

    private final UUID id;

    public UserIdentifier(UUID id) {
        this.id = id;
    }

    public UUID getAsLong(){
        return id;
    }
}
