package generation;

import java.util.Scanner;

public class aula_1_ex8 {
	public static void main (String[] args)
	{
		System.out.println("======= Calculadora Plano Carteziano ==========");
		
		Scanner ler = new Scanner(System.in);
		
		double custos_fabrica, distribuidor, impostos, valor_carro;
		
		
		System.out.println("Digite os custos da fábrica: ");
		custos_fabrica = ler.nextDouble();
		
		distribuidor = custos_fabrica * 0.28; 
		
		impostos = custos_fabrica * 0.45;
		
		valor_carro = custos_fabrica + distribuidor + impostos;
		
		System.out.println("O custo do carro ao consumidor será: "+valor_carro);
		
		ler.close();
}
}
