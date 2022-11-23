package br.atos.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.atos.model.Professor;

@ManagedBean(name = "professor")
@SessionScoped
public class ProfessorMB {
	
	private String disciplinaBean;
	private Double salarioBean;
	
	
	private List<Professor> professores = new ArrayList<>();
	
	public String salvarProfessor() {
		Professor professor = new Professor();
		professor.setDisciplina(disciplinaBean);
		professor.setSalario(salarioBean);
		
		
		professores.add(professor);
		
		return"";
	}
	
	public List<Professor> getProfessores() {
		return professores;
	}


	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}


	public String getDisciplinaBean() {
		return disciplinaBean;
	}
	public void setDisciplinaBean(String disciplinaBean) {
		this.disciplinaBean = disciplinaBean;
	}
	public Double getSalarioBean() {
		return salarioBean;
	}
	public void setSalarioBean(Double salarioBean) {
		this.salarioBean = salarioBean;
	}
	
	

}
