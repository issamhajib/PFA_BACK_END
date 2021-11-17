package com.example.pfa2021.controller;


import com.example.pfa2021.entities.SousCriter;
import com.example.pfa2021.repository.SousCriterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("souscriters")
public class SousCriterController {

    @Autowired
    private  SousCriterRepository sousCriterRepository ;

    @GetMapping("/all")
    public List<SousCriter> findAll(){return sousCriterRepository.findAll(); }

    @PostMapping("/save")
    public SousCriter save(@RequestBody SousCriter sousCriter) {
        return sousCriterRepository.save(sousCriter);
    }



}
