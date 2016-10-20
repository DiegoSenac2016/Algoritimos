import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("qual a sua idade?");
		Scanner s = new Scanner(System.in);
		int idade = s.nextInt();
		if (idade < 18) {
			System.out.println("você não possui carteira:");
		} else {
			System.out.println("quantos pontos você tem na carteira?");
		}
		int pontosNaCarteira = s.nextInt();
		if (pontosNaCarteira < 20) {
			System.out.println("Pode dirigir");
		} else {
			System.out.println("Não pode dirigir");
		}
		s.close();
		
	}

}
