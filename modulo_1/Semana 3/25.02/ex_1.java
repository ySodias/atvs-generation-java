package gen_condicionais;

import java.util.Scanner;

public class ex_1 {
	
	public static void main (String[] args) {
		
		System.out.println("========= Digite 3 números e eu lhe direi qual deles é o maior ========= \n");
		
		int num1, num2, num3;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite o valor no primeiro número ");
		num1 = read.nextInt();
		
		System.out.println("Digite o valor no segundo número ");
		num2 = read.nextInt();
		
		System.out.println("Digite o valor no terceiro número ");
		num3 = read.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			
			System.out.println("Dentre os números: "+num1+", "+num2+" e "+num3+". O maior é "+num1);
		}
		else if(num2 > num1 && num2 > num3) {
			
			System.out.println("Dentre os números: "+num1+", "+num2+" e "+num3+". O maior é "+num2);
		}
		else {
			
			System.out.println("Dentre os números: "+num1+", "+num2+" e "+num3+". O maior é "+num3);
		}
		
		read.close();
	}
}
