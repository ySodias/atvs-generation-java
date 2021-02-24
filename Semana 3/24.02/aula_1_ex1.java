package generation;

import java.util.*;

public class aula_1_ex1 {
	public static void main (String[] args) {
		
		System.out.println("======= Calculadora dias vividos ==========");
		
		Scanner ler = new Scanner(System.in);
		
		String nome;
		int idade, mes, dias, dias_vividos;
		
		System.out.println("Digite o nome da pessoa :");
		nome = ler.nextLine();
		
		System.out.println("Digite a idade de "+nome+": ");
		idade = ler.nextInt();
		
		System.out.println("Digite o mês que "+nome+" nasceu: ");
		mes = ler.nextInt();
		
		System.out.println("Digite o dia que "+nome+" nasceu: ");
		dias = ler.nextInt();
		
		
		dias_vividos = idade*365  + mes*30 + dias; 
		System.out.println("O "+nome+" viveu "+dias_vividos+" dias");
		
		ler.close();
	}
}
