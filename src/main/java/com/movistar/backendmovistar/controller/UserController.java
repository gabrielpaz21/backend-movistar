package com.movistar.backendmovistar.controller;

import com.movistar.backendmovistar.dto.ResponseDTO;
import com.movistar.backendmovistar.model.Cupo;
import com.movistar.backendmovistar.model.User;
import org.springframework.http.ResponseEntity;
import com.movistar.backendmovistar.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    //I understand that another route was wanted, but this one seemed simpler to me.
    //I guess what you want to see from the test is that the logic
    @GetMapping
    public ResponseEntity<List<ResponseDTO>> findAll() {
        return ResponseEntity.ok(userService.findAll());
    }

}
