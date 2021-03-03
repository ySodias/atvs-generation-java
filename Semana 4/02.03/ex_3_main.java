package gen_oop;

import java.util.*;

public class ex_3_main {
	
	public static void main (String arg[])
	{
		String nome;
		double preco;
		int codigo;
		
		Scanner ler = new Scanner(System.in);
		Random aleatorio = new Random();
		ProdutoEletronico produto = new ProdutoEletronico();
		
		System.out.println("Digite o nome do produto: ");
		nome = ler.nextLine();
				
		codigo = aleatorio.nextInt();
		if (codigo < 0) {
			codigo = codigo * -1;
		}

		
		
		System.out.println("Digite o preço do produto: ");
		preco = ler.nextDouble();
		
		produto.nome = nome;
		produto.codigo = codigo;
		produto.preco = preco;
		
		
		produto.printInfo();
		
		ler.close();
	}
}
