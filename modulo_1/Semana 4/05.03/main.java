package gen_collections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {
	
	public static void main(String args[])
	{
		
		String nome;
		int opcaoUsuario, cont=0, escolha_usuario1=0;
		char escolha_usuario;
		boolean controle = false;
		
		Scanner ler = new Scanner(System.in);

		Collection<String> produtoNome = new ArrayList<String>();
		Collection<String> newProduto = Arrays.asList();

		//lista default
		produtoNome.add("Arroz");

		
		//lista default
		produtoNome.add("Chocolate");

		
		//lista default
		produtoNome.add("Macarrao");


		
		
		Map<String,String>menu = new HashMap<String, String>();
		menu.put("1", new String("Cadastrar produto no estoque"));
		menu.put("2", new String("Remover produto do estoque"));
		menu.put("3", new String("Atualizar produtos do estoque"));
		menu.put("4", new String("Exibir lista de produtos"));
		

		for (String key : menu.keySet()) 
		{
			String value = menu.get(key);
	        System.out.println(key + " - " + value);
		}
		
		do {
			System.out.println("Digite uma das opções acima para continuar: ");
			opcaoUsuario = ler.nextInt();
			if(opcaoUsuario == 5) {
				System.out.println("Erro! Opção inválida");
			}
			
		}while(opcaoUsuario <= 0 || opcaoUsuario > 4);
		
		ler.nextLine();
		switch(opcaoUsuario) {
			
			case 1:	
				do {

					System.out.println("Digite o nome do produto: ");
					nome = ler.nextLine();
					
					newProduto.add(nome);
					
					
					do {
						System.out.println("Deseja adicionar mais algum item? Digite S(sim) ou N(não)");
						escolha_usuario = ler.nextLine().charAt(0);
						if (!(escolha_usuario == 'N' || escolha_usuario =='S' || escolha_usuario =='s' || escolha_usuario =='n')) {
							System.out.println("Erro! Opção inválida");
						}	
					}while(!(escolha_usuario== 'n' || escolha_usuario== 'N'|| escolha_usuario == 'S' || escolha_usuario =='s'));	
					if (!(escolha_usuario == 'S' || escolha_usuario =='s')) {
						controle = true;
					}
				}while(controle == false);
				produtoNome.addAll(newProduto);
				break;
			case 2:
				System.out.println("\n1 - Um nome da lista apenas; \n2 - Toda lsita ");
				escolha_usuario1 = ler.nextInt();
				if(escolha_usuario1 == 1) {
					for (String produto : produtoNome) {
						cont++;
						System.out.println(cont+" - "+produto);
						}
						
						System.out.println("Digite do produto que deseja excluir ");
						nome = ler.next();
							
						produtoNome.remove(nome);
						
					}
				else 
				{
					produtoNome.removeAll(produtoNome);
				}
				System.out.println("Lista Atualizada:");	
				if(produtoNome.isEmpty()) {
					System.out.println("[vazia]");
				}
				else {
					System.out.println(produtoNome);
				}
			case 3:
				produtoNome.clear();
				
				do {

					
					
					System.out.println("Digite o nome do produto: ");
					nome = ler.nextLine();
						
					produtoNome.add(nome);
					
					for (String produto : produtoNome) {
						System.out.println(produto);
					}
					
					
					do {
						System.out.println("Deseja adicionar mais algum item? Digite S(sim) ou N(não)");
						escolha_usuario = ler.nextLine().charAt(0);
						if (!(escolha_usuario == 'N' || escolha_usuario =='S' || escolha_usuario =='s' || escolha_usuario =='n')) {
							System.out.println("Erro! Opção inválida");
						}	
					}while(!(escolha_usuario== 'n' || escolha_usuario== 'N'|| escolha_usuario == 'S' || escolha_usuario =='s'));	
					if (!(escolha_usuario == 'S' || escolha_usuario =='s')) {
						controle = true;
					}
				}while(controle == false);
			
				break;
			case 4:
				
				for (String produto : produtoNome)
				{
					System.out.println(produto);
				}
			break;
		}
	}		
}


