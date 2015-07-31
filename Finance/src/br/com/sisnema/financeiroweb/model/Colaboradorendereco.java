package br.com.sisnema.financeiroweb.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

@Entity
public class Colaboradorendereco implements java.io.Serializable {

	private static final long serialVersionUID = 8043531456980675184L;
	private ColaboradorenderecoId id;
	private Colaborador colaborador;
	private Municipio municipio;
	private int tipoEndereco;
	private String endereco;
	private Integer numero;
	private String complemento;
	private String bairro;
	private String cep;
	private String telefone;
	private String celular;

	public Colaboradorendereco() {
	}

	public Colaboradorendereco(ColaboradorenderecoId id,
			Colaborador colaborador, Municipio municipio, int tipoEndereco) {
		this.id = id;
		this.colaborador = colaborador;
		this.municipio = municipio;
		this.tipoEndereco = tipoEndereco;
	}

	public Colaboradorendereco(ColaboradorenderecoId id,
			Colaborador colaborador, Municipio municipio, int tipoEndereco,
			String endereco, Integer numero, String complemento, String bairro,
			String cep, String telefone, String celular) {
		this.id = id;
		this.colaborador = colaborador;
		this.municipio = municipio;
		this.tipoEndereco = tipoEndereco;
		this.endereco = endereco;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
		this.telefone = telefone;
		this.celular = celular;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "colaborador", column = @Column(name = "colaborador", nullable = false)),
			@AttributeOverride(name = "codigo", column = @Column(name = "codigo", nullable = false)) })
	public ColaboradorenderecoId getId() {
		return this.id;
	}

	public void setId(ColaboradorenderecoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "empresa", referencedColumnName = "empresa", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "colaborador", referencedColumnName = "codigo", nullable = false, insertable = false, updatable = false) })
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

	@Column(name = "tipoEndereco", nullable = false)
	public int getTipoEndereco() {
		return this.tipoEndereco;
	}

	public void setTipoEndereco(int tipoEndereco) {
		this.tipoEndereco = tipoEndereco;
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

	@Column(name = "complemento", length = 50)
	public String getComplemento() {
		return this.complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	@Column(name = "bairro", length = 50)
	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	@Column(name = "cep", length = 8)
	public String getCep() {
		return this.cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	@Column(name = "telefone", length = 15)
	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Column(name = "celular", length = 15)
	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
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
		result = prime * result
				+ ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((municipio == null) ? 0 : municipio.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result
				+ ((telefone == null) ? 0 : telefone.hashCode());
		result = prime * result + tipoEndereco;
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
		if (endereco == null) {
			if (other.endereco != null) {
				return false;
			}
		} else if (!endereco.equals(other.endereco)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
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
		if (tipoEndereco != other.tipoEndereco) {
			return false;
		}
		return true;
	}
	
	

}
