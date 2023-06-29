package com.senac.projetoIntegrador.atividade.repository;

import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;

import com.senac.projetoIntegrador.atividade.dto.UnidadeCurricularDto;

public interface IUnidadeCurricularRepository {
	public List<UnidadeCurricularDto> getLatestAtividadesUnidadesCurricularesByUsuarioId(String usuarioId) throws EmptyResultDataAccessException;
}
