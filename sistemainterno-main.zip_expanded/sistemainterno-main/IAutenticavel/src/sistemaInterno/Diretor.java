package sistemaInterno;

public class Diretor extends Funcionario implements Autenticavel{
	
	private int senha = 123;
	private String login = "teste";
	
	public boolean autentica(String login, int senha) {		
		if(this.senha != senha && this.login != login) {
			System.out.println("Acesso Negado para o diretor!");
			return false;
		}
		System.out.println("Acesso Permitido para o diretor!");
		return true;		
	}
}
