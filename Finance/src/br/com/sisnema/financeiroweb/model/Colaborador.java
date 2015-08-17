package br.com.sisnema.financeiroweb.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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

	private static final long serialVersionUID = 7587491926057371125L;
	private Integer colCodigo;
	private Empresa empresa;
	private String apelido;
	private Integer atividadecomercial;
	private String caixapostal;
	private String carteiramotorista;
	private String contato;
	private boolean contribuinte;
	private Date dataatualizacao;
	private Date datacriacao;
	private String email;
	private String incricao;
	private String incricaoestadual;
	private String inscricaomunicipal;
	private String inscricaosuframa;
	private String nomefantasia;
	private String observacao;
	private boolean optantesimplesnacional;
	private String pis;
	private Integer ramal;
	private String razaosocial;
	private String tipoinscricao;
	private String tituloeleitor;
	private Date vencimentocarteiramotorista;
	private Cliente cliente;
	private Fornecedor fornecedor;
	private Set<Colaboradorendereco> colaboradorenderecos = new HashSet<Colaboradorendereco>(0);
	private Usuario usuario;

	public Colaborador() {
	}

	public Colaborador(Integer colCodigo, Empresa empresa, boolean contribuinte,
			Date datacriacao, boolean optantesimplesnacional) {
		this.colCodigo = colCodigo;
		this.empresa = empresa;
		this.contribuinte = contribuinte;
		this.datacriacao = datacriacao;
		this.optantesimplesnacional = optantesimplesnacional;
	}	

	@Id
	@GeneratedValue
	@Column(name = "colCodigo", unique = true, nullable = false)
	public Integer getColCodigo() {
		return this.colCodigo;
	}

	public void setColCodigo(Integer colCodigo) {
		this.colCodigo = colCodigo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "empresa", nullable = false)
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

	@Column(name = "atividadecomercial")
	public Integer getAtividadecomercial() {
		return this.atividadecomercial;
	}

	public void setAtividadecomercial(Integer atividadecomercial) {
		this.atividadecomercial = atividadecomercial;
	}

	@Column(name = "caixapostal", length = 15)
	public String getCaixapostal() {
		return this.caixapostal;
	}

	public void setCaixapostal(String caixapostal) {
		this.caixapostal = caixapostal;
	}

	@Column(name = "carteiramotorista", length = 11)
	public String getCarteiramotorista() {
		return this.carteiramotorista;
	}

	public void setCarteiramotorista(String carteiramotorista) {
		this.carteiramotorista = carteiramotorista;
	}

	@Column(name = "contato", length = 50)
	public String getContato() {
		return this.contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	@Column(name = "contribuinte", nullable = false)
	public boolean isContribuinte() {
		return this.contribuinte;
	}

	public void setContribuinte(boolean contribuinte) {
		this.contribuinte = contribuinte;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dataatualizacao", length = 29)
	public Date getDataatualizacao() {
		return this.dataatualizacao;
	}

	public void setDataatualizacao(Date dataatualizacao) {
		this.dataatualizacao = dataatualizacao;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "datacriacao", nullable = false, length = 13)
	public Date getDatacriacao() {
		return this.datacriacao;
	}

	public void setDatacriacao(Date datacriacao) {
		this.datacriacao = datacriacao;
	}

	@Column(name = "email", length = 200)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "incricao", length = 14)
	public String getIncricao() {
		return this.incricao;
	}

	public void setIncricao(String incricao) {
		this.incricao = incricao;
	}

	@Column(name = "incricaoestadual", length = 20)
	public String getIncricaoestadual() {
		return this.incricaoestadual;
	}

	public void setIncricaoestadual(String incricaoestadual) {
		this.incricaoestadual = incricaoestadual;
	}

	@Column(name = "inscricaomunicipal", length = 20)
	public String getInscricaomunicipal() {
		return this.inscricaomunicipal;
	}

	public void setInscricaomunicipal(String inscricaomunicipal) {
		this.inscricaomunicipal = inscricaomunicipal;
	}

	@Column(name = "inscricaosuframa", length = 20)
	public String getInscricaosuframa() {
		return this.inscricaosuframa;
	}

	public void setInscricaosuframa(String inscricaosuframa) {
		this.inscricaosuframa = inscricaosuframa;
	}

	@Column(name = "nomefantasia", length = 80)
	public String getNomefantasia() {
		return this.nomefantasia;
	}

	public void setNomefantasia(String nomefantasia) {
		this.nomefantasia = nomefantasia;
	}

	@Column(name = "observacao")
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Column(name = "optantesimplesnacional", nullable = false)
	public boolean isOptantesimplesnacional() {
		return this.optantesimplesnacional;
	}

	public void setOptantesimplesnacional(boolean optantesimplesnacional) {
		this.optantesimplesnacional = optantesimplesnacional;
	}

	@Column(name = "pis", length = 11)
	public String getPis() {
		return this.pis;
	}

	public void setPis(String pis) {
		this.pis = pis;
	}

	@Column(name = "ramal")
	public Integer getRamal() {
		return this.ramal;
	}

	public void setRamal(Integer ramal) {
		this.ramal = ramal;
	}

	@Column(name = "razaosocial", length = 80)
	public String getRazaosocial() {
		return this.razaosocial;
	}

	public void setRazaosocial(String razaosocial) {
		this.razaosocial = razaosocial;
	}

	@Column(name = "tipoinscricao", length = 4)
	public String getTipoinscricao() {
		return this.tipoinscricao;
	}

	public void setTipoinscricao(String tipoinscricao) {
		this.tipoinscricao = tipoinscricao;
	}

	@Column(name = "tituloeleitor", length = 11)
	public String getTituloeleitor() {
		return this.tituloeleitor;
	}

	public void setTituloeleitor(String tituloeleitor) {
		this.tituloeleitor = tituloeleitor;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "vencimentocarteiramotorista", length = 13)
	public Date getVencimentocarteiramotorista() {
		return this.vencimentocarteiramotorista;
	}

	public void setVencimentocarteiramotorista(Date vencimentocarteiramotorista) {
		this.vencimentocarteiramotorista = vencimentocarteiramotorista;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "colaborador")
	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "colaborador")
	public Fornecedor getFornecedor() {
		return this.fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
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
				+ ((atividadecomercial == null) ? 0 : atividadecomercial
						.hashCode());
		result = prime * result
				+ ((caixapostal == null) ? 0 : caixapostal.hashCode());
		result = prime
				* result
				+ ((carteiramotorista == null) ? 0 : carteiramotorista
						.hashCode());
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result
				+ ((colCodigo == null) ? 0 : colCodigo.hashCode());
		result = prime
				* result
				+ ((colaboradorenderecos == null) ? 0 : colaboradorenderecos
						.hashCode());
		result = prime * result + ((contato == null) ? 0 : contato.hashCode());
		result = prime * result + (contribuinte ? 1231 : 1237);
		result = prime * result
				+ ((dataatualizacao == null) ? 0 : dataatualizacao.hashCode());
		result = prime * result
				+ ((datacriacao == null) ? 0 : datacriacao.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
		result = prime * result
				+ ((fornecedor == null) ? 0 : fornecedor.hashCode());
		result = prime * result
				+ ((incricao == null) ? 0 : incricao.hashCode());
		result = prime
				* result
				+ ((incricaoestadual == null) ? 0 : incricaoestadual.hashCode());
		result = prime
				* result
				+ ((inscricaomunicipal == null) ? 0 : inscricaomunicipal
						.hashCode());
		result = prime
				* result
				+ ((inscricaosuframa == null) ? 0 : inscricaosuframa.hashCode());
		result = prime * result
				+ ((nomefantasia == null) ? 0 : nomefantasia.hashCode());
		result = prime * result
				+ ((observacao == null) ? 0 : observacao.hashCode());
		result = prime * result + (optantesimplesnacional ? 1231 : 1237);
		result = prime * result + ((pis == null) ? 0 : pis.hashCode());
		result = prime * result + ((ramal == null) ? 0 : ramal.hashCode());
		result = prime * result
				+ ((razaosocial == null) ? 0 : razaosocial.hashCode());
		result = prime * result
				+ ((tipoinscricao == null) ? 0 : tipoinscricao.hashCode());
		result = prime * result
				+ ((tituloeleitor == null) ? 0 : tituloeleitor.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
		result = prime
				* result
				+ ((vencimentocarteiramotorista == null) ? 0
						: vencimentocarteiramotorista.hashCode());
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
		if (atividadecomercial == null) {
			if (other.atividadecomercial != null) {
				return false;
			}
		} else if (!atividadecomercial.equals(other.atividadecomercial)) {
			return false;
		}
		if (caixapostal == null) {
			if (other.caixapostal != null) {
				return false;
			}
		} else if (!caixapostal.equals(other.caixapostal)) {
			return false;
		}
		if (carteiramotorista == null) {
			if (other.carteiramotorista != null) {
				return false;
			}
		} else if (!carteiramotorista.equals(other.carteiramotorista)) {
			return false;
		}
		if (cliente == null) {
			if (other.cliente != null) {
				return false;
			}
		} else if (!cliente.equals(other.cliente)) {
			return false;
		}
		if (colCodigo == null) {
			if (other.colCodigo != null) {
				return false;
			}
		} else if (!colCodigo.equals(other.colCodigo)) {
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
		if (dataatualizacao == null) {
			if (other.dataatualizacao != null) {
				return false;
			}
		} else if (!dataatualizacao.equals(other.dataatualizacao)) {
			return false;
		}
		if (datacriacao == null) {
			if (other.datacriacao != null) {
				return false;
			}
		} else if (!datacriacao.equals(other.datacriacao)) {
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
		if (incricao == null) {
			if (other.incricao != null) {
				return false;
			}
		} else if (!incricao.equals(other.incricao)) {
			return false;
		}
		if (incricaoestadual == null) {
			if (other.incricaoestadual != null) {
				return false;
			}
		} else if (!incricaoestadual.equals(other.incricaoestadual)) {
			return false;
		}
		if (inscricaomunicipal == null) {
			if (other.inscricaomunicipal != null) {
				return false;
			}
		} else if (!inscricaomunicipal.equals(other.inscricaomunicipal)) {
			return false;
		}
		if (inscricaosuframa == null) {
			if (other.inscricaosuframa != null) {
				return false;
			}
		} else if (!inscricaosuframa.equals(other.inscricaosuframa)) {
			return false;
		}
		if (nomefantasia == null) {
			if (other.nomefantasia != null) {
				return false;
			}
		} else if (!nomefantasia.equals(other.nomefantasia)) {
			return false;
		}
		if (observacao == null) {
			if (other.observacao != null) {
				return false;
			}
		} else if (!observacao.equals(other.observacao)) {
			return false;
		}
		if (optantesimplesnacional != other.optantesimplesnacional) {
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
		if (razaosocial == null) {
			if (other.razaosocial != null) {
				return false;
			}
		} else if (!razaosocial.equals(other.razaosocial)) {
			return false;
		}
		if (tipoinscricao == null) {
			if (other.tipoinscricao != null) {
				return false;
			}
		} else if (!tipoinscricao.equals(other.tipoinscricao)) {
			return false;
		}
		if (tituloeleitor == null) {
			if (other.tituloeleitor != null) {
				return false;
			}
		} else if (!tituloeleitor.equals(other.tituloeleitor)) {
			return false;
		}
		if (usuario == null) {
			if (other.usuario != null) {
				return false;
			}
		} else if (!usuario.equals(other.usuario)) {
			return false;
		}
		if (vencimentocarteiramotorista == null) {
			if (other.vencimentocarteiramotorista != null) {
				return false;
			}
		} else if (!vencimentocarteiramotorista
				.equals(other.vencimentocarteiramotorista)) {
			return false;
		}
		return true;
	}
	
	

}
