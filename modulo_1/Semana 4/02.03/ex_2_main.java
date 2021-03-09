package gen_oop;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex_2_main {
	
	public static void main (String args[])
	{
		int escolha_menu=0, escolha_quantidade;
		Scanner ler = new Scanner(System.in);
		Aviao minhaPassagem = new Aviao();
		
		//dicionário para menu de opções
		Map<String, String> menu_destino = new HashMap <String, String>();
		menu_destino.put("1", new String("São Paulo"));
		menu_destino.put("2", new String("Curitiba"));
		menu_destino.put("3", new String("Manaus"));
		menu_destino.put("4", new String("Rio de Janeiro"));
		
		System.out.println("Destinos disponíveis: \n");
		//formando menu
		for (String key : menu_destino.keySet()) 
		{
			String value = menu_destino.get(key);
	        System.out.println(key + " - " + value);
		}
		
	
		
		while (escolha_menu < 1 || escolha_menu > 4) {
			System.out.println("\nDigite um número para selecionar um destino referenciado: ");
			escolha_menu = ler.nextInt();
			if (escolha_menu == 1)
			{
				minhaPassagem.destino = "São Paulo";
				minhaPassagem.precoIda = 100;
			}
			if (escolha_menu == 2)
			{
				minhaPassagem.destino = "Curitiba";
				minhaPassagem.precoIda = 180;
			}
			if (escolha_menu == 3)
			{
				minhaPassagem.destino = "Manaus";
				minhaPassagem.precoIda = 300;
			}
			if (escolha_menu == 4)
			{
				minhaPassagem.destino = "Rio de Janeiro";
				minhaPassagem.precoIda = 200;
			}
			if (escolha_menu < 1 || escolha_menu > 4) {
				System.out.println("\nDigite uma opção válida\n");
			}
		}
		
		
		System.out.println("Quantas passagens irá querer? Digite 2 se quiser ida e volta.");
		escolha_quantidade = ler.nextInt();
		
		minhaPassagem.preco(escolha_quantidade);

		System.out.println("\nDestino: "+minhaPassagem.destino+"\nQuantidade: "+escolha_quantidade+"\nValor total: "+minhaPassagem.precoIda);
		
		ler.close();
	}
}
