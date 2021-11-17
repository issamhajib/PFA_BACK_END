package com.example.pfa2021.controller;

import com.example.pfa2021.entities.Alternative;
import com.example.pfa2021.entities.Criter;
import com.example.pfa2021.repository.AlternativeRepository;
import com.example.pfa2021.repository.ProjetAhpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("alternatives")
public class AlternativeController {

    @Autowired
    private AlternativeRepository alternativeRepository;

    @GetMapping("/all")
    public List<Alternative> findAll(){return alternativeRepository.findAll(); }

    @PostMapping("/save")
    public Alternative save(@RequestBody Alternative alternative) {
        return alternativeRepository.save(alternative);
    }


}
