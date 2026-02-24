package com.bn.school.controllers;

import com.bn.school.models.AlunoModel;
import com.bn.school.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/pessoas")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public List<AlunoModel> findAll(){
        return  alunoService.findAll();
    }

    @PostMapping
    public AlunoModel criar (@RequestBody AlunoModel alunoModel){
        return alunoService.criar(alunoModel);
    }



}
