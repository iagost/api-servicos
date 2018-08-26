package br.com.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.entidades.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
