package com.algaworks.titulos.cobranca.model;

public enum StatusTitulo {

	PENDENTE("Pendente", "label-warning", true),
	RECEBIDO("Recebido", "label-success", false),
	CANCELADO("Cancelado", "label-danger", false);
	
	private String descricao;
	private String label;
	private boolean mostrarBotaoPendente;
	
	StatusTitulo(String descricao, String label, boolean mostrarBotaoPendente) {
		this.descricao = descricao;
		this.label = label;
		this.mostrarBotaoPendente = mostrarBotaoPendente;
	}

	public String getLabel() {
		return label;
	}

	public String getDescricao() {
		return descricao;
	}

	public boolean isMostrarBotaoPendente() {
		return mostrarBotaoPendente;
	}
}
