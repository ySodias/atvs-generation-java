package generation;

import java.util.*;


public class aula_1_ex6 {
	public static void main (String[] args) 
	{
		System.out.println("======= Calculadora Plano Carteziano ==========");
		
		Scanner ler = new Scanner(System.in);
		
		double x1, y1, x2, y2, d;
		
		
		System.out.println("A coordenada X1 do plano: ");
		x1 = ler.nextInt();
		
		System.out.println("A coordenada Y1 do plano: ");
		y1 = ler.nextInt();
		
		System.out.println("A coordenada X2 do plano: ");
		x2 = ler.nextInt();
		
		System.out.println("A coordenada Y2 do plano: ");
		y2 = ler.nextInt();
		
		d = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
		
		System.out.println("Nas coordenadas: ("+x1+","+y1+") e ("+x2+","+y2+") o resultado foi "+Math.round(d));
		
		ler.close();
	}
}
