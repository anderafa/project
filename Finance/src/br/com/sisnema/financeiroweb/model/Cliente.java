package br.com.sisnema.financeiroweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "cliente", schema = "public")
public class Cliente implements java.io.Serializable {

	private static final long serialVersionUID = -3448095317848692903L;
	private Integer codColaborador;
	private Colaborador colaborador;
	private Integer empresa;
	private boolean situacao;

	public Cliente() {
	}

	public Cliente(Colaborador colaborador, Integer empresa, boolean situacao) {
		this.colaborador = colaborador;
		this.empresa = empresa;
		this.situacao = situacao;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "colaborador"))
	@Id
	@Column(name = "codColaborador", unique = true, nullable = false)
	public Integer getCodColaborador() {
		return this.codColaborador;
	}

	public void setCodColaborador(Integer codColaborador) {
		this.codColaborador = codColaborador;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Colaborador getColaborador() {
		return this.colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	@Column(name = "empresa", nullable = false)
	public Integer getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(Integer empresa) {
		this.empresa = empresa;
	}

	@Column(name = "situacao", nullable = false)
	public boolean isSituacao() {
		return this.situacao;
	}

	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codColaborador == null) ? 0 : codColaborador.hashCode());
		result = prime * result
				+ ((colaborador == null) ? 0 : colaborador.hashCode());
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
		result = prime * result + (situacao ? 1231 : 1237);
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
		if (!(obj instanceof Cliente)) {
			return false;
		}
		Cliente other = (Cliente) obj;
		if (codColaborador == null) {
			if (other.codColaborador != null) {
				return false;
			}
		} else if (!codColaborador.equals(other.codColaborador)) {
			return false;
		}
		if (colaborador == null) {
			if (other.colaborador != null) {
				return false;
			}
		} else if (!colaborador.equals(other.colaborador)) {
			return false;
		}
		if (empresa == null) {
			if (other.empresa != null) {
				return false;
			}
		} else if (!empresa.equals(other.empresa)) {
			return false;
		}
		if (situacao != other.situacao) {
			return false;
		}
		return true;
	}
	
	

}
