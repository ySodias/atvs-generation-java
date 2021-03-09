package generation;

import java.util.*;

public class aula_1_ex3 {
	public static void main (String[] args)
	{
		System.out.println("======= Calculadora tempo de evento ==========");
		
		Scanner ler = new Scanner(System.in);
		int segundos, horas, minutos;
		
		
		System.out.println("Digite o tempo de duração de um evento em uma fábrica em segundos");
		segundos = ler.nextInt();
		
		horas = segundos/3600;
		minutos = segundos/60;
		
		

		System.out.println("O tempo de execução do evento foi respectiavmente em "+horas+"h, em "+minutos+"m e em "+segundos+"s ");
	
		ler.close();
	}
}
