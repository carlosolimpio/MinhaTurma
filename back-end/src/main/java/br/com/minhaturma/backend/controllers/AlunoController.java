package br.com.minhaturma.backend.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.minhaturma.backend.models.Aluno;

@RestController
@RequestMapping("/api/v1/alunos")
public class AlunoController {

    @GetMapping
    public List<Aluno> list() {
        List<Aluno> alunos = new ArrayList<>();
        return alunos;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Aluno aluno) {

    }

    @GetMapping("/{id}")
    public Aluno get(@PathVariable("id") long id) {
        return new Aluno();
    }

}