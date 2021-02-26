package gen_repeticao;

import java.util.Scanner;

public class ex_6 {
	public static void main (String[] main)
	{
		
		int num, soma=0, mult=0, media=0, cont=0;
		Scanner ler = new Scanner(System.in);
		
		do
		{
			System.out.println("Digite um número: ");
			num = ler.nextInt();
			
			
			mult = num%3;
			
			if (mult == 0) {
				soma = num + soma;
			}
				
			
			cont++;
		}while(num != 0);
		

		media = soma/(cont-1);
		System.out.printf("A media dos números é %d", media);
		
		ler.close();
	}
}
