package com.example.pfa2021.controller;

import com.example.pfa2021.entities.Criter;
import com.example.pfa2021.entities.SousCriter;
import com.example.pfa2021.repository.CriterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("criters")
public class CriterController {

    @Autowired
    private CriterRepository criterRepository ;

    @GetMapping("/all")
    public List<Criter> findAll(){return criterRepository.findAll(); }

    @PostMapping("/save")
    public Criter save(@RequestBody Criter criter) {
        return criterRepository.save(criter);
    }

    @GetMapping("/souscriterof/{id}")
    public  List<SousCriter>  getsouscriters(@PathVariable String id ){

        int i = Integer.parseInt(id);
        Criter criter = criterRepository.findById(i);
        return criter.getSousCriters();
    }
}
