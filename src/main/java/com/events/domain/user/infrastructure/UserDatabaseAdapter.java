package com.events.domain.user.infrastructure;

import com.events.domain.user.core.model.User;
import com.events.domain.user.core.model.UserIdentifier;
import com.events.domain.user.core.ports.outpoing.UserDatabase;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserDatabaseAdapter implements UserDatabase {

    private final UserRepository userRepository;

    @Override
    public UserIdentifier save(User user) {
        User savedUser = userRepository.save(user);
        return new UserIdentifier(savedUser.getId());
    }
}
