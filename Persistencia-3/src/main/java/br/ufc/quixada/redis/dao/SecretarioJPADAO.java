package br.ufc.quixada.redis.dao;

import br.ufc.quixada.dao.*;
import br.ufc.quixada.model.*;
public class SecretarioJPADAO extends GenericRedisDAO<Secretario> implements SecretarioDAO{

	public SecretarioJPADAO() {
		super(Secretario.class);
	}
	
}
