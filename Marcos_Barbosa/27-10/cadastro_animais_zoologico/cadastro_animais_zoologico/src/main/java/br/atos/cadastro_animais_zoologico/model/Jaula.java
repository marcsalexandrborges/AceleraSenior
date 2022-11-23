package br.atos.cadastro_animais_zoologico.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "TB_jaula")
public class Jaula implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToMany
	private List<Cuidador> cuidadores;
	
	private String nomeZoologico;
	private String bloco;
	private int numeroDaJaula;
	
	
	public List<Cuidador> getCuidadores() {
		return cuidadores;
	}
	public void setCuidadores(List<Cuidador> cuidadores) {
		this.cuidadores = cuidadores;
	}
	public String getNomeZoologico() {
		return nomeZoologico;
	}
	public void setNomeZoologico(String nomeZoologico) {
		this.nomeZoologico = nomeZoologico;
	}
	public String getBloco() {
		return bloco;
	}
	public void setBloco(String bloco) {
		this.bloco = bloco;
	}
	public int getNumeroDaJaula() {
		return numeroDaJaula;
	}
	public void setNumeroDaJaula(int numeroDaJaula) {
		this.numeroDaJaula = numeroDaJaula;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
}


