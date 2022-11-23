package br.atos.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.atos.model.Endereco;

@ManagedBean(name = "endereco")
@SessionScoped
public class EnderecoMB {
	
	private String cidadeBean;
	private String ruaBean;
	private String casaBean;
	private List<Endereco> enderecos = new ArrayList<>();
	
	public String salvarEndereco() {
		Endereco endereco = new Endereco();
		endereco.setCidade(cidadeBean);
		endereco.setRua(ruaBean);
		endereco.setCasa(casaBean);
		
		enderecos.add(endereco);
		
		return "";
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
		
	}
	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	

	public String getCidadeBean() {
		return cidadeBean;
	}

	public void setCidadeBean(String cidadeBean) {
		this.cidadeBean = cidadeBean;
	}

	public String getRuaBean() {
		return ruaBean;
	}

	public void setRuaBean(String ruaBean) {
		this.ruaBean = ruaBean;
	}

	public String getCasaBean() {
		return casaBean;
	}

	public void setCasaBean(String casaBean) {
		this.casaBean = casaBean;
	}
	
}
