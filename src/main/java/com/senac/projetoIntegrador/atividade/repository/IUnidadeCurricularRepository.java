package com.senac.projetoIntegrador.atividade.repository;

import java.util.List;

import com.senac.projetoIntegrador.atividade.dto.UnidadeCurricularDto;
import com.senac.projetoIntegrador.atividade.exceptions.UserNotFoundException;

public interface IUnidadeCurricularRepository {
	public List<UnidadeCurricularDto> getLatestAtividadesUnidadesCurricularesByUsuarioId(String usuarioId) throws UserNotFoundException;
}
