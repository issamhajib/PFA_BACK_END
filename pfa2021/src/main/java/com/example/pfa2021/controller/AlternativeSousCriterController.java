package com.example.pfa2021.controller;

import com.example.pfa2021.entities.Alternative;
import com.example.pfa2021.entities.SousCriterAlternative;
import com.example.pfa2021.repository.AlternativeSousCriterRepoitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("alternativesSousCriters")
public class AlternativeSousCriterController {

    @Autowired
    private AlternativeSousCriterRepoitory alternativeSousCriterRepoitory ;

    @GetMapping("/all")
    public List<SousCriterAlternative> findAll(){return alternativeSousCriterRepoitory.findAll(); }

    @PostMapping("/save")
    public SousCriterAlternative save(@RequestBody SousCriterAlternative sousCriterAlternative) {
        return alternativeSousCriterRepoitory.save(sousCriterAlternative);}

}
