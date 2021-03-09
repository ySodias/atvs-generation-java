package generation;

import java.util.*;

public class aula_1_ex7 {
	public static void main (String[] args)
	{
	
		System.out.println("======= Calculadora Plano Carteziano ==========");
		
		Scanner ler = new Scanner(System.in);
		
		double a,b,c,d,e,f,y,x;
		
		
		System.out.println("Digite o valor de A: ");
		a = ler.nextInt();
		
		System.out.println("Digite o valor de B: ");
		b = ler.nextInt();
		
		System.out.println("Digite o valor de C: ");
		c = ler.nextInt();
		
		System.out.println("Digite o valor de D: ");
		d = ler.nextInt();
		
		System.out.println("Digite o valor de E: ");
		e = ler.nextInt();
		
		System.out.println("Digite o valor de F: ");
		f = ler.nextInt();
		
		x = (c*e)-(b*f)/(a*e)-(b*d);
		y = (a*f)-(c*d)/(a*e)-(b*d);
		
		System.out.println("O resultado para a equação baseado nos coeficientes foi: "+x+" para x e "+y+" para y");
		
		ler.close();
	}
}
