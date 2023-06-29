package com.senac.projetoIntegrador.atividade.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.senac.projetoIntegrador.atividade.dto.UnidadeCurricularDto;
import com.senac.projetoIntegrador.atividade.repository.IUnidadeCurricularRepository;
import com.senac.projetoIntegrador.atividade.service.IUnidadeCurricularService;

@Service
public class UnidadeCurricularService implements IUnidadeCurricularService{
	@Autowired
	IUnidadeCurricularRepository repository;

	public List<UnidadeCurricularDto> getLatestAtividadesUnidadesCurricularesByUsuarioId(String usuarioId) throws EmptyResultDataAccessException{
		return repository.getLatestAtividadesUnidadesCurricularesByUsuarioId(usuarioId);
	}
}
