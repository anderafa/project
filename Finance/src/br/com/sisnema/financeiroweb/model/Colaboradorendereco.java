package br.com.sisnema.financeiroweb.model;

// Generated 04/08/2015 22:19:49 by Hibernate Tools 4.3.1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Colaboradorendereco generated by hbm2java
 */
@Entity
@Table(name = "colaboradorendereco", schema = "public")
public class Colaboradorendereco implements java.io.Serializable {

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

}