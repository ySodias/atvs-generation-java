package gen_oop;

import java.text.NumberFormat;

public class Operario extends Pessoa {
	
	private String cargo;
	private double valorProducao;
	
	public Operario(String nome, String endereco, String telefone, String idade, String sexo,String cargo, double valorProducao)
	{
		super(nome, endereco, telefone, idade, sexo);
		this.cargo = cargo;
		this.valorProducao = valorProducao;
	}


	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}
	
	void valor(double quantidade)
	{
		double valor = valorProducao * quantidade;
		this.valorProducao = valor;
	}
	
	String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(valorProducao);
		return formatoMoeda;
	}

	
	
}
