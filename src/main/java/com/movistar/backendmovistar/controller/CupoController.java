package com.movistar.backendmovistar.controller;

import com.movistar.backendmovistar.service.CupoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cupos")
@RequiredArgsConstructor
public class CupoController {

    private final CupoService cupoService;

    @GetMapping("/mobileNumbers")
    public ResponseEntity<List<Long>> getAllMobileNumbers() {
        List<Long> mobileNumbers = cupoService.findAllMobileNumbers();
        return ResponseEntity.ok(mobileNumbers);
    }

}
