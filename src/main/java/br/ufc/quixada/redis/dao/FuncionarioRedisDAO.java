package br.ufc.quixada.redis.dao;

import br.ufc.quixada.dao.*;
import br.ufc.quixada.model.Funcionario;
public class FuncionarioRedisDAO extends GenericRedisDAO<Funcionario> implements FuncionarioDAO {

	public FuncionarioRedisDAO() {
		super(Funcionario.class);  
	}

}
