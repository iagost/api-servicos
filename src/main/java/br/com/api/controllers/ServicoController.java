package br.com.api.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.dto.ServicoDTO;
import br.com.api.entidades.Servico;
import br.com.api.responses.Response;
import br.com.api.services.ServicoService;

@RestController
@RequestMapping("/api/servico")
public class ServicoController {

    private final ServicoService servicoService;

    @Autowired
    public ServicoController(ServicoService servicoService) {
	this.servicoService = servicoService;
    }

    @GetMapping(value = "/{nome}")
    public String exemplo(@PathVariable("nome") String nome) {
	return "Olá " + servicoService.testarService();
    }

    @PostMapping
    public ResponseEntity<Response<ServicoDTO>> cadastrar(@Valid @RequestBody ServicoDTO servicoDTO,
	    BindingResult result) {
	Response<ServicoDTO> response = new Response<ServicoDTO>();

	if (result.hasErrors()) {
	    result.getAllErrors().forEach(error -> response.getErrors().add(error.getDefaultMessage()));
	    return ResponseEntity.badRequest().body(response);
	}

	servicoService.inserir(servicoDTO);
	response.setData(servicoDTO);

	return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<List<Servico>> getListaServicos() {
	return ResponseEntity.ok(servicoService.getListaServicos());
    }

}
