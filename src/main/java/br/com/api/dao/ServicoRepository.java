package br.com.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.entidades.Servico;

public interface ServicoRepository extends JpaRepository<Servico, Long> {

}
