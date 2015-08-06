package br.com.sisnema.financeiroweb.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "empresa", schema = "public")
public class Empresa implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private int codigo;
	private Set<Colaborador> colaboradors = new HashSet<Colaborador>(0);
	private Set<Filial> filials = new HashSet<Filial>(0);	

	@Id
	@GeneratedValue
	@Column(name = "codigo", unique = true, nullable = false)
	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "empresa")
	public Set<Colaborador> getColaboradors() {
		return this.colaboradors;
	}

	public void setColaboradors(Set<Colaborador> colaboradors) {
		this.colaboradors = colaboradors;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "empresa")
	public Set<Filial> getFilials() {
		return this.filials;
	}

	public void setFilials(Set<Filial> filials) {
		this.filials = filials;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		result = prime * result
				+ ((colaboradors == null) ? 0 : colaboradors.hashCode());
		result = prime * result + ((filials == null) ? 0 : filials.hashCode());
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
		if (!(obj instanceof Empresa)) {
			return false;
		}
		Empresa other = (Empresa) obj;
		if (codigo != other.codigo) {
			return false;
		}
		if (colaboradors == null) {
			if (other.colaboradors != null) {
				return false;
			}
		} else if (!colaboradors.equals(other.colaboradors)) {
			return false;
		}
		if (filials == null) {
			if (other.filials != null) {
				return false;
			}
		} else if (!filials.equals(other.filials)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Empresa [codigo=" + codigo + ", colaboradors=" + colaboradors
				+ ", filials=" + filials + "]";
	}
}
