package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Conta {

	private Cliente cliente;
	private int numero;
	private Agencia ag;
	private Date dataCriacao;
	private double saldo;
	//Cheque Especial
	private double limite;
	private boolean status;
	private List<Transacao> transacoes;

	public Conta() {
		// TODO Auto-generated constructor stub
		super();
	}

	public Conta(Cliente cliente, int numero, Agencia ag, Date dataCriacao, double saldo, double limite) {
		super();
		this.cliente = cliente;
		this.numero = numero;
		this.ag = ag;
		this.dataCriacao = dataCriacao;
		this.saldo = saldo;
		//Cheque Especial (porrrrraaaaa)
		this.limite = limite;
		this.status = true;
		this.transacoes = new ArrayList<Transacao>();
	}
	
	public boolean sacar(double valor) {
		if((this.saldo + this.limite) >= valor && valor > 0){
			this.saldo -= valor;
			Transacao trans = new Transacao(TipoTransacao.Débito, new Date(), valor, null, '-');
			this.transacoes.add(trans);
			return true;
		}else {
			return false;
		}
	}
	
	public boolean depositar(double valor) {
		if(valor > 0) {
			this.saldo += valor;
			Transacao trans = new Transacao(TipoTransacao.Depósito, new Date(), valor, null, '+');
			this.transacoes.add(trans);
			return true;
		}else {
			return false;
		}
	}
	
	public boolean transferir(double valor, Conta contaDestino) {
		if((this.saldo + this.limite) >= valor && valor > 0 && contaDestino != null) {
			this.saldo -= valor;
			Transacao trans = new Transacao(TipoTransacao.Transferência, new Date(), valor, contaDestino.getCliente(), '-');
			this.transacoes.add(trans);
			
			contaDestino.saldo += valor;
			Transacao transDestino = new Transacao(TipoTransacao.Transferência, new Date(), valor, this.cliente, '+');
			contaDestino.transacoes.add(transDestino);
			return true;
		}else {
			return false;
		}
	}
	
	public String emitirExtrato() {
		String extrato = "Extrato da Conta\n";
		extrato += this.toString() + '\n';
		for (Transacao t : this.transacoes) {
			extrato += t.toString() + '\n';
		}
		extrato += "Saldo em conta: R$: " + this.saldo;
		return extrato;
	}

	public Agencia getAg() {
		return ag;
	}

	public void setAg(Agencia ag) {
		this.ag = ag;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public int getNumero() {
		return numero;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public double getSaldo() {
		return saldo;
	}

	public List<Transacao> getTranasacoes() {
		return transacoes;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Número da Conta: " + this.numero + "| Agência: " + this.ag.getNumero() + "\n" +
				"Cliente: " + this.cliente.getNome() + "| CPF: " + this.cliente.getCpf();
	}

}
