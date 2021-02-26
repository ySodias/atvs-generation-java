package gen_repeticao;

import java.util.Scanner;

public class ex_3 {
	public static void main (String[] args) 
	{	
		System.out.printf("===== Insira as idades de várias pessoas  ========== %n Obs: O programa só para de pedir idade quando digitar -99 %n");
		int idade=0, cont = 0;
		Scanner read = new Scanner(System.in);
		
		while (idade != -99) {
			cont++;
			System.out.printf("Qual a idade da %dº pessoa? ",cont);
			idade = read.nextInt();
		}
		read.close();
	}
}
