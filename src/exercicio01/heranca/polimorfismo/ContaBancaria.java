package exercicio01.heranca.polimorfismo;

public class ContaBancaria {

	private String numConta;
	protected UsuarioDoBanco usuarioDoBanco;


	public ContaBancaria criaConta(UsuarioDoBanco usuarioDoBanco, String numeroDaConta) {
		this.numConta = numeroDaConta;
		this.usuarioDoBanco = usuarioDoBanco;
		return new ContaBancaria();
	}

	public ContaCorrente criaContaCorrente(String numeroDaConta, String abreConta) {
		abreConta.toLowerCase();
		ContaCorrente contaCorrente;
		if(abreConta == "sim") {
			contaCorrente = new ContaCorrente(numeroDaConta);
		}
		else {
			contaCorrente = null;
		}
		return contaCorrente;
	}

	public ContaPoupanca ContaPoupanca (String numeroDaConta, String abrePoupanca) {
		abrePoupanca.toLowerCase();
		ContaPoupanca contaPoupanca;
		if(abrePoupanca == "sim") {
			contaPoupanca = new ContaPoupanca(numeroDaConta);
		}
		else {
			contaPoupanca = null;
		}
		return contaPoupanca;
	}

	public String verDadosCliente(){
		String dadosConta = usuarioDoBanco.verDadosUsuario() + ", conta: " + numConta;
		return dadosConta;
	}

}
