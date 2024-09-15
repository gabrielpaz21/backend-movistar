package com.movistar.backendmovistar.service;

import com.movistar.backendmovistar.model.User;
import com.movistar.backendmovistar.repository.CupoRepository;
import com.movistar.backendmovistar.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CupoService {

    private final CupoRepository cupoRepository;

    public CupoService(CupoRepository cupoRepository) {
        this.cupoRepository=cupoRepository;
    }

    public List<Long> findAllMobileNumbers() {
        return cupoRepository.findAllMobileNumbers();
    }

}
