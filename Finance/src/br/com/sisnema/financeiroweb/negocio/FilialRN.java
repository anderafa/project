package br.com.sisnema.financeiroweb.negocio;

import java.util.List;

import br.com.sisnema.financeiroweb.dao.FilialDAO;
import br.com.sisnema.financeiroweb.model.Filial;
import br.com.sisnema.financeiroweb.util.DAOException;
import br.com.sisnema.financeiroweb.util.RNException;

public class FilialRN extends RN<Filial> {

	public FilialRN() {
		super(new FilialDAO());
	}

	@Override
	public void salvar(Filial model) throws RNException {
		try {
			dao.salvar(model);
		} catch (DAOException e) {
			throw new RNException("Nao foi possivel inserir a Filial. Erro: "+e.getMessage());
		}		
	}

	@Override
	public void excluir(Filial model) throws RNException {
		try {
			dao.excluir(model);
		} catch (DAOException e) {
			throw new RNException("Nao foi possivel excluir a Filial. Erro: "+e.getMessage());
		}
		
	}

	@Override
	public Filial obterPorId(Filial filtro) {		
		return dao.obterPorId(filtro);
	}

	@Override
	public List<Filial> pesquisar(Filial filtros) {		
		return dao.pesquisar(filtros);
	}

}
