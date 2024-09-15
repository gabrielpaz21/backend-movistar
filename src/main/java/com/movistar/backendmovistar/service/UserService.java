package com.movistar.backendmovistar.service;

import com.movistar.backendmovistar.dto.ResponseDTO;
import com.movistar.backendmovistar.model.User;
import com.movistar.backendmovistar.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<ResponseDTO> findAll() {
        List<User> users = userRepository.findAll();
        return users.stream().flatMap(user ->
                user.getCupos().stream().map(cupo ->
                        new ResponseDTO(
                                user.getName(),
                                cupo.getMobileNumber(),
                                cupo.getBalance(),
                                cupo.getData(),
                                cupo.getPlatform()
                        )
                )
        ).toList();
    }

    public User findByName(String name) {
        return userRepository.findByName(name);
    }

}
