package com.movistar.backendmovistar.controller;

import com.movistar.backendmovistar.model.Cupo;
import com.movistar.backendmovistar.model.User;
import org.springframework.http.ResponseEntity;
import com.movistar.backendmovistar.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/{name}/cupos/")
    public ResponseEntity<Set<Cupo>> findByMobileNumber(@PathVariable String name) {
        User user = userService.findByName(name);
        return ResponseEntity.ok(user.getCupos());
    }

}
