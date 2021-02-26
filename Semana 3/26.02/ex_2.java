package gen_repeticao;

import java.util.*;

public class ex_2 {
	public static void main (String[] args)
	{
		System.out.println("=== Calc 10 número ======");
		int x, num = 0, total;
		try (Scanner read = new Scanner(System.in)) {
			for (x = 0; x < 10; x++) {
				System.out.print("Digite o valor do número: \t");
				num = read.nextInt();
				total = num%2;
				
				if (total == 1) 
				{
				System.out.println("O número é impar ");
				System.out.println("\n");
				}
				else 
				{
				System.out.println("O número é par");
				System.out.println("\n");
				}
			}
			read.close();
		}
	}
}
