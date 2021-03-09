package gen_condicionais;

import java.util.*;

public class ex_4 {

	public static void main (String[] args) 
	{
		
		double num, total;
		Scanner read = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		num = read.nextInt();
		
		total = num%2;
		
		if (total == 0) 
		{
			total = 0;
			
			total = Math.sqrt(num);
			
			System.out.println("O número "+Math.round(num)+" é par e sua raiz quadrada é "+total);	
		}
		else 
		{
			total = 0;
			
			total = Math.pow(num, 2);
			
			System.out.println("O número "+Math.round(num)+" é impar e o resultado de sua potência ao quadrado é "+total);	
		}
		
		read.close();
	}
}
