package RevisaoImpressao;

import java.util.Scanner;

public class RevisaoIfElse {

	public static void main(String[] args) {
		java.util.Scanner leitor = new Scanner(System.in);
		int numero1 = 0;
		int numero2 = 0;
		System.out.println("Insira um valor inteiro para o numero 1: ");
		numero1 = leitor.nextInt();
		System.out.println("Insira um valor inteiro para o numero 2: ");
		numero2 = leitor.nextInt();
		
		if(numero1 > numero2){
			System.out.println("Numero 1 maior que numero 2");
		}
		else if(numero1 < numero2){
			System.out.println("Numero 2 maior que numero 1");
		}
		if(numero1 == numero2){
			System.out.println("Numero 1 igual ao numero 2");
		}
		else if(numero1 != numero2){
			System.out.println("Numero 1 diferente do numero 2");
		}

}
}
