package br.com.api.dto;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

public class ServicoDTO {

    private Long id;
    @NotEmpty(message = "A descrição do serviço não pode ser vazia.")
    @Length(min = 10, max = 400, message = "Descrição deve conter entre 10 e 400 caracteres.")
    private String descricao;
    @NotEmpty(message = "O telefone para contato não pode ser vazio.")
    private String telefone;
    private String email;
    private String valor;
    private String endereco;
    @NotEmpty(message = "o id do serviço não pode ser vazio.")
    private Long idSubcategoria;
    @NotEmpty(message = "o id do usuário não pode ser vazio.")
    private Long idUsuario;

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getDescricao() {
	return descricao;
    }

    public void setDescricao(String descricao) {
	this.descricao = descricao;
    }

    public String getTelefone() {
	return telefone;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public String getValor() {
	return valor;
    }

    public void setValor(String valor) {
	this.valor = valor;
    }

    public String getEndereco() {
	return endereco;
    }

    public void setEndereco(String endereco) {
	this.endereco = endereco;
    }

    public Long getIdSubcategoria() {
	return idSubcategoria;
    }

    public void setIdSubcategoria(Long idSubcategoria) {
	this.idSubcategoria = idSubcategoria;
    }

    public Long getIdUsuario() {
	return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
	this.idUsuario = idUsuario;
    }

    public void setTelefone(String telefone) {
	this.telefone = telefone;
    }

    @Override
    public String toString() {
	return "ServicoDTO [id=" + id + ", descricao=" + descricao + ", telefone=" + telefone + "]";
    }

}
