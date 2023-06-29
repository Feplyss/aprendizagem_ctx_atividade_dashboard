package com.senac.projetoIntegrador.atividade.repository;

import java.util.List;


import com.senac.projetoIntegrador.atividade.dto.AtividadeDto;
import com.senac.projetoIntegrador.atividade.exceptions.UserNotFoundException;

public interface IAtividadeRepository {
	public List<AtividadeDto> getLatestAtividadesByUsuarioId(String usuarioId) throws UserNotFoundException;
}
