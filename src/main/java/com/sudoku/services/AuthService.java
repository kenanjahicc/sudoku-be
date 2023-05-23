package com.sudoku.services;

import com.sudoku.models.SimpleUser;
import com.sudoku.models.entities.UserEntity;
import com.sudoku.repositories.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class AuthService implements UserDetailsService {

    private final UserRepository userRepository;
    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        UserEntity user = getFullUserByUsername(userName);
        // todo !!!
        user = new UserEntity();
        user.setUsername("heyyou");
        user.setPassword("$2a$12$EgZR0vmDaI1u6kv/ePZMG.Mq4gLMIkRagfZVhFLx8gP54XuTyuuwq"); // samsung

        return new org.springframework.security.core.userdetails.User(user.getUsername(),
                user.getPassword(), Collections.emptyList());
    }

    public SimpleUser getUserByUsername(String userName) {
        getFullUserByUsername(userName); // user exists?
        return new SimpleUser(userName);
    }

    private UserEntity getFullUserByUsername(String userName) {
        return userRepository.findFirstByUsername(userName);
    }
}
