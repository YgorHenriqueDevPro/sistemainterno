package sistemaInterno;

public class Gerente extends Funcionario implements Autenticavel {

	private int senha = 132;
	private String login = "teste2";
	public boolean autentica(String login, int senha) {
		if (this.senha != senha && this.login != login) {
			System.out.println("Acesso Negado para o gerente!");
			return false;
		}
		System.out.println("Acesso Permitido para o gerente!");
		return true;		
	}
}
