package com.events.domain.user.core.ports.outpoing;

import com.events.domain.user.core.model.User;
import com.events.domain.user.core.model.UserIdentifier;

public interface UserDatabase {
    UserIdentifier save(User user);
}
