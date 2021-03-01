package gen_vetores_matrizes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex_4 {
	public static void main (String[] args)
	{
		int matriz1[][] = new int [3][3], matriz2[][] = new int [3][3], somar[][] = new int [3][3], subtrair[][] = new int [3][3], escolha_usuario=0, pi=0, pj=0, const1=0; 
		Scanner read = new Scanner (System.in);
		
		System.out.printf("Digite a primeira matriz");
		for (int i = 0; i < 2; i++)
		{
			for (int j = 0; j < 2; j ++)
			{
				System.out.printf("%nDigite um valor para posição [%d][%d] da primeira matriz: %n", i+1, j+1);
				matriz1[i][j] = read.nextInt();	
				}
			}
		for (int i = 0; i < 2; i++)
		{
			for (int j = 0; j < 2; j ++)
			{
				System.out.printf("%nDigite um valor para posição [%d][%d] da segunda matriz: %n", i+1, j+1);
				matriz2[i][j] = read.nextInt();	
				}
			}
		
		do{
			
			Map<String, String> dict_menu = new HashMap <String, String>();
			dict_menu.put("1", new String("Somar as duas matrizes"));
			dict_menu.put("2", new String("Subtrair a primeira matriz da segunda"));
			dict_menu.put("3", new String("Adicionar uma constante as duas matrizes"));
			dict_menu.put("4", new String("Imprimir as matrizes"));
			
			for (String key : dict_menu.keySet()) 
			{
				String value = dict_menu.get(key);
		        System.out.println(key + " - " + value);
			}
			
			System.out.println("Escolha uma opção para continuar: ");
			escolha_usuario = read.nextInt();
			
		} while(escolha_usuario < 1 || escolha_usuario > 4);
		
		if (escolha_usuario == 1)
		{
			System.out.println("A soma das matrizes é: ");
			for (int i = 0; i < 2; i++)
			{
				for (int j = 0; j < 2; j ++)
				{
					somar[i][j]  = matriz1[i][j] + matriz2[i][j];	
					System.out.print("|"+somar[i][j]+"|");
					if (j == 1)
					{
						System.out.print("\n");
					}
				}
			}
			
		}
		if (escolha_usuario == 2)
		{
			for (int i = 0; i < 2; i++)
			{
				for (int j = 0; j < 2; j ++)
				{
					subtrair[i][j]  = matriz1[i][j] - matriz2[i][j];
					System.out.print("|"+subtrair[i][j]+"|");
					if (j == 1)
					{
						System.out.print("\n");
					}
				}
			}

		}		
		if (escolha_usuario == 3)
		{
			System.out.println("\nDigite uma posição para adicionar uma constante [i][ ]");
			pi = read.nextInt();
			System.out.println("\nDigite uma posição para adicionar uma constante [ ][j]");
			pj= read.nextInt();
			
			for (int i = 0; i < 2; i++)
			{
				for (int j = 0; j < 2; j ++)
				{
					
					if (pi == i+1 && pj == j+1) {
						System.out.printf("%nDigite um valor matriz 1 na posição selecionada [%d][%d]%n",pi,pj);
						const1 = read.nextInt();		
						
						matriz1[i][j] = const1 + matriz1[i][j];
						matriz2[i][j] = const1 + matriz2[i][j];
						
					}
				}
			}
			System.out.println("\nAgora sua matriz 1 é ");
			for (int i = 0; i < 2; i++)
			{
				for (int j = 0; j < 2; j ++)
				{
					System.out.print("|"+matriz2[i][j]+"|");
					if (j == 1)
					{
						System.out.print("\n");
					}
					
				}
			}	
			System.out.println("\nAgora sua matriz 2 é ");
			for (int i = 0; i < 2; i++)
			{
				for (int j = 0; j < 2; j ++)
				{
					System.out.print("|"+matriz2[i][j]+"|");
					if (j == 1)
					{
						System.out.print("\n");
					}
					
				}
			}	
			if (escolha_usuario == 4) 
			{
				for (int i = 0; i < 2; i++)
				{
					for (int j = 0; j < 2; j ++)
					{
						System.out.print("|"+matriz1[i][j]+"|");
						if (j == 1)
						{
							System.out.print("\n");
						}
					}
				}	
				
				for (int i = 0; i < 2; i++)
				{
					for (int j = 0; j < 2; j ++)
					{
						System.out.print("|"+matriz2[i][j]+"|");
						if (j == 1)
						{
							System.out.print("\n");
						}
					}
				}	
			}
		}
		read.close();
	}
}
