package br.com.sisnema.financeiroweb.negocio;

import java.util.List;

import br.com.sisnema.financeiroweb.dao.UsuariopermissaoDAO;
import br.com.sisnema.financeiroweb.model.Usuariopermissao;
import br.com.sisnema.financeiroweb.util.DAOException;
import br.com.sisnema.financeiroweb.util.RNException;

public class UsuariopermissaoRN extends RN<Usuariopermissao> {

	public UsuariopermissaoRN() {
		super(new UsuariopermissaoDAO());
		
	}

	@Override
	public void salvar(Usuariopermissao model) throws RNException {
		try {
			dao.salvar(model);
		} catch (DAOException e) {
			throw new RNException("Nao foi possivel inserir o usuarioPermissao. Erro: "+e.getMessage());
		}		
	}

	@Override
	public void excluir(Usuariopermissao model) throws RNException {
		try {
			dao.excluir(model);
		} catch (DAOException e) {
			throw new RNException("Nao foi possivel excluir o usuarioPermissao. Erro: "+e.getMessage());
		}
		
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
