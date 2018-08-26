package br.com.api.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.Length;

/**
 * @author iago
 */

@Entity(name = "Categoria")
public class Categoria implements Serializable {

    private static final long serialVersionUID = 988505469701778830L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    @Length(min = 2, max = 50, message = "Descrição deve conter entre 2 e 50 caracteres.")
    private String descricao;

    @OneToMany(mappedBy = "categoria", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Subcategoria> subcategoria;

    public String getDescricao() {
	return descricao;
    }

    public void setDescricao(String descricao) {
	this.descricao = descricao;
    }

    public List<Subcategoria> getSubcategoria() {
	return subcategoria;
    }

    public void setSubcategoria(List<Subcategoria> subcategoria) {
	this.subcategoria = subcategoria;
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

}
