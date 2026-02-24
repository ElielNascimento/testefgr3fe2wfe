package com.bn.school.services;

import com.bn.school.models.AlunoModel;
import com.bn.school.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public List<AlunoModel> findAll(){
        return  alunoRepository.findAll();
    }

    public AlunoModel criar (AlunoModel alunoModel){
        return  alunoRepository.save(alunoModel);
    }



}
