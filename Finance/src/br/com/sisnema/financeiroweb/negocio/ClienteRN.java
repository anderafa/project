package br.com.sisnema.financeiroweb.negocio;

import java.util.List;

import br.com.sisnema.financeiroweb.dao.ClienteDAO;
import br.com.sisnema.financeiroweb.model.Cliente;
import br.com.sisnema.financeiroweb.util.DAOException;
import br.com.sisnema.financeiroweb.util.RNException;


public class ClienteRN extends RN<Cliente>{

	public ClienteRN() {
		super(new ClienteDAO());		
	}

	@Override
	public void salvar(Cliente model) throws RNException {
		try {
			dao.salvar(model);
		} catch (DAOException e) {
			throw new RNException("Não foi possivel inserir o cliente. Erro: "+e.getMessage());
		}		
	}

	@Override
	public void excluir(Cliente model) throws RNException {
		try {
			dao.excluir(model);
		} catch (DAOException e) {
			throw new RNException("Não foi possivel excluir o cliente. Erro: "+e.getMessage());
		}		
	}

	@Override
	public Cliente obterPorId(Cliente filtro) {
		return dao.obterPorId(filtro);
	}

	@Override
	public List<Cliente> pesquisar(Cliente filtros) {
		return dao.pesquisar(filtros);
	}

}
