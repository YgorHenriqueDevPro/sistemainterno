package sistemaInterno;

public class Gerente extends Funcionario implements Autenticavel{
	protected int senha;
	
	public boolean autentica(int senha) {		
		if(senha == 123) {
			System.out.println("Acesso permitido!");
		}
		return this.senha == senha;
	}
}
