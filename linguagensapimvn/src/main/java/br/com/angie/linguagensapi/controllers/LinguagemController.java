package br.com.angie.linguagensapi.controllers;

import br.com.angie.linguagensapi.entities.Linguagem;
import br.com.angie.linguagensapi.repositories.LinguagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LinguagemController {
    @Autowired
    private LinguagemRepository repository;

    @GetMapping("/linguagens")
    public List<Linguagem> obterLingguagens(){
        List<Linguagem> linguagens = repository.findAll();
        return linguagens;
    }
    @PostMapping("/linguagens")
    public Linguagem cadastrarLinguagem(@RequestBody Linguagem linguagem){
        return repository.save(linguagem);
    }

}
