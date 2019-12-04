package br.ufc.quixada.redis.dao;

import br.ufc.quixada.dao.*;
import br.ufc.quixada.model.*;

public class PesquisadorRedisDAO extends GenericRedisDAO<Pesquisador> implements PesquisadorDAO {
	
	public PesquisadorRedisDAO() {
		super(Pesquisador.class);
	}
	
}
