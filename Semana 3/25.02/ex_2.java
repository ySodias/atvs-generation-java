package gen_condicionais;

import java.util.Scanner;

public class ex_2 {
	
	public static void main (String[] args) {
		
		System.out.println("========= Digite 3 números e os colocarei em ordem crescente ========= \n");
		
		int num1, num2, num3;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite o valor no primeiro número ");
		num1 = read.nextInt();
		
		System.out.println("Digite o valor no segundo número ");
		num2 = read.nextInt();
		
		System.out.println("Digite o valor no terceiro número ");
		num3 = read.nextInt();
		 
		if(num1 < num2 && num1 < num3) 
		{
			if (num2 < num3) {
				System.out.println("A ordem crescente dos número é "+num1+", "+num2+" e "+num3);
			}
			else if (num3 < num2)
			{
				System.out.println("A ordem crescente dos número é "+num1+", "+num3+" e "+num2);
			}
			else 
			{
				System.out.println("A ordem crescente: "+num1+", "+num2+" e "+num3+". Sendo os dois ultimos números iguais");
			}
		}
		else if(num2 < num1 && num2 < num3) 
		{
			if (num1 < num3) {
				System.out.println("A ordem crescente: "+num2+", "+num1+" e "+num3);
			}
			else if (num3 < num1)
			{
				System.out.println("A ordem crescente: "+num2+", "+num3+" e "+num1);
			}
			else 
			{
				System.out.println("A ordem crescente: "+num2+", "+num3+" e "+num1+". Sendo os dois ultimos números iguais");
			}
			
		}
		else if (num3 < num1 && num3 < num2)
		{
			if (num1 < num2) {
				System.out.println("A ordem crescente: "+num3+", "+num1+" e "+num2);
			}
			else if (num2 < num1) 
			{
				System.out.println("A ordem crescente: "+num3+", "+num2+" e "+num1);
			}
			else 
			{
				System.out.println("A ordem crescente: "+num3+", "+num2+" e "+num1+". Sendo os dois ultimos números iguais");
			}
		}
		else 
		{
			System.out.println("Erro! Os 3 números são iguais");
		}
		
		read.close();
		
		
	}
}
