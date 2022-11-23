
public class Funcionario {

	private String nome;
	private Double salarioLiquido;
	private String cpf;
	private Double desconto;
	
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalarioLiquido() {
		return salarioLiquido;
	}
	public void setSalario(Double salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Double getDesconto() {
		return desconto;
	}
	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	
	public Double calcularSalarioLiquido(Double horaTrabalhada){
		Double salarioLiquido = 50 * horaTrabalhada  ;
		
		return salarioLiquido;
	}
}
