package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repositories.PessoaRepository;
import com.example.demo.model.Pessoa;

@Service
public class PessoaService {
    @Autowired
    private PessoaRepository repository;
    
    public void save (){
        Pessoa ozzy = new Pessoa();
        ozzy.setName("osbourne");
        ozzy.setIdade(55);
        ozzy.setPeso(70);
        ozzy.setId("test");
        repository.save(ozzy);
        
        
    }
}
