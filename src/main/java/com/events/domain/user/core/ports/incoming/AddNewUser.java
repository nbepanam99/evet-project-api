package com.events.domain.user.core.ports.incoming;

import com.events.domain.user.core.model.AddUserCommand;
import com.events.domain.user.core.model.UserIdentifier;

public interface AddNewUser {
    UserIdentifier handle(AddUserCommand addUserCommand);
}
