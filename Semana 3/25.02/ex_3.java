package gen_condicionais;

import java.util.*;

public class ex_3 {
	
	public static void main (String[] args) {
		
		
		Scanner read = new Scanner(System.in); 
		int age;
		
		System.out.println("Digite sua idade");
		age = read.nextInt();
		
		
		if (age >= 10 && age <=14) 
		{
			System.out.println("A pessoa está na categoria infantil");
		}
		else if (age >= 15 && age <=17) 
		{
			System.out.println("A pessoa está na categoria juvenil");
		}
		else if (age >= 18 && age <=25) 
		{
			System.out.println("A pessoa está na categoria adulto");
		}
		else 
		{
			System.out.println("A pessoa pertence a uma categoria não listada");
		}
		
		read.close();
	} 
}
