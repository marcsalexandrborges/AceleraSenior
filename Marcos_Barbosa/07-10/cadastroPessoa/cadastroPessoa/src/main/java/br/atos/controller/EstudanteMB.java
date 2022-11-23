package br.atos.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.atos.model.Estudante;

@ManagedBean(name = "estudante")
@SessionScoped
public class EstudanteMB {
	
	private String turmaBean;
	private Double mediaBean;
	private List<Estudante>estudantes = new ArrayList<>();
	
	public String salvarEstudante() {
		Estudante estudante = new Estudante();
		estudante.setTurma(turmaBean);
		estudante.setMedia(mediaBean);
		
		estudantes.add(estudante);
		
		return"";
		
	}
	
	public List<Estudante> getEstudantes() {
		return estudantes;
	}
	
	public void setEstudantes(List<Estudante> estudantes) {
		this.estudantes = estudantes;
	}

	public String getTurmaBean() {
		return turmaBean;
	}

	public void setTurmaBean(String turmaBean) {
		this.turmaBean = turmaBean;
	}

	public Double getMediaBean() {
		return mediaBean;
	}

	public void setMediaBean(Double mediaBean) {
		this.mediaBean = mediaBean;
	
	
	}

}
