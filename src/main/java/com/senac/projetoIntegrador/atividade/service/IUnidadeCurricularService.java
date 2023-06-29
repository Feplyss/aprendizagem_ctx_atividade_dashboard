package com.senac.projetoIntegrador.atividade.service;

import java.util.List;

import com.senac.projetoIntegrador.atividade.dto.UnidadeCurricularDto;
import com.senac.projetoIntegrador.atividade.exceptions.UserNotFoundException;

public interface IUnidadeCurricularService {
	public List<UnidadeCurricularDto> getLatestAtividadesUnidadesCurricularesByUsuarioId(String usuarioId) throws UserNotFoundException;
}
