package com.senac.projetoIntegrador.atividade.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senac.projetoIntegrador.atividade.dto.AtividadeDto;
import com.senac.projetoIntegrador.atividade.response.LatestAtividadesResponse;
import com.senac.projetoIntegrador.atividade.service.IAtividadeService;
import com.senac.projetoIntegrador.atividade.dto.UnidadeCurricularDto;
import com.senac.projetoIntegrador.atividade.exceptions.UserNotFoundException;
import com.senac.projetoIntegrador.atividade.service.IUnidadeCurricularService;

@RestController
@RequestMapping(value = "/atividade", produces = "application/json")
public class AtividadeController {
	@Autowired
	IAtividadeService service;
	@Autowired
	IUnidadeCurricularService ucService;
	
	@GetMapping("/latest/{usuarioId}")
	public ResponseEntity<List<LatestAtividadesResponse>> retrieveLatestAtividadesByUsuarioId(@PathVariable(required = true, value = "usuarioId") String usuarioId) throws UserNotFoundException{
		List<AtividadeDto> listaAtividadeDto = service.getLatestAtividadesByUsuarioId(usuarioId).stream()
			.map(item -> new AtividadeDto(
					item.getDescricao(),
					item.getDataFim()
				)
			).collect(Collectors.toList());
		
		List<UnidadeCurricularDto> listaUnidadeCurricularDto = ucService.getLatestAtividadesUnidadesCurricularesByUsuarioId(usuarioId).stream()
			.map(item -> new UnidadeCurricularDto(
					item.getNomeCurto()
				)
			).collect(Collectors.toList());
		
		List<LatestAtividadesResponse> listaAtividades = new ArrayList<>();

		for(int i = 0; i < listaAtividadeDto.size(); i++){
		listaAtividades.add(new LatestAtividadesResponse(
			listaAtividadeDto.get(i).getDescricao(), 
			listaAtividadeDto.get(i).getDataFim(), 
			listaUnidadeCurricularDto.get(i).getNomeCurto()));
		}
		
		return new ResponseEntity<List<LatestAtividadesResponse>>(listaAtividades, HttpStatus.OK);
	}
}
