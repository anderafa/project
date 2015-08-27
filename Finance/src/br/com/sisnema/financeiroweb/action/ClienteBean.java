package br.com.sisnema.financeiroweb.action;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.context.RequestContext;

import br.com.sisnema.financeiroweb.model.Cliente;
import br.com.sisnema.financeiroweb.model.Colaborador;
import br.com.sisnema.financeiroweb.model.Empresa;
import br.com.sisnema.financeiroweb.negocio.ClienteRN;
import br.com.sisnema.financeiroweb.negocio.ColaboradorRN;
import br.com.sisnema.financeiroweb.util.ContextoUtil;
import br.com.sisnema.financeiroweb.util.FormatUtil;
import br.com.sisnema.financeiroweb.util.RNException;

@ManagedBean
@ViewScoped
public class ClienteBean extends ActionBean {
	
	private List<Cliente> lista;	
	private Cliente cliente = new Cliente();	
	private Colaborador colaborador = new Colaborador();
	private String mascaraInscricao;	
	
//	@PostConstruct
//    public void init() {
//        lista = null;
//    }	

	public void salvar() {
		try {			
			ContextoBean contextoBean = ContextoUtil.getContextoBean();		
			
			colaborador.setContribuinte(false);
			colaborador.setDatacriacao(new Date());			
			colaborador.setOptantesimplesnacional(false);
			colaborador.setEmpresa(new Empresa(contextoBean.getUsuarioLogado().getEmpresa()));
			
			ColaboradorRN colRN = new ColaboradorRN();			
			colRN.salvar(colaborador);
					
			cliente.setSituacao(true);		
			cliente.setCodColaborador(colaborador.getColCodigo());
			cliente.setEmpresa(contextoBean.getUsuarioLogado().getEmpresa());
			
			ClienteRN clienteRN = new ClienteRN(); 
			clienteRN.salvar(cliente);			
			lista = null;	
			closeDialog();			
		} catch (RNException e) {
			apresentarMenssagemDeErro(e);
		}
	}

	public List<Cliente> getLista() {
		if (lista == null) {	
			ClienteRN cliRN = new ClienteRN(); 	
			lista = cliRN.pesquisar(null);
		}
		return lista;
	}
	
	public void excluir() {
		ClienteRN cliRN = new ClienteRN(); 
		try {			
			cliRN.excluir(cliente);	
		} catch (RNException e) {
			apresentarMenssagemDeErro(e);
			return;
		}
		lista = null;
	}
	
	
	public void editar() {
		
	}
	
	public void closeDialog() {	      
	    RequestContext.getCurrentInstance().closeDialog("cadcliente");
  }
	
	public void openDialog() {
		
		colaborador = new Colaborador();
		cliente = new Cliente();
		
		colaborador.setDatacriacao(new Date());
		colaborador.setTipoinscricao("CPF");
		
		Map<String,Object> options = new HashMap<String, Object>();
	    options.put("modal", true);
	    options.put("draggable", false);
	    options.put("resizable", false);
	    options.put("contentWidth", 1000); //Largura
	    options.put("contentHeight", 550);
      
	    RequestContext.getCurrentInstance().openDialog("cadcliente", options, null);
	} 
	
	public Colaborador getColaborador() {
		return colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
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
	
	public String getMascaraInscricao() {
		
		mascaraInscricao = "";
		if  ((colaborador.getTipoinscricao() != null) && ("CPF".contains(colaborador.getTipoinscricao()))){
			mascaraInscricao = FormatUtil.getFormatcpf();
		}
		
		if ((colaborador.getTipoinscricao() != null) && ("CNPJ".contains(colaborador.getTipoinscricao()))){
			mascaraInscricao = FormatUtil.getFormatcnpj();
		}
		
		return mascaraInscricao;
	}

	public void setMascaraInscricao(String mascaraInscricao) {
		this.mascaraInscricao = mascaraInscricao;
	}

	

	
	
}
