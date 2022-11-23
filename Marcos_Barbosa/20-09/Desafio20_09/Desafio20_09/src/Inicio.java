import java.util.Scanner;

public class Inicio{
	
	public static void main(String [] args){
	
		Usuario usuario = new Usuario();
		String nomeDigitado;
		String senhaDigitada;
		
		String opcaoMenu = null;
		
		Scanner entradaDados = new Scanner (System.in); // Objeto criado para receber dados atraves do console.
		
		Gerente gerente = new Gerente();
		Coordenador coordenador = new Coordenador();
		
		System.out.println("Digite o Usuario:");
		nomeDigitado  = entradaDados.next();
		System.out.println("Digite a sua Senha:");
		senhaDigitada = entradaDados.next();
		
		if(nomeDigitado.equals(usuario.getNome()) && senhaDigitada.equals(usuario.getSenha())){
			System.out.println("Login realizado com Sucesso!!!");
			System.out.println("Digite 1 para o gerente:");
			System.out.println("Digite 2 para o coordenador:");
			opcaoMenu = entradaDados.next();
			
			
			if(opcaoMenu.equals("1") || opcaoMenu.equals("2") ){
				System.out.println("Opcao correta");
				
				switch(opcaoMenu){
					
					case "1":
						
						//Estou Recebendo os dados atraves do console e armazenando no objeto gerente
						System.out.println("Digite o nome:");
							gerente.setNome(entradaDados.next());
						System.out.println("Digite a hora Trabalhada:");
							gerente.calcularSalarioLiquido(gerente.calcularSalarioLiquido(Double.parseDouble(entradaDados.next())));
						System.out.println("Digite a regional :");
							gerente.setRegional(opcaoMenu);
						System.out.println("Digite a metaRegional:");
							gerente.setRegional(entradaDados.next());
							
						// Apresenta os dados no Controller
						System.out.println("Digite do gerente:" + gerente.getNome());
						System.out.println("Salario do gerente:" + gerente.getSalarioLiquido());
						System.out.println("Regional:" + gerente.getRegional());
						System.out.println("MetaRegional:" + gerente.getMetaRegional());
								
							
					break;
					
					
					case "2":
						System.out.println("Digite o nome:");
						    coordenador.setNome(entradaDados.next());
						System.out.println("Digite a hora Trabalhada:");
							coordenador.setSalario(coordenador.calcularSalarioLiquido(Double.parseDouble(entradaDados.next())));
						System.out.println("Digite a Loja:");
							coordenador.setLoja(entradaDados.next());
						System.out.println("Digite a MetaDaLoja:");
							coordenador.setLoja(entradaDados.next());
							
						// Apresenta os dados no Controller
						System.out.println("Nome do cooerdenador:" + coordenador.getNome());
						System.out.println("Salario do coordenador:" + coordenador.getSalarioLiquido());
						System.out.println("Nome da Loja:" + coordenador.getLoja());
						System.out.println("Meta da Loja:" + coordenador.getMetaDaLoja());
						
					
					break;
								
	
					
				}
				
				
				
			}else{
				
				System.out.println("Opcao incorreta");
				
				
			}
			
		}else{
			
			
			
			if(nomeDigitado.equals(usuario.getNome()) || senhaDigitada.equals(usuario.getSenha())){
				if(nomeDigitado.equals(usuario.getNome())){
					System.out.println("Nome esta Correto mas  a senha esta Incorreta!!");	
				}
				if(senhaDigitada.equals(usuario.getSenha())){
					System.out.println("Senha esta Correta mas  o nome esta Incorreto!!");	
				}
				
			}else{
				System.out.println("Nome e senha Incorretos!!!");
				
			}
			
		}
		
			
	}
	
}	