package br.com.sisnema.financeiroweb.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "estado", schema = "public")
public class Estado implements java.io.Serializable {

	private static final long serialVersionUID = -6914179624111860612L;
	private String estCodigo;
	private String descricao;
	private Set<Municipio> municipios = new HashSet<Municipio>(0);

	public Estado() {
	}

	public Estado(String estCodigo, String descricao) {
		this.estCodigo = estCodigo;
		this.descricao = descricao;
	}	

	@Id
	@Column(name = "estCodigo", unique = true, nullable = false, length = 2)
	public String getEstCodigo() {
		return this.estCodigo;
	}

	public void setEstCodigo(String estCodigo) {
		this.estCodigo = estCodigo;
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
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result
				+ ((estCodigo == null) ? 0 : estCodigo.hashCode());
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
		if (descricao == null) {
			if (other.descricao != null) {
				return false;
			}
		} else if (!descricao.equals(other.descricao)) {
			return false;
		}
		if (estCodigo == null) {
			if (other.estCodigo != null) {
				return false;
			}
		} else if (!estCodigo.equals(other.estCodigo)) {
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
