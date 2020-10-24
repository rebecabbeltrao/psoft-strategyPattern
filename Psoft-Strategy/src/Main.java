import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		Usuario usuario = new Usuario(new CaixaAlta());
		String texto = scanner.nextLine();
		System.out.println(usuario.formataString(texto));
		
		usuario = new Usuario(new CaixaBaixa());
		System.out.println(usuario.formataString(texto));
		
		usuario = new Usuario(new Negrito());
		System.out.println(usuario.formataString(texto));
		
		usuario = new Usuario(new Italico());
		System.out.println(usuario.formataString(texto));
	}
}
