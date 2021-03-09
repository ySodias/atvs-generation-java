package gen_oop;

import java.text.NumberFormat;
import java.util.Random;

public class Funcionario {
	String nome;
	String cargo;
	String cpf;
	int registro;
	double salario;
	
	void geradorRegistro() 
	{
		Random gerador = new Random();
		registro = gerador.nextInt();
	}
	String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
	}
	
	void printInfo() 
	{
		System.out.println("Informações cadastradas \nNome -"+nome+"\nCargo - "+cargo+"\nCPF - "+cpf+"\nRegistro - "+registro+"\nSalario - "+salario);
	}
}
