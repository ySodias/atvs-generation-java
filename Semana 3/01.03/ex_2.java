package gen_vetores_matrizes;

import java.util.*;

public class ex_2 
{
	public static void main (String[] args)
	{
		int num[] = new int[6], impar=0, par=0, valor;
		Scanner read = new Scanner (System.in);

		
		for (int x = 0; x < 6; x++)
		{
			System.out.printf("Digite um número para a posição [%d] do vetor %n",x);
			valor = read.nextInt();
			
			num[x] = valor;
		}
		for (int x = 0; x < 6; x++)
		{
			
			if (num[x]%2 == 0) {
				
				par = num[x] + par;
				
				System.out.printf("Na posição [%d] do vetor o número %d é par %n",x,num[x]);
			}
			else{
				impar++;
				System.out.printf("Na posição [%d] do vetor o número %d é impar%n",x,num[x]);
			}
		}
		System.out.printf("%nA soma dos números pares digitados é: %d %n",par);
		System.out.printf("A quantidade de números impares digitados foi: %d",impar);
		read.close();
	}
}
