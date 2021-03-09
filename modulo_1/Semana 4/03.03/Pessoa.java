package gen_oop;

public class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	private String idade;
	private String sexo;
	
	public Pessoa(String nome, String endereco, String telefone, String idade, String sexo)
	{
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.idade = idade;
		this.sexo = sexo;
	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
	

