package gen_vetores_matrizes;

import java.util.Scanner;

public class ex_3 {
	
	public static void main (String[] args)
	{
		int matriz[][] = new int [3][3], cont=0; 
		Scanner read = new Scanner (System.in);
		

		
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j ++)
			{
				System.out.printf("%nDigite um valor para posição [%d][%d] da matriz: %n", i+1, j+1);
				matriz[i][j] = read.nextInt();
				
				if (matriz[i][j] > 10)
				{
					cont++;
				}
		}
	}
		System.out.println("A matriz digitada foi ");
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j ++)
			{
				System.out.print(" | "+matriz[i][j]+"");
				if (j == 2)
				{
					System.out.print(" | \n");
				}
			}
		}
		System.out.printf("E ela possui %d valores maiores que 10 ",cont);
		read.close();
	}
}
