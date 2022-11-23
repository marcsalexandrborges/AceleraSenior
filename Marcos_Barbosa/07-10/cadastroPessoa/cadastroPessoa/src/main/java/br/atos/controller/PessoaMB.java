package br.atos.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.atos.model.Pessoa;

@ManagedBean(name = "pessoa")// Apelido da manageBean que será utilizado na JSF page
@SessionScoped //Mantem os dados da ManageBean na memoria do servidor
public class PessoaMB {

	//Variaveis que irão interagir com a pagina JSF
	private String nomeBean;
	private String cpfBean;
	private String enderecoBean;
	private List<Pessoa> pessoas = new ArrayList<>();
		
	//Metodo,
	public String metodoTeste() {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(nomeBean);
		pessoa.setCpf(cpfBean);
		pessoa.setEndereco(enderecoBean);
		
		pessoas.add(pessoa);
		
		
		
		return "";
	}
	
	
	

	public List<Pessoa> getPessoas() {
		return pessoas;
	}



	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}





	public String getNomeBean() {
		return nomeBean;
	}

	public void setNomeBean(String nomeBean) {
		this.nomeBean = nomeBean;
	}

	public String getCpfBean() {
		return cpfBean;
	}

	public void setCpfBean(String cpfBean) {
		this.cpfBean = cpfBean;
	}

	public String getEnderecoBean() {
		return enderecoBean;
	}

	public void setEnderecoBean(String enderecoBean) {
		this.enderecoBean = enderecoBean;
	}

}
