package br.edu.univas.vo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Database {
	private static List<Doador> doadores = new ArrayList();
	private static Map<String, Long> estoqueSanguineo = new HashMap<String, Long>(); //TODO VOLTAR AQUI
	
	public static void addDoador(Doador doador) {
		doadores.add(doador);
	}
	public static void addDoacao(String tipoSanguineo, Long quantidade) {
		estoqueSanguineo.put(tipoSanguineo, quantidade);
	}
	public static Long getSituacaoEstoque(String tipoSanguineo) {
		//situacao do tipo de sangue buscado
		Long cont = 0l;
		for (TipoSanguineo tS : TipoSanguineo.values()) {
			if(tS.getTipo().equals(tipoSanguineo)) {
				cont++;
			}
		}

		for(Entry<String, Long> entry: estoqueSanguineo.entrySet()) {
		      System.out.print(entry);
		      System.out.print(", ");
		    }
		return cont;
	}
}
