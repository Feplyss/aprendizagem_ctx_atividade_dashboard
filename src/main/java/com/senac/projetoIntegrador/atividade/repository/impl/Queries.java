package com.senac.projetoIntegrador.atividade.repository.impl;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Queries {
	private String getLatestAtividadesByUsuarioId = """
				SELECT atividade_descricao, atividade_data_fim FROM atividade a
				JOIN acompanhamento ac ON a.atividade_id = ac.atividade_id
				JOIN participante p ON ac.participante_id = p.participante_id
				JOIN estudante e ON p.estudante_id = e.estudante_id
				WHERE e.usuario_id = ?
				ORDER BY a.atividade_data_fim LIMIT 2
			""";

	private String getUnidadesCurricularesAtuaisByUsuarioId = """
				SELECT * FROM unidade_curricular uc
				JOIN grupo g ON uc.unidade_curricular_id = g.unidade_curricular_id
				JOIN participante p ON g.grupo_id = p.grupo_id
				JOIN estudante e ON p.estudante_id = e.estudante_id
				WHERE e.usuario_id = ? AND g.grupo_status = 1
			""";
	
	private String getLatestAtividadesUnidadesCurricularesByUsuarioId = """
				SELECT unidade_curricular_nome_curto FROM unidade_curricular uc
				JOIN grupo g ON uc.unidade_curricular_id = g.unidade_curricular_id
				JOIN participante p ON g.grupo_id = p.grupo_id
				JOIN acompanhamento ac ON p.participante_id = ac.participante_id
				JOIN atividade a ON ac.atividade_id = a.atividade_id
				JOIN estudante e ON p.estudante_id = e.estudante_id
				WHERE e.usuario_id = ?
				ORDER BY a.atividade_data_fim LIMIT 2
			""";	

	public String getGetLatestAtividadesByUsuarioId() {
		return getLatestAtividadesByUsuarioId;
	}
	public void setGetLatestAtividadesByUsuarioId(String getLatestAtividadesByUsuarioId) {
		this.getLatestAtividadesByUsuarioId = getLatestAtividadesByUsuarioId;
	}

	public String getGetUnidadesCurricularesAtuaisByUsuarioId() {
		return this.getUnidadesCurricularesAtuaisByUsuarioId;
	}

	public String getGetLatestAtividadesUnidadesCurricularesByUsuarioId() {
		return this.getLatestAtividadesUnidadesCurricularesByUsuarioId;
	}
	
	
}
