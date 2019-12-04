package br.ufc.quixada.redis.dao;

import java.util.List;


import br.ufc.quixada.dao.*;
import br.ufc.quixada.model.Limpeza;

public class LimpezaRedisDAO extends GenericRedisDAO<Limpeza> implements LimpezaDAO {

	public LimpezaRedisDAO() {
		super(Limpeza.class);
	}

	public List<Limpeza> findByCargo(String cargo) {
		// TODO Auto-generated method stub
		return null;
	}
//	@SuppressWarnings("unchecked")
//	@Override
//	public List<Limpeza> findByCargo(String cargo) {
//		EntityManager em = JPAUtil.getEntityManager();
//		Query query = em.createQuery("SELECT L FROM Limpeza L"
//									+ " WHERE L.cargo LIKE :cargo");
//		query.setParameter("cargo", cargo+"%");
//		return query.getResultList();
//	}	
	
	

	
}
