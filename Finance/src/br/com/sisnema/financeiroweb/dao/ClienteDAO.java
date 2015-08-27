package br.com.sisnema.financeiroweb.dao;

import java.util.List;

import br.com.sisnema.financeiroweb.model.Cliente;
import br.com.sisnema.financeiroweb.model.Colaborador;
import br.com.sisnema.financeiroweb.util.DAOException;

public class ClienteDAO extends DAO<Cliente> {

	@Override
	public void salvar(Cliente model) throws DAOException {
		sessao.saveOrUpdate(model);
	}

	@Override
	public void excluir(Cliente model) throws DAOException {
		sessao.delete(model);
		sessao.flush();
	}

	@Override
	public Cliente obterPorId(Cliente filtro) {
		return (Cliente) sessao.get(Cliente.class, filtro);
	}

	@Override
	public List<Cliente> pesquisar(Cliente filtros) {
		return sessao.createCriteria(Cliente.class).list();
	}

}
