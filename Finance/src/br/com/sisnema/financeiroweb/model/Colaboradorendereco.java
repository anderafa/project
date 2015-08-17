package br.com.sisnema.financeiroweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "colaboradorendereco", schema = "public")
public class Colaboradorendereco implements java.io.Serializable {

	private static final long serialVersionUID = 2358693676675761700L;
	private Integer endCodigo;
	private Colaborador colaborador;
	private Municipio municipio;
	private String bairro;
	private String celular;
	private String cep;
	private String complemento;
	private String endereco;
	private Integer numero;
	private String telefone;
	private Integer tipoendereco;
	private Integer empresa;

	public Colaboradorendereco() {
	}

	public Colaboradorendereco(Integer endCodigo, Colaborador colaborador,
			Municipio municipio, Integer tipoendereco, Integer empresa) {
		this.endCodigo = endCodigo;
		this.colaborador = colaborador;
		this.municipio = municipio;
		this.tipoendereco = tipoendereco;
		this.empresa = empresa;
	}

	public Colaboradorendereco(Integer endCodigo, Colaborador colaborador,
			Municipio municipio, String bairro, String celular, String cep,
			String complemento, String endereco, Integer numero,
			String telefone, Integer tipoendereco, Integer empresa) {
		this.endCodigo = endCodigo;
		this.colaborador = colaborador;
		this.municipio = municipio;
		this.bairro = bairro;
		this.celular = celular;
		this.cep = cep;
		this.complemento = complemento;
		this.endereco = endereco;
		this.numero = numero;
		this.telefone = telefone;
		this.tipoendereco = tipoendereco;
		this.empresa = empresa;
	}

	@Id
	@Column(name = "endCodigo", unique = true, nullable = false)
	public Integer getEndCodigo() {
		return this.endCodigo;
	}

	public void setEndCodigo(Integer endCodigo) {
		this.endCodigo = endCodigo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "colaborador", nullable = false)
	public Colaborador getColaborador() {
		return this.colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "municipio", nullable = false)
	public Municipio getMunicipio() {
		return this.municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
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

	@Column(name = "endereco", length = 100)
	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Column(name = "numero")
	public Integer getNumero() {
		return this.numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	@Column(name = "telefone", length = 15)
	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Column(name = "tipoendereco", nullable = false)
	public Integer getTipoendereco() {
		return this.tipoendereco;
	}

	public void setTipoendereco(Integer tipoendereco) {
		this.tipoendereco = tipoendereco;
	}

	@Column(name = "empresa", nullable = false)
	public Integer getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(Integer empresa) {
		this.empresa = empresa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((celular == null) ? 0 : celular.hashCode());
		result = prime * result + ((cep == null) ? 0 : cep.hashCode());
		result = prime * result
				+ ((colaborador == null) ? 0 : colaborador.hashCode());
		result = prime * result
				+ ((complemento == null) ? 0 : complemento.hashCode());
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
		result = prime * result
				+ ((endCodigo == null) ? 0 : endCodigo.hashCode());
		result = prime * result
				+ ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result
				+ ((municipio == null) ? 0 : municipio.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result
				+ ((telefone == null) ? 0 : telefone.hashCode());
		result = prime * result
				+ ((tipoendereco == null) ? 0 : tipoendereco.hashCode());
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
		if (!(obj instanceof Colaboradorendereco)) {
			return false;
		}
		Colaboradorendereco other = (Colaboradorendereco) obj;
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
		if (colaborador == null) {
			if (other.colaborador != null) {
				return false;
			}
		} else if (!colaborador.equals(other.colaborador)) {
			return false;
		}
		if (complemento == null) {
			if (other.complemento != null) {
				return false;
			}
		} else if (!complemento.equals(other.complemento)) {
			return false;
		}
		if (empresa == null) {
			if (other.empresa != null) {
				return false;
			}
		} else if (!empresa.equals(other.empresa)) {
			return false;
		}
		if (endCodigo == null) {
			if (other.endCodigo != null) {
				return false;
			}
		} else if (!endCodigo.equals(other.endCodigo)) {
			return false;
		}
		if (endereco == null) {
			if (other.endereco != null) {
				return false;
			}
		} else if (!endereco.equals(other.endereco)) {
			return false;
		}
		if (municipio == null) {
			if (other.municipio != null) {
				return false;
			}
		} else if (!municipio.equals(other.municipio)) {
			return false;
		}
		if (numero == null) {
			if (other.numero != null) {
				return false;
			}
		} else if (!numero.equals(other.numero)) {
			return false;
		}
		if (telefone == null) {
			if (other.telefone != null) {
				return false;
			}
		} else if (!telefone.equals(other.telefone)) {
			return false;
		}
		if (tipoendereco == null) {
			if (other.tipoendereco != null) {
				return false;
			}
		} else if (!tipoendereco.equals(other.tipoendereco)) {
			return false;
		}
		return true;
	}
	
	

}
