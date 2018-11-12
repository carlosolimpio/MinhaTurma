package br.com.minhaturma.backend.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.minhaturma.backend.models.Aluno;
import br.com.minhaturma.backend.repositorios.RepositorioAlunos;

@RestController
@RequestMapping("/api/v1/alunos")
public class AlunoController {

    @Autowired
    private RepositorioAlunos repositorioAlunos;

    @GetMapping
    public List<Aluno> list() {
        return repositorioAlunos.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Aluno aluno) {
        repositorioAlunos.save(aluno);
    }

    @GetMapping("/{id}")
    public Aluno get(@PathVariable("id") long id) {
        return repositorioAlunos.getOne(id);
    }

}