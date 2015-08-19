package br.com.sisnema.financeiroweb.negocio;

import java.util.List;

import br.com.sisnema.financeiroweb.dao.ColaboradorDAO;
import br.com.sisnema.financeiroweb.model.Colaborador;
import br.com.sisnema.financeiroweb.util.DAOException;
import br.com.sisnema.financeiroweb.util.RNException;

public class ColaboradorRN extends RN<Colaborador> {

	public ColaboradorRN() {
		super(new ColaboradorDAO());
		
	}

	@Override
	public void salvar(Colaborador model) throws RNException {
		try {
			dao.salvar(model);
		} catch (DAOException e) {
			throw new RNException("Não foi possivel inserir o colaborador. Erro: "+e.getMessage());
		}		
	}

	@Override
	public void excluir(Colaborador model) throws RNException {
		try {
			dao.excluir(model);
		} catch (DAOException e) {
			throw new RNException("Não foi possivel excluir o colaborador. Erro: "+e.getMessage());
		}
		
	}

	@Override
	public Colaborador obterPorId(Colaborador filtro) {		
		return dao.obterPorId(filtro);
	}

	@Override
	public List<Colaborador> pesquisar(Colaborador filtros) {		
		return dao.pesquisar(filtros);
	}

}
