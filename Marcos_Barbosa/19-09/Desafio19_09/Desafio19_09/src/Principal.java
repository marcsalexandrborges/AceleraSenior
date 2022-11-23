
public class Principal {

	public static void main(String [] args){
		
		Aluno x1 = new Aluno ("282.408.798-61", "Marcos");
		
		x1.setTurma("Acelera Senior");
		
		System.out.println("Cpf:" + x1.cpf);
		System.out.println("Nome:" + x1.nome);
		
		System.out.println("Turma:" + x1.getTurma());
		
		Professor a1 = new Professor ("345.279.567-23", "Luciano");
		
		System.out.println("#########################");
		
		System.out.println("Cpf:" + a1.cpf);
		System.out.println("Nome:" + a1.nome);
		

		
		
		
	}
}








