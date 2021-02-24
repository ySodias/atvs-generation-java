package generation;

import java.util.*;
import java.math.*;

public class aula_1_ex4 {
	public static void main (String[] args) {
		
		System.out.println("========== Calculadora números inteiros ===========");
	
		Scanner ler = new Scanner (System.in);
		
		int a, b, c;
		double d, r, s;
		
		System.out.println("Digite o valor de A: ");
		a = ler.nextInt();
		
		System.out.println("Digite o valor de B: ");
		b = ler.nextInt();
		
		System.out.println("Digite o valor de C: ");
		c = ler.nextInt();
		
		if (a >= 0 && b >= 0 && c >= 0) {
			
			r = Math.pow(2,(a + 3));
			s = Math.pow(2,(b + c));
			
			d = (r + s)/2;
			
			System.out.println("O resultado das expressões é: "+d);
		}
		else {
			
			System.out.println("Erro! Número inválido");
			
		}
		ler.close();
		
	}
}
