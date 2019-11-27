package br.ufc.quixada.redis.dao;

import br.ufc.quixada.dao.*;
import br.ufc.quixada.model.*;
public class ProjetoRedisDAO extends GenericRedisDAO<Projeto> implements ProjetoDAO {

	public ProjetoRedisDAO() {
		super(Projeto.class);
		
	}
	
	

}
