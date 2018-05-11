package exercicio01.heranca.polimorfismo;

public class ContaPoupanca extends ContaBancaria {

	private String numeroDaConta;
	private double saldoComRendimento;
	private double saldoPoupanca;
	private ContaBancaria contaBancaria;

	public ContaPoupanca(String numeroDaContaPoupanca) {
		this.numeroDaConta = numeroDaContaPoupanca;
		this.saldoPoupanca = 0;
		this.saldoComRendimento = 0;
	}

	public double fazDepositoPoupanca(double deposito) {
		saldoPoupanca += deposito;
		return saldoPoupanca;
	}

	public double fazSaquePoupanca(double saque) {
		if (saque <= saldoPoupanca) {
			saldoPoupanca -= saque;
			System.out.println("Retire seu dinheiro");
		} else {
			System.out.println("Saque não autorizado");
		}
		return saldoPoupanca;
	}

	public double calculaRendimentos(int dias) {
		this.saldoComRendimento = saldoPoupanca * 0.005 * (dias/30);
		return this.saldoComRendimento;
	}
	
	public void verSaldoSimples(){
		System.out.println("Seu saldo na Poupança é R$ " + saldoPoupanca);
	}

	public void verSaldoRendimento(){
		System.out.println("Sua aplicação com rendimentnos está valendo R$ " + saldoComRendimento);
	}
	
	public String consultaDados() {
		String dadosContaCorrente =  contaBancaria.verDadosCliente() + ". Saldo em poupança: R$ " + saldoPoupanca;
		return dadosContaCorrente;
	}

}
