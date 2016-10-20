package avaliaçao;

import java.util.Scanner;

public class MainApp2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] i=new String[5];
		 i [0] ="camisa";
		 i [1] ="bermuda";
		 i [2] ="calça";
		 i [3] ="biquini";
		 i [4] ="sunga";
		 System.out.println("========MENU DE OPÇOES========");
		 System.out.println("Para poder pesquisar atraves do codigo do produto digite 1.");
		 System.out.println("\nPara poder pesquisar atraves do nome do produto digite 2. ");
		 System.out.println("\nPara sair do programa digite 3.");
		 System.out.println("\n1. Pesquisar codigo");
		 System.out.println("\n2. Pesquisar nome do produto");
		 System.out.println("\n3. Sair do programa");
		 int valor = s.nextInt();
		 switch (valor){
		 case 1:
			 System.out.println("\npesquisar atraves do codigo");
			 System.out.println("\n digite o codigo do produto de 0 a 4 ");
			 int a = s.nextInt();
			System.out.println(" o nome do produto e "+i[a]+":");
					
			break;
		case 2:
			System.out.println("\npesquisar atraves do nome ");
			 System.out.println("digite o nome do produto");
			 String b = s.next();
			 for (int j = 0; j < i.length; j++) {
				if (i[j].equals(b)){
					System.out.println("o codigo do produto e " +j);
				}	
			}
			break;
		default:
			System.out.println("sair do programa");
			break;
		 }	
		 
	}
	
}


