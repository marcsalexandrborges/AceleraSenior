
public class Aluno extends Pessoa{
	
	public String turma;
	public String advertencia;
	
	public Aluno (String _cpf, String _nome){
		super(_cpf, _nome);
	} 
	public String getTurma(){
		return turma;
	}
	
	public void setTurma(String turmaJava){
		this.turma = turmaJava;
		

	}


}


