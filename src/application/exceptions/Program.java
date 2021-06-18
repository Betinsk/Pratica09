package application.exceptions;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		//ATIVIDADE 01
		/* Scanner sc = new Scanner(System.in);
		System.out.println("Digite dois números: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x < y) {
			throw new ArithmeticException ("O número não pode ser divido");
		}
		System.out.println(x /y);
		sc.close();
	 */
		
		// ATIVIDADE 02
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite dois números: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
	
		Divisao div = new Divisao(x, y);
		System.out.println(div.divisao());
		
		sc.close();
		
		
	}

}
