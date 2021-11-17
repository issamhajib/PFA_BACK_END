package com.example.pfa2021.controller;

import com.example.pfa2021.entities.Alternative;
import com.example.pfa2021.entities.Criter;
import com.example.pfa2021.entities.RelationCriter;
import com.example.pfa2021.repository.RelationCriterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("relationCriters")
public class RelationCriterController {

    @Autowired
    private RelationCriterRepository relationCriterRepository ;

    @GetMapping("/all")
    public List<RelationCriter> findAll(){return relationCriterRepository.findAll(); }

    @PostMapping("/save")
    public RelationCriter save(@RequestBody RelationCriter relationCriter) {
        return relationCriterRepository.save(relationCriter);}
}
