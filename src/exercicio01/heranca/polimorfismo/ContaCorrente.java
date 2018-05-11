package exercicio01.heranca.polimorfismo;

public class ContaCorrente extends ContaBancaria {

	private double saldo;
	private String numeroDaContaCorrente;
	private ContaBancaria contaBancaria;

	public ContaCorrente(String numeroDaContaCorrente) {
		this.numeroDaContaCorrente = numeroDaContaCorrente;
		this.saldo = 0;
	}

	public double fazDeposito(double deposito){
		saldo += deposito;
		return this.saldo;
	}

	public double fazSaque(double saque){
		if(saque <= saldo){
			saldo -= saque;
			System.out.println("Retire seu dinheiro");
		} else {
			System.out.println("Saque não autorizado");
		}
		return saldo;
	}

	public double consultarSaldo(){
		return this.saldo;
	}
	
	public CreditoEspecial CreditoEspecial(String numeroDaConta, String aceitaCondicao){
		aceitaCondicao.toLowerCase();
		CreditoEspecial creditoEspecial;
		if(aceitaCondicao == "sim") {
			creditoEspecial = new CreditoEspecial(numeroDaConta, saldo);
		}
		else {
			creditoEspecial = null;
		}
		return creditoEspecial;
	}

	public String consultaDados() {
		String dadosContaCorrente =  contaBancaria.verDadosCliente() + ". Saldo em conta: R$ " + saldo;
		return dadosContaCorrente;
	}


}
