package sistemaInterno;

public class Cliente extends Funcionario implements Autenticavel {
	protected int senha;
	
	public boolean autentica(int senha){
		return this.senha == senha;		
	}
}
