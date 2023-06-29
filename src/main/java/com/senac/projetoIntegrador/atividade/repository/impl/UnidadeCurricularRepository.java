package com.senac.projetoIntegrador.atividade.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.senac.projetoIntegrador.atividade.dto.UnidadeCurricularDto;
import com.senac.projetoIntegrador.atividade.repository.IUnidadeCurricularRepository;

@Repository
public class UnidadeCurricularRepository implements IUnidadeCurricularRepository{

	private JdbcTemplate dbConnection;
	
	@Autowired
	Queries queries;
	
	private class UnidadeCurricularMapper implements RowMapper<UnidadeCurricularDto>{
		@Override
		public UnidadeCurricularDto mapRow(ResultSet rs, int rowNum) throws SQLException{
			UnidadeCurricularDto unidadeCurricularDto = new UnidadeCurricularDto();
			unidadeCurricularDto.setNomeCurto(rs.getString("unidade_curricular_nome_curto"));
			return unidadeCurricularDto;
		}
	}
	
	@Autowired
	private void dbConnection(@Qualifier("dbConnection") DataSource dbConn) {
		this.dbConnection = new JdbcTemplate(dbConn);
	}

	@Override
	public List<UnidadeCurricularDto> getLatestAtividadesUnidadesCurricularesByUsuarioId(String usuarioId) throws EmptyResultDataAccessException{
		List<UnidadeCurricularDto> query = dbConnection.query(queries.getGetLatestAtividadesUnidadesCurricularesByUsuarioId(), new UnidadeCurricularMapper(), new Object[] {usuarioId});
		if(query.size() == 0){
			throw new EmptyResultDataAccessException(usuarioId, 1, null);
		}
		return query;
	}
}
