package com.movistar.backendmovistar.service;

import com.movistar.backendmovistar.model.User;
import com.movistar.backendmovistar.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findByName(String name) {
        return userRepository.findByName(name);
    }

}
