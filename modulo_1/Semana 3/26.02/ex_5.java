package gen_repeticao;

import java.util.Scanner;

public class ex_5 {
	public static void main (String[] args) 
	{
		int num, soma=0;
		Scanner ler = new Scanner(System.in);
		
		do
		{
			System.out.println("Digite um número: ");
			num = ler.nextInt();
			
			soma = num + soma;
			
		}while(num != 0);
		
		System.out.printf("A soma dos números é %d", soma);
		
		ler.close();
	}
	
}
