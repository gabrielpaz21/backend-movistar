package com.movistar.backendmovistar.repository;

import com.movistar.backendmovistar.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByName(String name);

}