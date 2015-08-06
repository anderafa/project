package br.com.sisnema.financeiroweb.negocio;

import java.util.List;

import br.com.sisnema.financeiroweb.dao.EmpresaDAO;
import br.com.sisnema.financeiroweb.model.Empresa;
import br.com.sisnema.financeiroweb.util.DAOException;
import br.com.sisnema.financeiroweb.util.RNException;

public class EmpresaRN extends RN<Empresa> {
	

	public EmpresaRN() {
		super(new EmpresaDAO());		
	}

	@Override
	public void salvar(Empresa model) throws RNException {
		try{
			dao.salvar(model);
		} catch (DAOException e) {
			throw new RNException("Não foi possivel atualizar a empresa. Erro: "+e.getMessage());
		}	
	}

	@Override
	public void excluir(Empresa model) throws RNException {
		try{
			dao.excluir(model);
		} catch (DAOException e) {
			throw new RNException("Não foi possivel excluir a empresa. Erro: "+e.getMessage());
		}
		
	}

	@Override
	public Empresa obterPorId(Empresa filtro) {		
		return dao.obterPorId(filtro);
	}

	@Override
	public List<Empresa> pesquisar(Empresa filtros) {		
		return dao.pesquisar(filtros);
	}

}
