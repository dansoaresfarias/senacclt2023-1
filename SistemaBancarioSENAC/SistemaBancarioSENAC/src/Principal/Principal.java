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
		Cliente anaCarla = new Cliente("123.321.222-11", "Ana Carla dos Santos", new Date("01/04/2000"), 4321123, "anacsantos@gmail.com", "(81)99998-89889", endAna);
		endAna.setComplemento("Ap 503");
		Conta contaAna = new Conta(anaCarla, 321456, agSenac, new Date(), 3456.50, 500);
		
		Endereco endVinicius = new Endereco("PE", "Recife", "Engenho do Meio", "Rua Berna", 161, "Casa A", "55123-010");
		Cliente vinicius = new Cliente("321.321.222-11", "Vinícius Sousa", new Date("07/11/2001"), 4321144, "viniciussousinha@gmail.com", "(81)99977-89889", endVinicius);
		Conta contaVini = new Conta(vinicius, 321458, agSenac, new Date(), 34.50, 500);
		
		System.out.println(contaAna.getSaldo());
		contaAna.sacar(348.50);
		contaAna.sacar(130);
		contaAna.depositar(3500);
		
		contaVini.depositar(1500);
		contaAna.transferir(300, contaVini);
		
		// System.out.println(endAna.getCidade() + " | " + endAna.getBairro() + " | " + endAna.getComplemento());
		// System.out.println(endAna.toString());
		System.out.println(contaAna.emitirExtrato());		
		System.out.println(contaVini.emitirExtrato());
		
	}

}
