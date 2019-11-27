package br.ufc.quixada.redis.dao;

import br.ufc.quixada.dao.*;
import br.ufc.quixada.model.Endereco;

public class EnderecoRedisDAO extends GenericRedisDAO<Endereco> implements EnderecoDAO  {
	
	public EnderecoRedisDAO() {
		super(Endereco.class);
	}
	
}
