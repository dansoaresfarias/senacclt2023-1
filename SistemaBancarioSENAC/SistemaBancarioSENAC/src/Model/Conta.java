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
	private double limite;
	private boolean status;
	private List<Transacao> tranasacoes;

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
		this.tranasacoes = new ArrayList<Transacao>();
	}
	
	public boolean sacar(double valor) {
		boolean retorno;
		if((this.saldo + this.limite) >= valor){
			this.saldo -= valor;
			Transacao trans = new Transacao(TipoTransacao.Débito, new Date(), valor, this.cliente, '-');
			this.tranasacoes.add(trans);
			retorno = true;
		}else {
			retorno = false;
		}
		return retorno;
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
		return tranasacoes;
	}

}
