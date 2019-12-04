package br.ufc.quixada.redis.dao;

import br.ufc.quixada.dao.*;
import br.ufc.quixada.model.Dependentes;

public class DependenteRedisDAO extends GenericRedisDAO<Dependentes> implements DependenteDAO {

	public DependenteRedisDAO() {
		super(Dependentes.class);
		
	}
	
	

}
