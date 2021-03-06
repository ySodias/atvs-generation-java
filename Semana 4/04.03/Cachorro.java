package gen_heranca_polimorfismo;

public class Cachorro extends Animal{

	public Cachorro(String nome, String idade) 
	{
		super(nome, idade);
	}
	
	@Override
	public void emitirSom (int tipoSom)
	{
		switch(tipoSom)
		{
			case 1:
				System.out.println("UAU!UAU! (latindo)");
				break;
			case 2:
				System.out.println("UUUHHHHHHHHHUUHh.... (uivando)");
				break;
			case 3:
				System.out.println("GRGRGRGRRGRGRGR! (rosnando)");
				break;
			default:
				System.out.println("O cachorro está calado");
				break;
		}
		
	}
	
	@Override
	public void atividade (int tipoAtv)
	{
		switch(tipoAtv)
		{
			case 1:
				System.out.println("O cachorro está correndo atrás de um gato");
				break;
			case 2:
				System.out.println("O cachorro está correndo para o pegar seu frisbee");
				break;
			case 3:
				System.out.println("O cachorro está correndo atrás de uma moto");
				break;
			case 4:
				System.out.println("O cachorro está correndo atrás de uma carro");
				break;
			default:
				System.out.println("O cachorro está dormindo");
				break;
		}
		
	}
}
