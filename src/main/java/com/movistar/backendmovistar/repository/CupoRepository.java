package com.movistar.backendmovistar.repository;

import com.movistar.backendmovistar.model.Cupo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CupoRepository extends JpaRepository<Cupo, Long> {

  @Query("SELECT c.mobileNumber FROM Cupo c")
  List<Long> findAllMobileNumbers();

}