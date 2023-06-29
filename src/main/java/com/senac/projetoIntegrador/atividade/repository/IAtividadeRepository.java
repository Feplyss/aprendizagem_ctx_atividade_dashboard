package com.senac.projetoIntegrador.atividade.repository;

import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;

import com.senac.projetoIntegrador.atividade.dto.AtividadeDto;

public interface IAtividadeRepository {
	public List<AtividadeDto> getLatestAtividadesByUsuarioId(String usuarioId) throws EmptyResultDataAccessException;
}
