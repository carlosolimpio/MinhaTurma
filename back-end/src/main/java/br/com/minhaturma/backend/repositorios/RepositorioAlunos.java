package br.com.minhaturma.backend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.minhaturma.backend.models.Aluno;

public interface RepositorioAlunos extends JpaRepository<Aluno, Long> {

}