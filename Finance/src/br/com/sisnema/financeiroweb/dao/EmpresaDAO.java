package br.com.sisnema.financeiroweb.dao;

import java.util.List;

import br.com.sisnema.financeiroweb.model.Empresa;
import br.com.sisnema.financeiroweb.util.DAOException;

public class EmpresaDAO extends DAO<Empresa> {

	@Override
	public void salvar(Empresa model) throws DAOException {
		sessao.saveOrUpdate(model);		
	}

	@Override
	public void excluir(Empresa model) throws DAOException {
		sessao.delete(model);
		sessao.flush();
	}

	@Override
	public Empresa obterPorId(Empresa filtro) {		
		return (Empresa) sessao.get(Empresa.class, filtro.getCodigo());
	}

	@Override
	public List<Empresa> pesquisar(Empresa filtros) {		
		return sessao.createCriteria(Empresa.class).list();
	}

}
