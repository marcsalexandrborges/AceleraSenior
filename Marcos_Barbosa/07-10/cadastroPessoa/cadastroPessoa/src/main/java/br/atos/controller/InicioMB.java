package br.atos.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "inicio")
public class InicioMB {
	
	public String cadastrarPessoa() {
		
		return "crudpessoa.xhtml";
	}
	
	public String cadastrarProfessor() {
		
		return "crudprofessor.xhtml";
		
	}
	
	public String cadastrarEstudante() {
		
		return "crudestudante.xhtml";
		
	}
	
	public String cadastrarEndereco() {
		
		return "crudendereco.xhtml";
		
	}
	
}
