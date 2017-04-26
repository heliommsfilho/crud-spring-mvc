package com.algaworks.titulos.cobranca.model;

public enum StatusTitulo {

	PENDENTE("Pendente", "label-warning"),
	RECEBIDO("Recebido", "label-success"),
	CANCELADO("Cancelado", "label-danger");
	
	private String descricao;
	private String label;
	
	StatusTitulo(String descricao, String label) {
		this.descricao = descricao;
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public String getDescricao() {
		return descricao;
	}
}
