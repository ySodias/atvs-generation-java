package gen_oop;

import java.text.NumberFormat;

public class ProdutoEletronico {
	
	String nome;
	int codigo;
	double preco;
	
	
	void valor(double quantidade)
	{
		double valor = this.preco * quantidade;
		this.preco = valor;
	}
	
	String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(preco);
		return formatoMoeda;
	}
	
	public void printInfo()
	{
		System.out.println("O produto registrado com as seguintes informações: \nNome - "+this.nome+"\nCódigo - "+this.codigo+"\nPreço - "+this.formatarMoeda());
}
}
