package br.com.api.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.entidades.Categoria;
import br.com.api.responses.Response;
import br.com.api.services.CategoriaService;

@RestController
@RequestMapping("/api/categoria")
public class CategoriaController {

    private final CategoriaService categoriaService;

    @Autowired
    public CategoriaController(CategoriaService categoriaService) {
	this.categoriaService = categoriaService;
    }

    @PostMapping
    public ResponseEntity<Response<Categoria>> cadastrar(@Valid @RequestBody Categoria categoria,
	    BindingResult result) {

	Response<Categoria> response = new Response<Categoria>();

	if (result.hasErrors()) {
	    result.getAllErrors().forEach(error -> response.getErrors().add(error.getDefaultMessage()));
	    return ResponseEntity.badRequest().body(response);
	}

	categoriaService.inserir(categoria);
	response.setData(categoria);
	return ResponseEntity.ok(response);

    }

}
