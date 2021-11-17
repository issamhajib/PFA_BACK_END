package com.example.pfa2021.controller;

import com.example.pfa2021.entities.RelationCriter;
import com.example.pfa2021.entities.RelationSousCriter;
import com.example.pfa2021.repository.RelationSousCriterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("relationSousCriters")
public class RelationSousCriterController {

    @Autowired
    private RelationSousCriterRepository relationSousCriterRepository ;

    @GetMapping("/all")
    public List<RelationSousCriter> findAll(){return relationSousCriterRepository.findAll(); }

    @PostMapping("/save")
    public RelationSousCriter save(@RequestBody RelationSousCriter relationSousCriter) {
        return relationSousCriterRepository.save(relationSousCriter);}
}
