package gen_oop;

import java.util.*;


public class ex_1_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner read = new Scanner(System.in);
		String nome, endereco, cpf,data_nascimento, telefone;
		char escolha;

		
		do {
			System.out.printf("%nDigite o nome do cliente: %n");
			nome = read.nextLine();
			System.out.printf("Digite a data de nascimento: %n");
			data_nascimento = read.nextLine();
			System.out.printf("Digite o endereco: %n");
			endereco = read.nextLine();
			System.out.printf("Digite o cpf: %n");
			cpf = read.nextLine();
			System.out.printf("Digite o telefone: %n");
			telefone = read.nextLine();
			
			
			Cliente cliente = new Cliente(nome, data_nascimento, endereco, telefone, cpf);
			
			cliente.imprimirInfo();
			
			System.out.printf("%nDeseja fazer mais alguma coisa? Digite S(sim) ou N(não) %n");
			escolha = read.next().charAt(0);
			
		}while(escolha != 'N' || escolha != 'n');
		
		read.close();
	}
	
}
