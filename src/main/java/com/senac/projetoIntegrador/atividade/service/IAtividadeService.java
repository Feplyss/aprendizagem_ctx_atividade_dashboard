package com.senac.projetoIntegrador.atividade.service;

import java.util.List;

import com.senac.projetoIntegrador.atividade.dto.AtividadeDto;
import com.senac.projetoIntegrador.atividade.exceptions.UserNotFoundException;

public interface IAtividadeService {	
	public List<AtividadeDto> getLatestAtividadesByUsuarioId(String usuarioId) throws UserNotFoundException;
}
