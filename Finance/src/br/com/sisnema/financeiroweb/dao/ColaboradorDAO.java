package br.com.sisnema.financeiroweb.dao;

import java.util.List;

import br.com.sisnema.financeiroweb.model.Colaborador;
import br.com.sisnema.financeiroweb.util.DAOException;

public class ColaboradorDAO extends DAO<Colaborador> {

	@Override
	public void salvar(Colaborador model) throws DAOException {
		sessao.saveOrUpdate(model);

	}

	@Override
	public void excluir(Colaborador model) throws DAOException {
		sessao.delete(model);
	}

	@Override
	public Colaborador obterPorId(Colaborador filtro) {		
		return (Colaborador) sessao.get(Colaborador.class, filtro);
	}

	@Override
	public List<Colaborador> pesquisar(Colaborador filtros) {		
		return sessao.createCriteria(Colaborador.class).list();
	}

}
