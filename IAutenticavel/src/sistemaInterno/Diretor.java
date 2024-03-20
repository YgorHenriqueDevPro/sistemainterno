package sistemaInterno;

public class Diretor extends Funcionario implements Autenticavel{
	protected int senha;
	
	public boolean autentica(int senha) {
		return this.senha == senha;
	}
}
