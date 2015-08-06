package br.com.sisnema.financeiroweb.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "usuario", schema = "public", uniqueConstraints = @UniqueConstraint(columnNames = "login"))
public class Usuario implements java.io.Serializable {

	private static final long serialVersionUID = 3544094885382363875L;
	private UsuarioId id;
	private Colaborador colaborador;
	private boolean ativo;
	private String email;
	private String login;
	private String senha;
	private Usuariopermissao usuariopermissao;	

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codigo", column = @Column(name = "codigo", nullable = false)),
			@AttributeOverride(name = "empresa", column = @Column(name = "empresa", nullable = false)) })
	public UsuarioId getId() {
		return this.id;
	}

	public void setId(UsuarioId id) {
		this.id = id;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Colaborador getColaborador() {
		return this.colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	@Column(name = "ativo", nullable = false)
	public boolean isAtivo() {
		return this.ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	@Column(name = "email", length = 200)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "login", unique = true, length = 50)
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Column(name = "senha", length = 15)
	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "usuario")
	public Usuariopermissao getUsuariopermissao() {
		return this.usuariopermissao;
	}

	public void setUsuariopermissao(Usuariopermissao usuariopermissao) {
		this.usuariopermissao = usuariopermissao;
	}

}
