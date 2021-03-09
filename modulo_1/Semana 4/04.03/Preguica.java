package gen_heranca_polimorfismo;

public class Preguica extends Animal{
	
	public Preguica(String nome, String idade) 
	{
		super(nome, idade);
	}
	
	@Override
	public void emitirSom (int tipoSom)
	{
		switch(tipoSom)
		{
			case 1:
				System.out.println("IIIIHHHH! (gruindo)");
				break;
			default:
				System.out.println("O preguiça está calado");
		}
		
	}
	
	@Override
	public void atividade (int tipoAtv)
	{
		switch(tipoAtv)
		{
			case 1:
				System.out.println("O cachorro está dormindo");
				break;
		}
		
	}
}
