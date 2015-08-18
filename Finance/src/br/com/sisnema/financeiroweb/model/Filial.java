package br.com.sisnema.financeiroweb.model;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "filial", schema = "public")
public class Filial implements java.io.Serializable {

	private static final long serialVersionUID = 1856632440501081885L;
	private Integer codFilial;
	private Empresa empresa;
	private Municipio municipio;
	private String apelido;
	private String bairro;
	private String celular;
	private String cep;
	private String complemento;
	private String email;
	private String endereco;
	private Date fechamentoatividade;
	private String incricao;
	private Date inicioatividade;
	private String inscricaoestadual;
	private String inscricaomunicipal;
	private String nomefantasia;
	private Integer numero;
	private String razaosocial;
	private boolean situacao;
	private byte[] telefone;
	private String tipoinscricao;

	public Filial() {
	}

	public Filial(Empresa empresa, String razaosocial,boolean situacao) {		
		this.empresa = empresa;
		this.razaosocial = razaosocial;
		this.situacao = situacao;
	}	

	@Id
	@GeneratedValue
	@Column(name = "codFilial", unique = true, nullable = false)
	public Integer getCodFilial() {
		return this.codFilial;
	}

	public void setCodFilial(Integer codFilial) {
		this.codFilial = codFilial;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "empresa", nullable = false)
	public Empresa getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "municipio")
	public Municipio getMunicipio() {
		return this.municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	@Column(name = "apelido", length = 50)
	public String getApelido() {
		return this.apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	@Column(name = "bairro", length = 50)
	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	@Column(name = "celular", length = 15)
	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	@Column(name = "cep", length = 8)
	public String getCep() {
		return this.cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	@Column(name = "complemento", length = 50)
	public String getComplemento() {
		return this.complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	@Column(name = "email", length = 200)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "endereco", length = 80)
	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fechamentoatividade", length = 13)
	public Date getFechamentoatividade() {
		return this.fechamentoatividade;
	}

	public void setFechamentoatividade(Date fechamentoatividade) {
		this.fechamentoatividade = fechamentoatividade;
	}

	@Column(name = "incricao", length = 14)
	public String getIncricao() {
		return this.incricao;
	}

	public void setIncricao(String incricao) {
		this.incricao = incricao;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "inicioatividade", length = 13)
	public Date getInicioatividade() {
		return this.inicioatividade;
	}

	public void setInicioatividade(Date inicioatividade) {
		this.inicioatividade = inicioatividade;
	}

	@Column(name = "inscricaoestadual", length = 20)
	public String getInscricaoestadual() {
		return this.inscricaoestadual;
	}

	public void setInscricaoestadual(String inscricaoestadual) {
		this.inscricaoestadual = inscricaoestadual;
	}

	@Column(name = "inscricaomunicipal", length = 20)
	public String getInscricaomunicipal() {
		return this.inscricaomunicipal;
	}

	public void setInscricaomunicipal(String inscricaomunicipal) {
		this.inscricaomunicipal = inscricaomunicipal;
	}

	@Column(name = "nomefantasia", length = 80)
	public String getNomefantasia() {
		return this.nomefantasia;
	}

	public void setNomefantasia(String nomefantasia) {
		this.nomefantasia = nomefantasia;
	}

	@Column(name = "numero")
	public Integer getNumero() {
		return this.numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	@Column(name = "razaosocial", nullable = false, length = 80)
	public String getRazaosocial() {
		return this.razaosocial;
	}

	public void setRazaosocial(String razaosocial) {
		this.razaosocial = razaosocial;
	}

	@Column(name = "situacao", nullable = false)
	public boolean isSituacao() {
		return this.situacao;
	}

	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}

	@Column(name = "telefone")
	public byte[] getTelefone() {
		return this.telefone;
	}

	public void setTelefone(byte[] telefone) {
		this.telefone = telefone;
	}

	@Column(name = "tipoinscricao", length = 4)
	public String getTipoinscricao() {
		return this.tipoinscricao;
	}

	public void setTipoinscricao(String tipoinscricao) {
		this.tipoinscricao = tipoinscricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apelido == null) ? 0 : apelido.hashCode());
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((celular == null) ? 0 : celular.hashCode());
		result = prime * result + ((cep == null) ? 0 : cep.hashCode());
		result = prime * result
				+ ((codFilial == null) ? 0 : codFilial.hashCode());
		result = prime * result
				+ ((complemento == null) ? 0 : complemento.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
		result = prime * result
				+ ((endereco == null) ? 0 : endereco.hashCode());
		result = prime
				* result
				+ ((fechamentoatividade == null) ? 0 : fechamentoatividade
						.hashCode());
		result = prime * result
				+ ((incricao == null) ? 0 : incricao.hashCode());
		result = prime * result
				+ ((inicioatividade == null) ? 0 : inicioatividade.hashCode());
		result = prime
				* result
				+ ((inscricaoestadual == null) ? 0 : inscricaoestadual
						.hashCode());
		result = prime
				* result
				+ ((inscricaomunicipal == null) ? 0 : inscricaomunicipal
						.hashCode());
		result = prime * result
				+ ((municipio == null) ? 0 : municipio.hashCode());
		result = prime * result
				+ ((nomefantasia == null) ? 0 : nomefantasia.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result
				+ ((razaosocial == null) ? 0 : razaosocial.hashCode());
		result = prime * result + (situacao ? 1231 : 1237);
		result = prime * result + Arrays.hashCode(telefone);
		result = prime * result
				+ ((tipoinscricao == null) ? 0 : tipoinscricao.hashCode());
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
		if (!(obj instanceof Filial)) {
			return false;
		}
		Filial other = (Filial) obj;
		if (apelido == null) {
			if (other.apelido != null) {
				return false;
			}
		} else if (!apelido.equals(other.apelido)) {
			return false;
		}
		if (bairro == null) {
			if (other.bairro != null) {
				return false;
			}
		} else if (!bairro.equals(other.bairro)) {
			return false;
		}
		if (celular == null) {
			if (other.celular != null) {
				return false;
			}
		} else if (!celular.equals(other.celular)) {
			return false;
		}
		if (cep == null) {
			if (other.cep != null) {
				return false;
			}
		} else if (!cep.equals(other.cep)) {
			return false;
		}
		if (codFilial == null) {
			if (other.codFilial != null) {
				return false;
			}
		} else if (!codFilial.equals(other.codFilial)) {
			return false;
		}
		if (complemento == null) {
			if (other.complemento != null) {
				return false;
			}
		} else if (!complemento.equals(other.complemento)) {
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
		if (endereco == null) {
			if (other.endereco != null) {
				return false;
			}
		} else if (!endereco.equals(other.endereco)) {
			return false;
		}
		if (fechamentoatividade == null) {
			if (other.fechamentoatividade != null) {
				return false;
			}
		} else if (!fechamentoatividade.equals(other.fechamentoatividade)) {
			return false;
		}
		if (incricao == null) {
			if (other.incricao != null) {
				return false;
			}
		} else if (!incricao.equals(other.incricao)) {
			return false;
		}
		if (inicioatividade == null) {
			if (other.inicioatividade != null) {
				return false;
			}
		} else if (!inicioatividade.equals(other.inicioatividade)) {
			return false;
		}
		if (inscricaoestadual == null) {
			if (other.inscricaoestadual != null) {
				return false;
			}
		} else if (!inscricaoestadual.equals(other.inscricaoestadual)) {
			return false;
		}
		if (inscricaomunicipal == null) {
			if (other.inscricaomunicipal != null) {
				return false;
			}
		} else if (!inscricaomunicipal.equals(other.inscricaomunicipal)) {
			return false;
		}
		if (municipio == null) {
			if (other.municipio != null) {
				return false;
			}
		} else if (!municipio.equals(other.municipio)) {
			return false;
		}
		if (nomefantasia == null) {
			if (other.nomefantasia != null) {
				return false;
			}
		} else if (!nomefantasia.equals(other.nomefantasia)) {
			return false;
		}
		if (numero == null) {
			if (other.numero != null) {
				return false;
			}
		} else if (!numero.equals(other.numero)) {
			return false;
		}
		if (razaosocial == null) {
			if (other.razaosocial != null) {
				return false;
			}
		} else if (!razaosocial.equals(other.razaosocial)) {
			return false;
		}
		if (situacao != other.situacao) {
			return false;
		}
		if (!Arrays.equals(telefone, other.telefone)) {
			return false;
		}
		if (tipoinscricao == null) {
			if (other.tipoinscricao != null) {
				return false;
			}
		} else if (!tipoinscricao.equals(other.tipoinscricao)) {
			return false;
		}
		return true;
	}
	
	

}
