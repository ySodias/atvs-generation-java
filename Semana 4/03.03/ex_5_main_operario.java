package gen_oop;

import java.util.*;


public class ex_5_main_operario {
	public static void main (String arg[])
	{
		char escolha_usuario = 0;
		int opcao_usuario = 0;
		int cont=0, x =0, quantidade;
		
		Scanner ler = new Scanner(System.in);
		String nome, endereco, telefone, sexo, cargo, idade;
		double valorProducao=0;
		
		
		Map<String, String> disct_nome = new HashMap <String, String>();
		Map<String, String> disct_endereco = new HashMap <String, String>();
		Map<String, String> disct_telefone = new HashMap <String, String>();
		Map<String, String> disct_idade = new HashMap <String, String>();
		Map<String, String> disct_sexo = new HashMap <String, String>();
		Map<String, String> disct_cargo = new HashMap <String, String>();
		
		//loop para cadastro de funcionário
			while(true)
			{
				if (!(escolha_usuario == 'N' || escolha_usuario == 'n')) {
					cont++;
					
					
					System.out.println("Digite o nome do funcionário: ");
					nome = ler.nextLine();
					System.out.println("Digite o endereço: ");
					endereco = ler.nextLine();
					System.out.println("Digite o telefone: ");
					telefone = ler.nextLine();
					System.out.println("Digite o idade: ");
					idade = ler.nextLine();
					System.out.println("Digite o sexo: ");
					sexo = ler.nextLine();
					System.out.println("Digite o cargo: ");
					cargo = ler.nextLine();

					
					disct_nome.put(Integer.toString(cont), new String(nome));
					disct_endereco.put(Integer.toString(cont), new String(endereco));
					disct_telefone.put(Integer.toString(cont), new String(telefone));
					disct_idade.put(Integer.toString(cont), new String(idade));
					disct_sexo.put(Integer.toString(cont), new String(sexo));
					disct_cargo.put(Integer.toString(cont), new String(cargo));
					
					System.out.println("Deseja fazer mais alguma coisa? S(sim) ou N(não)");
					escolha_usuario = ler.nextLine().charAt(0);	
				}
				else
				{
					break;
				}
			}
				
				
				do{
					x++;
					String value_nome = disct_nome.get(Integer.toString(x));
				    System.out.print(x+" - " + value_nome);
				    String value_endereco = disct_endereco.get(Integer.toString(x));
				    System.out.print(" - " + value_endereco);
				    String value_telefone = disct_telefone.get(Integer.toString(x));
				    System.out.print(" - " + value_telefone);
				    String value_idade = disct_idade.get(Integer.toString(x));
				    System.out.print(" - " + value_idade);
				    String value_sexo = disct_sexo.get(Integer.toString(x));
				    System.out.print(" - " + value_sexo);
				    String value_cargo = disct_cargo.get(Integer.toString(x));
				    System.out.print(" - " + value_cargo+"\n");
				    
				}while (x < cont);
				
				System.out.println("Qual dos funcionario acima deseja atribuir a produção? ");
				opcao_usuario = ler.nextInt();
				
				//condicao para escolha de funcionario
				if (opcao_usuario == x)
				{
					nome = disct_nome.get(Integer.toString(x));
					endereco = disct_nome.get(Integer.toString(x));
					telefone = disct_nome.get(Integer.toString(x));
					idade = disct_nome.get(Integer.toString(x));
					sexo = disct_nome.get(Integer.toString(x));
					cargo = disct_nome.get(Integer.toString(x));
					
					
					System.out.println("Digite o valor da produção: ");
					valorProducao = ler.nextDouble();
					System.out.println("Digite a quantidade: ");
					quantidade = ler.nextInt();
					
					Operario operador = new Operario(nome, endereco, telefone, idade, sexo, cargo, valorProducao);
					
					operador.valor(quantidade);
				
					System.out.println("\nO Cliente "+operador.getNome()+" com os dados: \nEndereco: "+operador.getEndereco()+" \nTelefone:"+operador.getTelefone()+" \nIdade:"+operador.getIdade()+" \nCargo:"+operador.getCargo()+"\nValor produção:"+operador.formatarMoeda());

				}
				else
				{
					System.out.println("Erro! Busca inválida, funcionário não consta na lista");
				}
	}
}
