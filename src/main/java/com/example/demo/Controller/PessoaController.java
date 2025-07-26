package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.PessoaService;

@RestController
public class PessoaController {
    @Autowired
    private PessoaService servico;
    @GetMapping("/saveuser")
    public void save
    (){
       servico.save();
    }
}
