package Model;

import java.util.Date;

public class ContaPoupanca extends Conta {
	
	private double taxaRendimento;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Cliente cliente, int numero, Agencia ag, Date dataCriacao, double saldo, double limite, double taxaRend) {
		super(cliente, numero, ag, dataCriacao, saldo, limite);
		this.taxaRendimento = taxaRend;
	}
	
	@Override
	public boolean depositar(double valor) {
		valor += valor*this.taxaRendimento;
		return super.depositar(valor);
	}

}
