package generation;

import java.util.*;
import java.math.*;

public class aula_1_ex5 {
	public static void main (String[] args) {
		
		System.out.println("======= Calculadora media ==========");
		
		Scanner ler = new Scanner(System.in);
		
		String nome_aluno;
		double nota1, nota2, nota3, media;
		
		System.out.println("Digite o nome do aluno");
		nome_aluno = ler.nextLine();
		
		System.out.println("Digite o valor da primeira nota: ");
		nota1 = ler.nextDouble();
		
		System.out.println("Digite o valor da segunda nota: ");
		nota2 = ler.nextDouble();
		
		System.out.println("Digite o valor da terceira nota: ");
		nota3 = ler.nextDouble();
		
	
		
		if (nota1 >= 0 && nota1 <= 10 && nota2 >= 0 && nota2 <= 10 && nota3 >= 0 && nota3 <= 10) {
			
			media = Math.round((nota1 * 0.2) + (nota2 * 0.3) + (nota3 * 0.5));
			System.out.println("A media do aluno "+nome_aluno+" é "+media);
			
		}
		else {
			
			System.out.println("Error!");
		}
		ler.close();

	}
}
