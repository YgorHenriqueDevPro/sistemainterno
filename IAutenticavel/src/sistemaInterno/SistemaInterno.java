package sistemaInterno;

public class SistemaInterno {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		Diretor diretor = new Diretor();
		Cliente cliente = new Cliente();
		
		String login = Teclado.lerString("Digite o login:");
		int senha = Teclado.lerInteiro("Digite sua senha:");		
	
		gerente.setLogin(login);
			
		gerente.getLogin();
		gerente.setSenha(123);		
		gerente.autentica(senha);	
		
		gerente.getSenha();
		diretor.setLogin("carlos.gay@hotmail.com");
		diretor.setSenha(2442);	
		
		gerente.autentica(senha);
		diretor.autentica(senha);
		
	}

}
