package Model;

import java.util.Date;

public class ContaCorrente extends Conta{
	
	private double taxaManutencao;

	public ContaCorrente() {
		// TODO Auto-generated constructor stub
		super();
	}

	public ContaCorrente(Cliente cliente, int numero, Agencia ag, Date dataCriacao, double saldo, double limite, double taxaManutencao) {
		super(cliente, numero, ag, dataCriacao, saldo, limite);
		this.taxaManutencao = taxaManutencao;
		// TODO Auto-generated constructor stub
	}

	public double getTaxaManutencao() {
		return taxaManutencao;
	}

	public void setTaxaManutencao(double taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}
	
	@Override
	public boolean sacar(double valor) {
		valor = valor + valor*this.taxaManutencao;
		return super.sacar(valor);
	}

}
