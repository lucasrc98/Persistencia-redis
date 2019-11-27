package br.ufc.quixada.dao;

import java.util.List;


public interface GenericDao<T> {
	public void save();
	public void deleteById(String T);
	public List<String> findById(String T);
	public List<T> findAll();
	public void close();

}
