package br.com.sisnema.financeiroweb.dao;

import java.util.List;

import br.com.sisnema.financeiroweb.model.Usuariopermissao;
import br.com.sisnema.financeiroweb.util.DAOException;

public class UsuariopermissaoDAO extends DAO<Usuariopermissao> {

	@Override
	public void salvar(Usuariopermissao model) throws DAOException {
		sessao.saveOrUpdate(model);
	}

	@Override
	public void excluir(Usuariopermissao model) throws DAOException {
		sessao.delete(model);
		sessao.flush();
	}

	@Override
	public Usuariopermissao obterPorId(Usuariopermissao filtro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuariopermissao> pesquisar(Usuariopermissao filtros) {
		// TODO Auto-generated method stub
		return null;
	}

}
