import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
       System.out.println("digite um numero");
       int mes = s.nextInt();
		switch (mes) {
		case 1:
			 System.out.println("o mes e janeiro");
			break;
		case 2:
			System.out.println("o mes e fevereiro ");
			
			break;
		case 3:
			System.out.println("o mes e março");
			break;
		default:
			System.out.println("o mes e invalido");
			break;
		}
		
	}

}
