package br.com.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.dao.ServicoRepository;
import br.com.api.dto.ServicoDTO;
import br.com.api.entidades.Servico;

@Service
public class ServicoService {

    private final ServicoRepository servicoRepository;

    @Autowired
    ServicoService(ServicoRepository servicoRepository) {
	this.servicoRepository = servicoRepository;
    }

    public String testarService() {

	return "PAULO VIADO ARROMABADO PAU NO CÚ";
    }

    public void inserir(ServicoDTO servicoDTO) {
	Servico servico = new Servico();
	servico.setDescricao(servicoDTO.getDescricao());
	servico.setTelefone(servicoDTO.getTelefone());

	servicoRepository.save(servico);
    }

    public List<Servico> getListaServicos() {
	return servicoRepository.findAll();
    }
}
