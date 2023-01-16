package com.events.infrastructure;

import com.events.domain.user.core.UserFacade;
import com.events.domain.user.core.ports.incoming.AddNewUser;
import com.events.domain.user.core.ports.outpoing.UserDatabase;
import com.events.domain.user.infrastructure.UserDatabaseAdapter;
import com.events.domain.user.infrastructure.UserRepository;
import org.springframework.context.annotation.Bean;

public class UserDomainConfig {

    @Bean
    public UserDatabase userDatabase(UserRepository userRepository){
        return new UserDatabaseAdapter(userRepository);
    }

    @Bean
    public AddNewUser addNewUser(UserDatabase userDatabase){
        return new UserFacade(userDatabase);
    }
}
