package gen_heranca_polimorfismo;

import java.util.*;

public class Main {
	
	public static void main (String arg[])
	{
		
		Random aleatorio = new Random();
		Scanner ler = new Scanner(System.in);
		
		String nome="", idade="";
		int num=0;

		Cachorro cachorro = new Cachorro(nome, idade);
		Cavalo cavalo = new Cavalo(nome, idade);
		Preguica preguica = new Preguica(nome, idade);

		num = (int)aleatorio.nextInt(7)+1;
		ler.nextLine();
		
		System.out.println("Digite o nome do cachorro: ");
		nome = ler.nextLine();
		System.out.println("Digite da idade cachorro: ");
		idade = ler.nextLine();
		
		cachorro.setNome(nome);
		cachorro.setIdade(idade);
		
		System.out.println("O cachorro com o nome "+cachorro.getNome()+ " e a idade "+cachorro.getIdade());
		cachorro.emitirSom(num);
		cachorro.atividade(num);
		
		System.out.println("\nDigite o nome do Cavalo: ");
		nome = ler.nextLine();
		System.out.println("Digite da idade Cavalo: ");
		idade = ler.nextLine();
		
		cavalo.setNome(nome);
		cavalo.setIdade(idade);
		System.out.println("O cavalo com o nome "+cavalo.getNome()+ " e a idade "+cavalo.getIdade());
		
		cavalo.emitirSom(num);
		cavalo.atividade(num);
		
		System.out.println("Digite o nome do preguiça: ");
		nome = ler.nextLine();
		System.out.println("Digite da idade preguiça: ");
		idade = ler.nextLine();
		
		preguica.setNome(nome);
		preguica.setIdade(idade);
		System.out.println("O preguica com o nome "+preguica.getNome()+ " e a idade "+preguica.getIdade());
		
		preguica.emitirSom(num);
		preguica.atividade(num);
		
		
		
		
	}
}
