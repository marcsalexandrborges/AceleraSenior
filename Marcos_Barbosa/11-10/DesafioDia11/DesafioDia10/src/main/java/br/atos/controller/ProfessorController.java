package br.atos.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.atos.model.Professor;

@ManagedBean(name = "professorBean")
@SessionScoped
public class ProfessorController {
	
List<Professor> professores = new ArrayList<>();// Cria a lista de Professors 
	
	private Professor professor = new Professor(); // Realiza a chamada do objeto Professors
	
	// Salva o Professor que "chegou" da pagina JSF
	public String salvarProfessor() {
		
		
		
			int valida = professores.indexOf(professor);
			if(valida < 0) {
				professores.add(professor);
			}
		
		limparProfessor();
		return"";
	}
	
	//Inicializa o objeto Professor 
	private void limparProfessor() {
		this.professor = new Professor();

		
	}

	//Deletar Professor
	public String deletarProfessor(Professor professorCad) {
		
		professores.remove(professorCad);
		
		return"";
		
		
	}
	
	//Edita o Professor
	public String editarProfessor( Professor professorCad) {
		professor = professorCad;
		//Professores.remove(professorCad);
		
		return"";
		
	}
	

	public List<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	private boolean salvarProfessorValidar(Professor professorNovo) {
		
		boolean valida = false; 
		
		for (Professor professorLista : professores) {
			if(professorLista == professorNovo) {
				valida = true;
			}
			
		}
		return valida;
		
	}
	
	
}


