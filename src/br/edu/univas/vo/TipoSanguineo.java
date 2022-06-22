package br.edu.univas.vo;

public enum TipoSanguineo {
	APOSITIVO("A+"),
	ANEGATIVO("A-"),
	BPOSITIVO("B+"),
	BNEGATIVO("B-"),
	ABPOSITIVO("AB+"),
	ABNEGATIVO("AB-"),
	OPOSITIVO("O+"),
	ONEGATIVO("O-");
	
	private String tipo;
	//
	private TipoSanguineo(String tipo) {
		this.tipo = tipo;
	}
	public String getTipo() {
		return tipo;
	}
	public TipoSanguineo fromTipo(String tipo) {//TODO VOLTAR AQUI
		return null;
	}
}
