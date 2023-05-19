package Model;

import java.util.Date;

public class Cliente {

	private String cpf;
	private String nome;
	private Date dataNasc;
	private int rg;
	private String email;
	private String telefone;
	private Endereco endereco;

	public Cliente() {
		// TODO Auto-generated constructor stub
		super();
	}

	public Cliente(String cpf, String nome, Date dataNasc, int rg, String email, String telefone, Endereco endereco) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.rg = rg;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	@Override
	public String toString() {
		return " Cliente: " + nome +  ", CPF: " + cpf + ",  dataNasc=" + dataNasc + "\n RG: " + rg + ", E-mail: " + email
				+ ", Telefone: " + telefone + "\n " + endereco;
	}	

}
