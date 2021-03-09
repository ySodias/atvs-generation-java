package gen_heranca_polimorfismo;

public abstract class Animal {
	
	
	private String nome;
	private String idade;
	
	public Animal (String nome, String idade)
	{
		this.nome = nome;
		this.idade = idade;
	}
	
	abstract public void emitirSom (int tipoSom);
	abstract public void atividade (int tipoAtv);
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}
}
