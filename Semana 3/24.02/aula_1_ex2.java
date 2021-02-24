package generation;

import java.util.*;


public class aula_1_ex2 {
	public static void main (String[] args) 
	{
		System.out.println("======= Calculadora tempo vivido ==========");
		
		Scanner ler = new Scanner(System.in);
		
		String nome;
		int ano, mes, dias;

		
		System.out.println("Digite o nome da pessoa: ");
		nome = ler.nextLine();
		
		System.out.println("Digite quantos dias de vida "+nome+" tem: ");
		dias = ler.nextInt();
		
		
		ano = Math.round(2021 - dias/365 - 1);
		mes = dias%365/30;
		dias = dias%365%30;
		
		
		
		
		
		System.out.println("O "+nome+" nasceu em "+dias+"/"+mes+"/"+ano);
		
		ler.close();
	}
}
