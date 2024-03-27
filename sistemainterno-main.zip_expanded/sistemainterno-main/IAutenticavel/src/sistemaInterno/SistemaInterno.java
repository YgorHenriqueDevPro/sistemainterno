package sistemaInterno;

public class SistemaInterno {
	public static void main(String args[]) {
		Gerente gerente = new Gerente();
		Diretor diretor = new Diretor();
		
		String loginGer = Teclado.lerString("Digite seu login:")
		gerente.
		int senhaGer = Teclado.lerInteiro("Informe a senha do gerente:");
		gerente.autentica(senhaGer);
		int senhaDir = Teclado.lerInteiro("Informe a senha do diretor");
		diretor.autentica(senhaDir);
	}
}
