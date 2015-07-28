package br.com.sisnema.financeiroweb.action;

import java.util.List;
import java.util.Set;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.sisnema.financeiroweb.model.Usuario;
import br.com.sisnema.financeiroweb.negocio.UsuarioRN;
import br.com.sisnema.financeiroweb.util.RNException;

@ManagedBean
@RequestScoped
public class UsuarioBean extends ActionBean {

	private Usuario usuario = new Usuario();
	private String confirmaSenha;
	
	private List<Usuario> lista;
	private String destinoSalvar;	

	public String novo() {
		destinoSalvar = "usuarioSucesso";
		usuario = new Usuario();
		usuario.setAtivo(true);
		return "usuario";
	}
	
	public String editar() {
		confirmaSenha = usuario.getSenha();
		return "/publico/usuario";
	}

	public void excluir(){
		try {
			UsuarioRN urn = new UsuarioRN();
			urn.excluir(usuario);
			lista = null;
		} catch (RNException e) {
			apresentarMenssagemDeErro(e);
		}
	}
	
	public void ativar(){
		usuario.setAtivo(!usuario.isAtivo());
	}

	public String atribuiPermissao(Usuario usuario, String permissao) {

		this.usuario = usuario;

		Set<String> permissoes = this.usuario.getPermissao();

		if (permissoes.contains(permissao)) {
			permissoes.remove(permissao);
		} else {
			permissoes.add(permissao);
		}
		return null;
	}
	

	public String salvar() {
		
		try {
			
			if (!usuario.getSenha().equals(confirmaSenha)) {
				apresentarMenssagemDeErro("Senha confirmada incorretamente");
	 			return null;
			}
		
			UsuarioRN urn = new UsuarioRN();
			urn.salvar(usuario);
			
		} catch (RNException e) {
			apresentarMenssagemDeErro(e);
		}

		return destinoSalvar;
	}

	
	public List<Usuario> getLista() {
		if(lista == null){
			lista = new UsuarioRN().pesquisar(null);
		}
		return lista;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getConfirmaSenha() {
		return confirmaSenha;
	}

	public void setConfirmaSenha(String confirmaSenha) {
		this.confirmaSenha = confirmaSenha;
	}

	public void setLista(List<Usuario> lista) {
		this.lista = lista;
	}

	public String getDestinoSalvar() {
		return destinoSalvar;
	}

	public void setDestinoSalvar(String destinoSalvar) {
		this.destinoSalvar = destinoSalvar;
	}

	
}
