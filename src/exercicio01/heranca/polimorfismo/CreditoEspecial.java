package exercicio01.heranca.polimorfismo;

public class CreditoEspecial extends ContaCorrente {

	private double limite;
	private double saldoEspecial;
	private double saldoEmCC;
	private String numeroDaConta;
	
	public CreditoEspecial(String numeroDaConta, double saldo) {
		this.saldoEmCC = saldo;
		this.numeroDaConta = numeroDaConta;
}

	public double novoCredito(double novoCredito) {
		return this.limite;
	}

	public double fazSaqueEspecial(double saque) {
		double total =  saldoEmCC + limite;
		if (saque <= saldoEmCC) {
			saldoEmCC -= saque;
			System.out.println("Saque liberado");
		}
		if (saque > saldoEmCC && saque <= total){
			saldoEmCC -= saque;
			limite += saldoEmCC;
			saldoEmCC = 0;
			System.out.println("Saque liberado");
			System.out.println("Seu limite de crédito é de R$" + limite);
		} else {
			System.out.println("Saque não autorizado");
		}
		return limite;
	}
	
	


}
