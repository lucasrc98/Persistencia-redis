package br.ufc.quixada.redis.dao;

import java.util.List;
import java.util.Set;

import br.ufc.quixada.RedisUtil.RedisUtil;
import br.ufc.quixada.dao.GenericDao;
import redis.clients.jedis.Jedis;

public class GenericRedisDAO<T> implements GenericDao<T> {
	private static Jedis jedis = new Jedis("localhost");
	public GenericRedisDAO(Class<T> persistenceClass) {
	}

	public void save() {
		RedisUtil.connection();
		// TODO Auto-generated method stub
	}

	public void deleteById(int idDepartamento , String tableName) {
		Set<String> keys = jedis.keys(tableName+":"+String.valueOf(idDepartamento)+":*");
		for(String key : keys) {
			jedis.del(key);
		}
	}
	public List<String> findById(String T) {

		return null;		

	}
	public List<T> findAll() {
		return null;
	}

	public void close() {
		// TODO Auto-generated method stub
		RedisUtil.closejedis();
	}

	public void deleteById(String T) {
		// TODO Auto-generated method stub
		
	}

}
