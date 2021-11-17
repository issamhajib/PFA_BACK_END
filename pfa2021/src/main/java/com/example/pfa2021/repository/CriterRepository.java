package com.example.pfa2021.repository;

import com.example.pfa2021.entities.Criter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CriterRepository extends JpaRepository<Criter,Integer> {

    Criter findById(int i );
}
