package br.edu.univas.vo;

import java.util.Scanner;

import br.edu.univas.exception.TipoSanguineoNotFoundException;

public class DoadorController {
	public void  cadastrarDoador(Long cpf, String tipoSanguineo) {
		Doador novoDoador = new Doador();
		
		novoDoador.setCpf(cpf);
		
		for (TipoSanguineo tS : TipoSanguineo.values()) {
			if(tS.getTipo().equals(tipoSanguineo)) {
				novoDoador.setTipoSanguineo(tS);
				Database.addDoador(novoDoador);
				return;
			}
		}
		
		throw new TipoSanguineoNotFoundException("Tipo sanguíneo não encontrado.");
		
	}
	public void  cadastrarDoacao(String tipoSanguineo, Long quantidade) {
		boolean key = false;
		for (TipoSanguineo tS : TipoSanguineo.values()) {
			if(tS.getTipo().equals(tipoSanguineo)) {
				key = true;
				break;//ok
			}
		}
		if(!key) {
			throw new TipoSanguineoNotFoundException("Tipo sanguíneo não encontrado.");
		}
		
		if(quantidade <= 0) {
			throw new IllegalArgumentException();
		}
		Database.addDoacao(tipoSanguineo, quantidade);
	}
}
