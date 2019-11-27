package br.ufc.quixada.dao;

import java.util.List;

import br.ufc.quixada.model.*;


public interface LimpezaDAO  extends GenericDao<Limpeza> {
	
	
	public List<Limpeza> findByCargo(String cargo);


}
