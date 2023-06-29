package com.senac.projetoIntegrador.atividade.response;

public class CurrentUnidadesCurricularesResponse {
	private String nomeCurto;
	
	public CurrentUnidadesCurricularesResponse(String nomeCurto) {
		super();
		this.nomeCurto = nomeCurto;
	}

	public String getNomeCurto() {
		return nomeCurto;
	}

	public void setNomeCurto(String nomeCurto) {
		this.nomeCurto = nomeCurto;
	}
}
