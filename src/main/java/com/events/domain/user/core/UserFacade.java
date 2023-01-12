package com.events.domain.user.core;

import com.events.domain.user.core.model.AddUserCommand;
import com.events.domain.user.core.model.EmailAddress;
import com.events.domain.user.core.model.User;
import com.events.domain.user.core.model.UserIdentifier;
import com.events.domain.user.core.ports.incoming.AddNewUser;
import com.events.domain.user.core.ports.outpoing.UserDatabase;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserFacade implements AddNewUser {

    private final UserDatabase database;

    @Override
    public UserIdentifier handle(AddUserCommand addUserCommand) {
        User user = new User(
                new EmailAddress(addUserCommand.getEmail()),
                addUserCommand.getFirstName(),
                addUserCommand.getLastName()
        );
        return database.save(user);
    }
}
