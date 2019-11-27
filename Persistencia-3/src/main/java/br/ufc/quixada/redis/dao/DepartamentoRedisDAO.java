package br.ufc.quixada.redis.dao;

import br.ufc.quixada.dao.*;
import br.ufc.quixada.model.*;


public class DepartamentoRedisDAO  extends GenericRedisDAO<Departamento> implements DepartamentoDAO {
	
	public DepartamentoRedisDAO() {
		super(Departamento.class);
	}
	
}
