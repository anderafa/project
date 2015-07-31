package br.com.sisnema.financeiroweb.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Estado implements java.io.Serializable {

	private static final long serialVersionUID = 39977290570254935L;
	private String codigo;
	private String descricao;
	private Set<Municipio> municipios = new HashSet<Municipio>(0);

	public Estado() {
	}

	public Estado(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Estado(String codigo, String descricao, Set<Municipio> municipios) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.municipios = municipios;
	}

	@Id
	@Column(name = "codigo", unique = true, nullable = false, length = 2)
	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Column(name = "descricao", nullable = false, length = 50)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "estado")
	public Set<Municipio> getMunicipios() {
		return this.municipios;
	}

	public void setMunicipios(Set<Municipio> municipios) {
		this.municipios = municipios;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result
				+ ((municipios == null) ? 0 : municipios.hashCode());
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
		if (!(obj instanceof Estado)) {
			return false;
		}
		Estado other = (Estado) obj;
		if (codigo == null) {
			if (other.codigo != null) {
				return false;
			}
		} else if (!codigo.equals(other.codigo)) {
			return false;
		}
		if (descricao == null) {
			if (other.descricao != null) {
				return false;
			}
		} else if (!descricao.equals(other.descricao)) {
			return false;
		}
		if (municipios == null) {
			if (other.municipios != null) {
				return false;
			}
		} else if (!municipios.equals(other.municipios)) {
			return false;
		}
		return true;
	}
	
	

}
