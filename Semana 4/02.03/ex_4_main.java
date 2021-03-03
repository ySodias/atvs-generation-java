package gen_oop;

import java.util.Scanner;

public class ex_4_main {
	
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		
		String nome, cargo, cpf, registro;
		double salario;
		boolean validar = false;
		
	
	
		System.out.println("Digite o nome do funcionário: ");
		nome = ler.nextLine();
		
		
		System.out.println("Digite o cargor do funcionário: ");
		cargo = ler.nextLine();
		
		System.out.println("Digite o cpf do funcionário: ");
		cpf = ler.nextLine();
		
		System.out.println("Digite o salario do funcionário: ");
		salario = ler.nextDouble();
		
		
		funcionario.nome = nome;
		funcionario.cargo = cargo;
		funcionario.cpf = cpf;
		funcionario.salario = salario;
		funcionario.geradorRegistro();
		
		
		funcionario.printInfo();
		
		
	}
}
