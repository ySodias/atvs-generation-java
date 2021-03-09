package gen_heranca_polimorfismo;

public class Cavalo extends Animal{
	
	public Cavalo(String nome, String idade) 
	{
		super(nome, idade);
	}
	
	@Override
	public void emitirSom(int tipoSom)
	{
		switch(tipoSom)
		{
			case 1:
				System.out.println("Hinn in in! (Relinchar)");
				break;
			case 2:
				System.out.println("UUUHHHHHHHHHUUHh.... (Chirriar)");
				break;
			default:
				System.out.println("Crás! (crocitar)");
				break;
		}
	}
	
	@Override
	public void atividade(int tipoAtv)
	{
		switch(tipoAtv)
		{
			case 1:
				System.out.println("O cavalo está correndo");
				break;
			case 2:
				System.out.println("O cachorro está comendo grama");
				break;
			default:
				System.out.println("O cachorro está dormindo");
				break;
		}
		
	}
}

