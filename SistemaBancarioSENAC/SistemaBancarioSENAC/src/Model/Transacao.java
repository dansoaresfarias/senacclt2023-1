package Model;

import java.util.Date;

enum TipoTransacao {
	Débito, Depósito, Transferência;
}

public class Transacao {

	private TipoTransacao tipo;
	private Date data;
	private double valor;
	private Cliente clienteTrans;
	private char sinalValor;

	public Transacao() {
		// TODO Auto-generated constructor stub
		super();
	}

	public Transacao(TipoTransacao tipo, Date data, double valor, Cliente clienteTrans, char sinalValor) {
		super();
		this.tipo = tipo;
		this.data = data;
		this.valor = valor;
		this.clienteTrans = clienteTrans;
		this.sinalValor = sinalValor;
	}

	public TipoTransacao getTipo() {
		return tipo;
	}

	public Date getData() {
		return data;
	}

	public double getValor() {
		return valor;
	}

	public Cliente getClienteTrans() {
		return clienteTrans;
	}

	public char getSinalValor() {
		return sinalValor;
	}

	@Override
	public String toString() {
		String retorno = data + " | " + tipo;
		if (clienteTrans != null) {
			retorno += " | " + clienteTrans.getNome();
		}
		retorno += " | " + sinalValor + " R$ " + valor;
		return retorno;
	}

}
