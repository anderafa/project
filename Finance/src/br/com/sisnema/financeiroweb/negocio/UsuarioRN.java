package br.com.sisnema.financeiroweb.negocio;

import java.util.Date;
import java.util.List;

import br.com.sisnema.financeiroweb.action.ColaboradorRN;
import br.com.sisnema.financeiroweb.dao.UsuarioDAO;
import br.com.sisnema.financeiroweb.model.Empresa;
import br.com.sisnema.financeiroweb.model.Filial;
import br.com.sisnema.financeiroweb.model.Usuario;
import br.com.sisnema.financeiroweb.model.Usuariopermissao;
import br.com.sisnema.financeiroweb.util.DAOException;
import br.com.sisnema.financeiroweb.util.RNException;

public class UsuarioRN extends RN<Usuario> {
	
	public UsuarioRN() {
		// Aqui informamos qual instancia sera armazenada no atributo
		// gen�rico dao da classe pai RN.
		// N�O ENTENDEU, da um F3 sob a palavra SUPER
		super(new UsuarioDAO());
	}

	@Override
	public void salvar(Usuario model) throws RNException {		
		if(model.getCodUsuario() == null  || model.getCodUsuario() ==  0){
			try {
				
				Usuario usuarioExistenteComLogin = buscarPorLogin(model.getLogin());
				
				if(usuarioExistenteComLogin != null){
					throw new RNException("Login ja existe!.");
				}				
				
				Empresa emp = new Empresa();
				
				EmpresaRN empresaRN = new EmpresaRN();
				
				empresaRN.salvar(emp);
				
				Filial fil = new Filial(emp, model.getColaborador().getNomefantasia(), true);
				
				FilialRN filialRN = new FilialRN();
				filialRN.salvar(fil);
				
				model.getColaborador().setEmpresa(emp);				
				model.getColaborador().setDatacriacao(new Date());
				
				ColaboradorRN colRN = new ColaboradorRN();				
				
				colRN.salvar(model.getColaborador());				
				
				//model.setCodUsuario(model.getColaborador().getColCodigo());
				model.setColaborador(model.getColaborador());
				model.setEmpresa(emp.getCodempresa());
				model.setAtivo(true);				
				
				Usuariopermissao userPer = new Usuariopermissao(model,emp.getCodempresa(),"ROLE_USUARIO");
				userPer.setUspCodigo(model.getCodUsuario());				
				
				UsuariopermissaoRN userPerRN = new UsuariopermissaoRN();
				userPerRN.salvar(userPer);
				
				dao.salvar(model);		
				
			} catch (DAOException e) {
				throw new RNException("Nao foi possivel inserir o usuario. Erro: "+e.getMessage());
			}
		}
		
//		Usuariopermissao userPer = new Usuariopermissao();
//		userPer.setPermissao("ROLE_USUARIO");
//		userPer.setUsuario(model);
//		
//		UsuariopermissaoId userPerId = new UsuariopermissaoId();
//		userPerId.setEmpresa(emp.getCodigo());
//		userPerId.setUsuario(model.getId().getCodigo());
//		
//		userPer.setId(userPerId);		
//		} else {
//			try {
//				// Transformamos a variavel GENERICA dao em uma variavel
//				// mais especifica do tipo UsuarioDAO
//				UsuarioDAO userDAO = (UsuarioDAO) dao;
//				userDAO.atualizar(model);
//				
//				// vers�o reduzida dos comandos acima
//				// ((UsuarioDAO) dao).atualizar(model);
//				
//			} catch (DAOException e) {
//				throw new RNException("N�o foi poss�vel atualizar o usuario. Erro: "+e.getMessage());
//			}
//		}
	}

	@Override
	public void excluir(Usuario model) throws RNException {
		try {
			dao.excluir(model);
		} catch (DAOException e) {
			throw new RNException("N�o foi poss�vel excluir o usuario. Erro: "+e.getMessage());
		}
	}

	@Override
	public Usuario obterPorId(Usuario filtro) {
		return dao.obterPorId(filtro);
	}

	@Override
	public List<Usuario> pesquisar(Usuario filtros) {
		return dao.pesquisar(filtros);
	}
	

	public Usuario buscarPorLogin(String login){
		// DownCasting: dao � muito generico e nao sabe dos m�todos
		//			    especificos de UsuarioDAO
		
		return ((UsuarioDAO) dao).buscarPorLogin(login);
	}
	
}



















