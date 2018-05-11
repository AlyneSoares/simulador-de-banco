package TESTESexercicio01.heranca.polimorfismo;

import java.util.List;

import exercicio01.heranca.polimorfismo.ContaBancaria;
import exercicio01.heranca.polimorfismo.ContaCorrente;
import exercicio01.heranca.polimorfismo.CreditoEspecial;
import exercicio01.heranca.polimorfismo.UsuarioDoBanco;

public class TesteConta {
	public static void main(String[] args) {

		// public static ContaBancaria criadorDeContas(int menu) {
		// if (menu == 1){
		// return new ContaBancaria("Alyne", "123-1");
		// }if (menu ==2){
		// return new ContaPoupanca("Alyne", "123-2");
		// } else if (menu == 3) {
		// return new ContaEspecial("Alyne", "123-3", 10);
		// }
		// return null;
		// }

		UsuarioDoBanco usuario = new UsuarioDoBanco("Alyne", "004");
		
		ContaBancaria contaCc = new ContaBancaria(usuario, "123-1");
		ContaBancaria contaPou = new ContaCorrente(usuario, "123-2");
		ContaBancaria contaEsp = new CreditoEspecial(usuario, "123-3", 1500);
		

		contaCc.verDadosCliente();

		contaCc.fazDeposito(300);
		contaCc.fazDeposito(600);
		contaCc.fazSaque(15);
		contaCc.consultarSaldo();
		contaCc.fazSaque(1000);
		contaCc.consultarSaldo();

		contaPou.fazDeposito(1000);
		contaPou.consultarSaldo();
		contaPou.fazSaque(10);
//		contaPou.calculaRendimentos(30);
		contaPou.consultarSaldo();

		contaCc.fazSaque(1200);
		contaEsp.fazSaque(1200);
		contaCc.consultarSaldo();
//		contaEsp.getLimite();

	}
}

class UsuarioDoBanco {

	private String nome;
	private String cpf;
	private ContaBancaria[] contas;

	public UsuarioDoBanco(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.contas = new ContaBancaria[3]; 
	}

}