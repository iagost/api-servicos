package br.com.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.dao.CategoriaRepository;
import br.com.api.entidades.Categoria;

@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    @Autowired
    public CategoriaService(CategoriaRepository categoriaRepository) {
	this.categoriaRepository = categoriaRepository;
    }

    public void inserir(Categoria categoria) {
	categoriaRepository.save(categoria);
    }

}
