package br.com.sisnema.financeiroweb.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "municipio", schema = "public")
public class Municipio implements java.io.Serializable {

	private static final long serialVersionUID = -4760601073255052808L;
	private Integer munCodigo;
	private Estado estado;
	private String descricao;
	private Set<Filial> filials = new HashSet<Filial>(0);
	private Set<Colaboradorendereco> colaboradorenderecos = new HashSet<Colaboradorendereco>(0);

	public Municipio() {
	}

	public Municipio(Integer munCodigo, Estado estado, String descricao) {
		this.munCodigo = munCodigo;
		this.estado = estado;
		this.descricao = descricao;
	}	

	@Id
	@Column(name = "munCodigo", unique = true, nullable = false)
	public Integer getMunCodigo() {
		return this.munCodigo;
	}

	public void setMunCodigo(Integer munCodigo) {
		this.munCodigo = munCodigo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "estado", nullable = false)
	public Estado getEstado() {
		return this.estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Column(name = "descricao", nullable = false, length = 50)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "municipio")
	public Set<Filial> getFilials() {
		return this.filials;
	}

	public void setFilials(Set<Filial> filials) {
		this.filials = filials;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "municipio")
	public Set<Colaboradorendereco> getColaboradorenderecos() {
		return this.colaboradorenderecos;
	}

	public void setColaboradorenderecos(
			Set<Colaboradorendereco> colaboradorenderecos) {
		this.colaboradorenderecos = colaboradorenderecos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((colaboradorenderecos == null) ? 0 : colaboradorenderecos
						.hashCode());
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((filials == null) ? 0 : filials.hashCode());
		result = prime * result
				+ ((munCodigo == null) ? 0 : munCodigo.hashCode());
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
		if (!(obj instanceof Municipio)) {
			return false;
		}
		Municipio other = (Municipio) obj;
		if (colaboradorenderecos == null) {
			if (other.colaboradorenderecos != null) {
				return false;
			}
		} else if (!colaboradorenderecos.equals(other.colaboradorenderecos)) {
			return false;
		}
		if (descricao == null) {
			if (other.descricao != null) {
				return false;
			}
		} else if (!descricao.equals(other.descricao)) {
			return false;
		}
		if (estado == null) {
			if (other.estado != null) {
				return false;
			}
		} else if (!estado.equals(other.estado)) {
			return false;
		}
		if (filials == null) {
			if (other.filials != null) {
				return false;
			}
		} else if (!filials.equals(other.filials)) {
			return false;
		}
		if (munCodigo == null) {
			if (other.munCodigo != null) {
				return false;
			}
		} else if (!munCodigo.equals(other.munCodigo)) {
			return false;
		}
		return true;
	}
	
	

}
