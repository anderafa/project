package br.com.sisnema.financeiroweb.dao;

import java.util.List;

import br.com.sisnema.financeiroweb.model.Filial;
import br.com.sisnema.financeiroweb.util.DAOException;

public class FilialDAO extends DAO<Filial> {	

	@Override
	public void salvar(Filial model) throws DAOException {
		sessao.saveOrUpdate(model);
	}

	@Override
	public void excluir(Filial model) throws DAOException {
		sessao.delete(model);
	}

	@Override
	public Filial obterPorId(Filial filtro) {		
		return (Filial) sessao.get(Filial.class, filtro.getCodFilial());
	}

	@Override
	public List<Filial> pesquisar(Filial filtros) {		
		return sessao.createCriteria(Filial.class).list();
	}

}
