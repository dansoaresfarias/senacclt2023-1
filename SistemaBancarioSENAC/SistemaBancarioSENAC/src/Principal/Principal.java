package Principal;

import java.util.Date;

import Model.Agencia;
import Model.Cliente;
import Model.Conta;
import Model.Endereco;
import Model.Transacao;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("Olá mundo!");
		Endereco endAna; // Variável do tipo Endereco
		// endAna = new Endereco(); // Criando um objeto do tipo Endereco sem valores para seus atributos, usando o construtor vazio
		Endereco endAg = new Endereco("PE", "Recife", "Santo Amaro", "Rua do Pombal", 54, "Andar 20", "55640-110");
		Agencia agSenac = new Agencia("SENAC PE", 1234, "(81)32225454", "agsenacpe@bancosenac.br", endAg);
		endAna = new Endereco("PE", "Recife", "Vázea", "Av Polidório", 134, "Ap 502", "55640-010");
		Cliente anaCarla = new Cliente("123.321.222-11", "Ana Carla dos Santos", new Date(2000, 01, 04), 4321123, "anacsantos@gmail.com", "(81)99998-89889", endAna);
		endAna.setComplemento("Ap 503");
		Conta contaAna = new Conta(anaCarla, 321456, agSenac, new Date(), 3456.50, 500);
		System.out.println(contaAna.getSaldo());
		contaAna.sacar(348.50);
		contaAna.sacar(130);
		
		// System.out.println(endAna.getCidade() + " | " + endAna.getBairro() + " | " + endAna.getComplemento());
		// System.out.println(endAna.toString());
		// System.out.println(anaCarla);
		System.out.println(contaAna.getSaldo());
		for (Transacao t : contaAna.getTranasacoes()) {
			System.out.println(t);
		}
		
	}

}
