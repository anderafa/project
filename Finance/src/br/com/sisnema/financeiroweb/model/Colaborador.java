package br.com.sisnema.financeiroweb.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "colaborador", schema = "public")
public class Colaborador implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private ColaboradorId id;
	private Empresa empresa;
	private String apelido;
	private String razaoSocial;
	private String nomeFantasia;
	private String tipoInscricao;
	private String incricao;
	private String incricaoEstadual;
	private String inscricaoMunicipal;
	private String inscricaoSuframa;
	private Date dataCriacao;
	private String email;
	private String observacao;
	private String contato;
	private Integer ramal;
	private String caixaPostal;
	private boolean contribuinte;
	private String tituloEleitor;
	private String carteiraMotorista;
	private Date vencimentoCarteiraMotorista;
	private Integer atividadeComercial;
	private String pis;
	private Date dataAtualizacao;
	private Integer pais;
	private boolean optanteSimplesNacional;
	private Fornecedor fornecedor;
	private Cliente cliente;
	private Set<Colaboradorendereco> colaboradorenderecos = new HashSet<Colaboradorendereco>(0);
	private Usuario usuario;	

	@EmbeddedId	
	@AttributeOverrides({
			@AttributeOverride(name = "empresa", column = @Column(name = "empresa", nullable = false)),
			@AttributeOverride(name = "codigo", column = @Column(name = "codigo", nullable = false)) })
	public ColaboradorId getId() {
		return this.id;
	}

	public void setId(ColaboradorId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "empresa", nullable = false, insertable = false, updatable = false)
	public Empresa getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	@Column(name = "apelido", length = 50)
	public String getApelido() {
		return this.apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	@Column(name = "razaoSocial", length = 80)
	public String getRazaoSocial() {
		return this.razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	@Column(name = "nomeFantasia", length = 80)
	public String getNomeFantasia() {
		return this.nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	@Column(name = "tipoInscricao", length = 4)
	public String getTipoInscricao() {
		return this.tipoInscricao;
	}

	public void setTipoInscricao(String tipoInscricao) {
		this.tipoInscricao = tipoInscricao;
	}

	@Column(name = "incricao", length = 14)
	public String getIncricao() {
		return this.incricao;
	}

	public void setIncricao(String incricao) {
		this.incricao = incricao;
	}

	@Column(name = "incricaoEstadual", length = 20)
	public String getIncricaoEstadual() {
		return this.incricaoEstadual;
	}

	public void setIncricaoEstadual(String incricaoEstadual) {
		this.incricaoEstadual = incricaoEstadual;
	}

	@Column(name = "inscricaoMunicipal", length = 20)
	public String getInscricaoMunicipal() {
		return this.inscricaoMunicipal;
	}

	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}

	@Column(name = "inscricaoSuframa", length = 20)
	public String getInscricaoSuframa() {
		return this.inscricaoSuframa;
	}

	public void setInscricaoSuframa(String inscricaoSuframa) {
		this.inscricaoSuframa = inscricaoSuframa;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dataCriacao", nullable = false, length = 13)
	public Date getDataCriacao() {
		return this.dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	@Column(name = "email", length = 200)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "observacao")
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Column(name = "contato", length = 50)
	public String getContato() {
		return this.contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	@Column(name = "ramal")
	public Integer getRamal() {
		return this.ramal;
	}

	public void setRamal(Integer ramal) {
		this.ramal = ramal;
	}

	@Column(name = "caixaPostal", length = 15)
	public String getCaixaPostal() {
		return this.caixaPostal;
	}

	public void setCaixaPostal(String caixaPostal) {
		this.caixaPostal = caixaPostal;
	}

	@Column(name = "contribuinte", nullable = false)
	public boolean isContribuinte() {
		return this.contribuinte;
	}

	public void setContribuinte(boolean contribuinte) {
		this.contribuinte = contribuinte;
	}

	@Column(name = "tituloEleitor", length = 11)
	public String getTituloEleitor() {
		return this.tituloEleitor;
	}

	public void setTituloEleitor(String tituloEleitor) {
		this.tituloEleitor = tituloEleitor;
	}

	@Column(name = "carteiraMotorista", length = 11)
	public String getCarteiraMotorista() {
		return this.carteiraMotorista;
	}

	public void setCarteiraMotorista(String carteiraMotorista) {
		this.carteiraMotorista = carteiraMotorista;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "vencimentoCarteiraMotorista", length = 13)
	public Date getVencimentoCarteiraMotorista() {
		return this.vencimentoCarteiraMotorista;
	}

	public void setVencimentoCarteiraMotorista(Date vencimentoCarteiraMotorista) {
		this.vencimentoCarteiraMotorista = vencimentoCarteiraMotorista;
	}

	@Column(name = "atividadeComercial")
	public Integer getAtividadeComercial() {
		return this.atividadeComercial;
	}

	public void setAtividadeComercial(Integer atividadeComercial) {
		this.atividadeComercial = atividadeComercial;
	}

	@Column(name = "pis", length = 11)
	public String getPis() {
		return this.pis;
	}

	public void setPis(String pis) {
		this.pis = pis;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dataAtualizacao", length = 29)
	public Date getDataAtualizacao() {
		return this.dataAtualizacao;
	}

	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	@Column(name = "pais")
	public Integer getPais() {
		return this.pais;
	}

	public void setPais(Integer pais) {
		this.pais = pais;
	}

	@Column(name = "optanteSimplesNacional", nullable = false)
	public boolean isOptanteSimplesNacional() {
		return this.optanteSimplesNacional;
	}

	public void setOptanteSimplesNacional(boolean optanteSimplesNacional) {
		this.optanteSimplesNacional = optanteSimplesNacional;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "colaborador")
	public Fornecedor getFornecedor() {
		return this.fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "colaborador")
	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "colaborador")
	public Set<Colaboradorendereco> getColaboradorenderecos() {
		return this.colaboradorenderecos;
	}

	public void setColaboradorenderecos(
			Set<Colaboradorendereco> colaboradorenderecos) {
		this.colaboradorenderecos = colaboradorenderecos;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "colaborador")
	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apelido == null) ? 0 : apelido.hashCode());
		result = prime
				* result
				+ ((atividadeComercial == null) ? 0 : atividadeComercial
						.hashCode());
		result = prime * result
				+ ((caixaPostal == null) ? 0 : caixaPostal.hashCode());
		result = prime
				* result
				+ ((carteiraMotorista == null) ? 0 : carteiraMotorista
						.hashCode());
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime
				* result
				+ ((colaboradorenderecos == null) ? 0 : colaboradorenderecos
						.hashCode());
		result = prime * result + ((contato == null) ? 0 : contato.hashCode());
		result = prime * result + (contribuinte ? 1231 : 1237);
		result = prime * result
				+ ((dataAtualizacao == null) ? 0 : dataAtualizacao.hashCode());
		result = prime * result
				+ ((dataCriacao == null) ? 0 : dataCriacao.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
		result = prime * result
				+ ((fornecedor == null) ? 0 : fornecedor.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((incricao == null) ? 0 : incricao.hashCode());
		result = prime
				* result
				+ ((incricaoEstadual == null) ? 0 : incricaoEstadual.hashCode());
		result = prime
				* result
				+ ((inscricaoMunicipal == null) ? 0 : inscricaoMunicipal
						.hashCode());
		result = prime
				* result
				+ ((inscricaoSuframa == null) ? 0 : inscricaoSuframa.hashCode());
		result = prime * result
				+ ((nomeFantasia == null) ? 0 : nomeFantasia.hashCode());
		result = prime * result
				+ ((observacao == null) ? 0 : observacao.hashCode());
		result = prime * result + (optanteSimplesNacional ? 1231 : 1237);
		result = prime * result + ((pais == null) ? 0 : pais.hashCode());
		result = prime * result + ((pis == null) ? 0 : pis.hashCode());
		result = prime * result + ((ramal == null) ? 0 : ramal.hashCode());
		result = prime * result
				+ ((razaoSocial == null) ? 0 : razaoSocial.hashCode());
		result = prime * result
				+ ((tipoInscricao == null) ? 0 : tipoInscricao.hashCode());
		result = prime * result
				+ ((tituloEleitor == null) ? 0 : tituloEleitor.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
		result = prime
				* result
				+ ((vencimentoCarteiraMotorista == null) ? 0
						: vencimentoCarteiraMotorista.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Colaborador)) {
			return false;
		}
		Colaborador other = (Colaborador) obj;
		if (apelido == null) {
			if (other.apelido != null) {
				return false;
			}
		} else if (!apelido.equals(other.apelido)) {
			return false;
		}
		if (atividadeComercial == null) {
			if (other.atividadeComercial != null) {
				return false;
			}
		} else if (!atividadeComercial.equals(other.atividadeComercial)) {
			return false;
		}
		if (caixaPostal == null) {
			if (other.caixaPostal != null) {
				return false;
			}
		} else if (!caixaPostal.equals(other.caixaPostal)) {
			return false;
		}
		if (carteiraMotorista == null) {
			if (other.carteiraMotorista != null) {
				return false;
			}
		} else if (!carteiraMotorista.equals(other.carteiraMotorista)) {
			return false;
		}
		if (cliente == null) {
			if (other.cliente != null) {
				return false;
			}
		} else if (!cliente.equals(other.cliente)) {
			return false;
		}
		if (colaboradorenderecos == null) {
			if (other.colaboradorenderecos != null) {
				return false;
			}
		} else if (!colaboradorenderecos.equals(other.colaboradorenderecos)) {
			return false;
		}
		if (contato == null) {
			if (other.contato != null) {
				return false;
			}
		} else if (!contato.equals(other.contato)) {
			return false;
		}
		if (contribuinte != other.contribuinte) {
			return false;
		}
		if (dataAtualizacao == null) {
			if (other.dataAtualizacao != null) {
				return false;
			}
		} else if (!dataAtualizacao.equals(other.dataAtualizacao)) {
			return false;
		}
		if (dataCriacao == null) {
			if (other.dataCriacao != null) {
				return false;
			}
		} else if (!dataCriacao.equals(other.dataCriacao)) {
			return false;
		}
		if (email == null) {
			if (other.email != null) {
				return false;
			}
		} else if (!email.equals(other.email)) {
			return false;
		}
		if (empresa == null) {
			if (other.empresa != null) {
				return false;
			}
		} else if (!empresa.equals(other.empresa)) {
			return false;
		}
		if (fornecedor == null) {
			if (other.fornecedor != null) {
				return false;
			}
		} else if (!fornecedor.equals(other.fornecedor)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (incricao == null) {
			if (other.incricao != null) {
				return false;
			}
		} else if (!incricao.equals(other.incricao)) {
			return false;
		}
		if (incricaoEstadual == null) {
			if (other.incricaoEstadual != null) {
				return false;
			}
		} else if (!incricaoEstadual.equals(other.incricaoEstadual)) {
			return false;
		}
		if (inscricaoMunicipal == null) {
			if (other.inscricaoMunicipal != null) {
				return false;
			}
		} else if (!inscricaoMunicipal.equals(other.inscricaoMunicipal)) {
			return false;
		}
		if (inscricaoSuframa == null) {
			if (other.inscricaoSuframa != null) {
				return false;
			}
		} else if (!inscricaoSuframa.equals(other.inscricaoSuframa)) {
			return false;
		}
		if (nomeFantasia == null) {
			if (other.nomeFantasia != null) {
				return false;
			}
		} else if (!nomeFantasia.equals(other.nomeFantasia)) {
			return false;
		}
		if (observacao == null) {
			if (other.observacao != null) {
				return false;
			}
		} else if (!observacao.equals(other.observacao)) {
			return false;
		}
		if (optanteSimplesNacional != other.optanteSimplesNacional) {
			return false;
		}
		if (pais == null) {
			if (other.pais != null) {
				return false;
			}
		} else if (!pais.equals(other.pais)) {
			return false;
		}
		if (pis == null) {
			if (other.pis != null) {
				return false;
			}
		} else if (!pis.equals(other.pis)) {
			return false;
		}
		if (ramal == null) {
			if (other.ramal != null) {
				return false;
			}
		} else if (!ramal.equals(other.ramal)) {
			return false;
		}
		if (razaoSocial == null) {
			if (other.razaoSocial != null) {
				return false;
			}
		} else if (!razaoSocial.equals(other.razaoSocial)) {
			return false;
		}
		if (tipoInscricao == null) {
			if (other.tipoInscricao != null) {
				return false;
			}
		} else if (!tipoInscricao.equals(other.tipoInscricao)) {
			return false;
		}
		if (tituloEleitor == null) {
			if (other.tituloEleitor != null) {
				return false;
			}
		} else if (!tituloEleitor.equals(other.tituloEleitor)) {
			return false;
		}
		if (usuario == null) {
			if (other.usuario != null) {
				return false;
			}
		} else if (!usuario.equals(other.usuario)) {
			return false;
		}
		if (vencimentoCarteiraMotorista == null) {
			if (other.vencimentoCarteiraMotorista != null) {
				return false;
			}
		} else if (!vencimentoCarteiraMotorista
				.equals(other.vencimentoCarteiraMotorista)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Colaborador [id=" + id + ", empresa=" + empresa + ", apelido="
				+ apelido + ", razaoSocial=" + razaoSocial + ", nomeFantasia="
				+ nomeFantasia + ", tipoInscricao=" + tipoInscricao
				+ ", incricao=" + incricao + ", incricaoEstadual="
				+ incricaoEstadual + ", inscricaoMunicipal="
				+ inscricaoMunicipal + ", inscricaoSuframa=" + inscricaoSuframa
				+ ", dataCriacao=" + dataCriacao + ", email=" + email
				+ ", observacao=" + observacao + ", contato=" + contato
				+ ", ramal=" + ramal + ", caixaPostal=" + caixaPostal
				+ ", contribuinte=" + contribuinte + ", tituloEleitor="
				+ tituloEleitor + ", carteiraMotorista=" + carteiraMotorista
				+ ", vencimentoCarteiraMotorista="
				+ vencimentoCarteiraMotorista + ", atividadeComercial="
				+ atividadeComercial + ", pis=" + pis + ", dataAtualizacao="
				+ dataAtualizacao + ", pais=" + pais
				+ ", optanteSimplesNacional=" + optanteSimplesNacional
				+ ", fornecedor=" + fornecedor + ", cliente=" + cliente
				+ ", colaboradorenderecos=" + colaboradorenderecos
				+ ", usuario=" + usuario + "]";
	}
	
	
	
	

}
