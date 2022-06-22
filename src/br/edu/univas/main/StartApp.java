package br.edu.univas.main;

import java.util.Scanner;

import br.edu.univas.vo.Database;
import br.edu.univas.vo.Doador;
import br.edu.univas.vo.DoadorController;
import br.edu.univas.vo.TipoSanguineo;

public class StartApp {
	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		
//		System.out.print("CPF:");
//		Long novoCPF = in.nextLong();
//		System.out.print("Tipo sanguíneo:");
		//TODO
		DoadorController dC = new DoadorController();
		long a = 123;//TESTE
		dC.cadastrarDoador(a, "O+");
		
		dC.cadastrarDoacao("O+",5l );
		System.out.println(Database.getSituacaoEstoque("O+"));;
	}
}
