package exercicio01.heranca.polimorfismo;

public class UsuarioDoBanco {

	private String nome;
	private String cpf;
	private ContaBancaria[] contas;

	public UsuarioDoBanco(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.contas = new ContaBancaria[2]; 
	}

	public String verDadosUsuario() {
		return "Sr/Sra "+ nome + " CPF: " + cpf;
	}

}
