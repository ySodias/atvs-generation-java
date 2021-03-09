package gen_repeticao;

import java.util.*;



public class ex_4 {
	public static void main (String[] args) 
	{	
		System.out.printf("===== Pesquisa sobre temperamento das pessoas ========");
		int idade, sexo, choised_user, cont_people=0, femino_nervosa =0, masculino_agressivo =0, outros_calmo =0, calma=0, nervosa=0, calma_18=0;
		
		Scanner read = new Scanner(System.in);
		
		//cria dicionário
		Map<String, String> dict_sexo = new HashMap <String, String>();
		dict_sexo.put("1", new String("Feminino"));
		dict_sexo.put("2", new String("Masculino"));
		dict_sexo.put("3", new String("Outros"));
		
		Map<String, String> dict_opcoes = new HashMap <String, String>();
		dict_opcoes.put("1", new String("Pessoa calma;"));
		dict_opcoes.put("2", new String("Pessoa nervosa"));
		dict_opcoes.put("3", new String("Pessoa agressiva"));
		
		while (cont_people < 150) {
			

			idade = 0;
			

			System.out.println("Digite sua idade: ");
			idade = read.nextInt();
			
			//percore dicionario e apresenta como um menu de opções
			for (String key : dict_sexo.keySet()) 
			{
				String value = dict_sexo.get(key);
                System.out.println(key + " - " + value);
			}
			
			System.out.println("Digite o sexo da pessoa");
			sexo = read.nextInt();
			//validações
			if (sexo >= 1 && sexo <= 3) 
			{
				for (String key : dict_opcoes.keySet()) 
				{
					String value = dict_opcoes.get(key);
	                System.out.println(key + " - " + value);
				}
				if (sexo == 1) 
				{
					System.out.println("Qual das opções acima mais se assemelha ao comportamento da pessoa");
					choised_user = read.nextInt();
					if (choised_user >= 1 && choised_user <= 3) 
					{
						if (choised_user == 1) 
						{
							if (idade <= 18) 
							{
								calma_18++;
							}
							calma++;
						}
						else if (choised_user == 2)
						{
							if (idade >=40) 
							{
								nervosa++;
							}
							femino_nervosa++;
						}
						else
						{
						}
					}
					else 
					{
						System.out.println("Erro!");
						break;
					} 
				}
				else if (sexo == 2)
				{
					System.out.println("Qual das opções acima mais se assemelha ao comportamento da pessoa");
					choised_user = read.nextInt();
					if (choised_user >= 1 && choised_user <= 3) 
					{
						if (choised_user == 1) 
						{
							if (idade <= 18) 
							{
								calma_18++;
							}
							calma++;
						}
						else if (choised_user == 2)
						{
							
							if (idade >=40) 
							{
								nervosa++;
							}
							masculino_agressivo++;
						}
						else
						{
						}
						
					}
					else 
					{
						System.out.println("Erro!");
						break;
					} 
				}
				else
				{
					System.out.println("Qual das opções acima mais se assemelha ao comportamento da pessoa");
					choised_user = read.nextInt();
					if (choised_user >= 1 && choised_user <= 3) 
					{
						if (choised_user == 1) 
						{
							
							if (idade <= 18) 
							{
								calma_18++;
							}
							calma++;
							outros_calmo++;
						}
						else if (choised_user == 2)
						{
							if (idade >=40) 
							{
								nervosa++;
							}
						}
						
					}
					else 
					{
						System.out.println("Erro!");
						break;
					} 
				}
				
				
			}
			else {
				System.out.print("Erro!");
				break;
			}
			
			cont_people++;
		}
		//prints resultados
		System.out.println("A quantidade de pessoas calmas é "+calma);
		
		System.out.println("A quantidade de mulheres nervosas é "+femino_nervosa);
		
		System.out.println("A quantidade de homens agressivos é "+masculino_agressivo);
		
		System.out.println("A quantidade de outros calmos é "+outros_calmo);
		
		System.out.println("A quantidade de pessoas nervosas com mais de 40 é "+nervosa);
		
		System.out.println("A quantidade de pessoas calmas com menos de 18 é "+calma_18);
		
		
		read.close();
	}
}
