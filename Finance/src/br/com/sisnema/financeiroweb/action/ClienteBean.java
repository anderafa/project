package br.com.sisnema.financeiroweb.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.primefaces.context.RequestContext;

import br.com.sisnema.financeiroweb.model.Cliente;
import br.com.sisnema.financeiroweb.negocio.ClienteRN;
import br.com.sisnema.financeiroweb.util.RNException;

@ManagedBean
@RequestScoped
public class ClienteBean extends ActionBean {
	
	private List<Cliente> lista;	
	private Cliente cliente = new Cliente();
	
	public void novo() {
		cliente = new Cliente();		
	}

	public List<Cliente> getLista() {
		if (lista == null) {
			
			ClienteRN clienteRN = new ClienteRN(); 
			
			lista = clienteRN.pesquisar(null);
		}
		return lista;
	}
	
	public void excluir() {
		ClienteRN colRN = new ClienteRN(); 
		try {
			cliente = colRN.obterPorId(cliente);
			colRN.excluir(cliente);				
			
		} catch (RNException e) {
			apresentarMenssagemDeErro(e);
			return;
		}
		lista = null;
	}
	
	public void editar() {
		
	}
	
	public void openDialog() {		
	  
	  Map<String,Object> options = new HashMap<String, Object>();
      options.put("modal", true);
      options.put("draggable", false);
      options.put("resizable", false);
      options.put("contentHeight", 320); 
      
      RequestContext.getCurrentInstance().openDialog("cadcliente", options, null);      
  }

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setLista(List<Cliente> lista) {
		this.lista = lista;
	}

	
	
	
}
