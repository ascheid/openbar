package br.com.scheid.viewmodel;

import java.util.List;

import br.com.scheid.dao.GenericDAO;
import br.com.scheid.dao.IngressoQueryGenerator;
import br.com.scheid.filters.IngressoFilter;
import br.com.scheid.model.Ingresso;

public class IU03_01ViewModel {
	
	public GenericDAO dao;
	
	public IU03_01ViewModel(){
		this.dao = new GenericDAO();
	}
	public List<Ingresso> buscarIngresso(IngressoFilter ingf){
		IngressoQueryGenerator iqg = new IngressoQueryGenerator();
		return dao.listarTodos(Ingresso.class, iqg.getQuery(ingf));
	}
}
