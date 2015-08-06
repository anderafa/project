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

@Entity
public class Municipio implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int codigo;
	private Estado estado;
	private String descricao;
	private Set<Filial> filials = new HashSet<Filial>(0);
	private Set<Colaboradorendereco> colaboradorenderecos = new HashSet<Colaboradorendereco>(0);


	@Id
	@Column(name = "codigo", unique = true, nullable = false)
	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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

}
