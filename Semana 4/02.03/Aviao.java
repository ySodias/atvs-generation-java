package gen_oop;

public class Aviao {
	
	String destino;
	double precoIda;
	
	void preco(double quantidade)
	{
		double preco = this.precoIda * quantidade;
		this.precoIda = preco;
	}	
}
