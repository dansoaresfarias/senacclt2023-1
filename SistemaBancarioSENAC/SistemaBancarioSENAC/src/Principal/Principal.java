package Principal;

import Model.Endereco;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("Ol� mundo!");
		Endereco endAna; // Vari�vel do tipo Endereco
		endAna = new Endereco(); // Criando um objeto do tipo Endereco
		endAna.setCidade("Recife");
		System.out.println(endAna.getCidade());
	}

}
