package gen_oop;

public class Cliente {
		
		//declaração dos atributos
		
		private String nome;
		private String data_nascimento;
		private String endereco;
		private String telefone;
		private String cpf;
		
		//construtor
	
		public Cliente(String nome, String data_nascimento, String endereco, String telefone, String cpf)
		{
			this.nome = nome;
			this.data_nascimento = data_nascimento;
			this.endereco = endereco;
			this.telefone = telefone;
			this.cpf = cpf;
		}
		
		public void imprimirInfo()
		{
			System.out.println("\nO Cliente "+nome+" com os dados: \nData de nascimento: "+data_nascimento+" \nEndereço:"+endereco+" \nTelefone:"+telefone+" \nCpf:"+cpf+"foi cadastrado");
		}
		

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getData_nascimento() {
			return data_nascimento;
		}

		public void setData_nascimento(String data_nascimento) {
			this.data_nascimento = data_nascimento;
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

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		
		//métodos
		
		
		
		
}
