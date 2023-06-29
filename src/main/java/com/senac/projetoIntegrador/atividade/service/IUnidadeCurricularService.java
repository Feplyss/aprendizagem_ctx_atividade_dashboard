package com.senac.projetoIntegrador.atividade.service;

import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;

import com.senac.projetoIntegrador.atividade.dto.UnidadeCurricularDto;

public interface IUnidadeCurricularService {
	public List<UnidadeCurricularDto> getLatestAtividadesUnidadesCurricularesByUsuarioId(String usuarioId) throws EmptyResultDataAccessException;
}
