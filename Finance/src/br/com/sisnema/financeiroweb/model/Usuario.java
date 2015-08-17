package br.com.sisnema.financeiroweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "usuario", schema = "public", uniqueConstraints = @UniqueConstraint(columnNames = "login"))
public class Usuario implements java.io.Serializable {

	private static final long serialVersionUID = 6428775443959523801L;
	private Integer codUsuario;
	private Colaborador colaborador;
	private Integer empresa;
	private boolean ativo;
	private String email;
	private String login;
	private String senha;
	private Usuariopermissao usuariopermissao;	

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "colaborador"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "codUsuario", unique = true, nullable = false)
	public Integer getCodUsuario() {
		return this.codUsuario;
	}

	public void setCodUsuario(Integer codUsuario) {
		this.codUsuario = codUsuario;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (ativo ? 1231 : 1237);
		result = prime * result
				+ ((codUsuario == null) ? 0 : codUsuario.hashCode());
		result = prime * result
				+ ((colaborador == null) ? 0 : colaborador.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((senha == null) ? 0 : senha.hashCode());
		result = prime
				* result
				+ ((usuariopermissao == null) ? 0 : usuariopermissao.hashCode());
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
		if (!(obj instanceof Usuario)) {
			return false;
		}
		Usuario other = (Usuario) obj;
		if (ativo != other.ativo) {
			return false;
		}
		if (codUsuario == null) {
			if (other.codUsuario != null) {
				return false;
			}
		} else if (!codUsuario.equals(other.codUsuario)) {
			return false;
		}
		if (colaborador == null) {
			if (other.colaborador != null) {
				return false;
			}
		} else if (!colaborador.equals(other.colaborador)) {
			return false;
		}
		if (email == null) {
			if (other.email != null) {
				return false;
			}
		} else if (!email.equals(other.email)) {
			return false;
		}
		if (empresa == null) {
			if (other.empresa != null) {
				return false;
			}
		} else if (!empresa.equals(other.empresa)) {
			return false;
		}
		if (login == null) {
			if (other.login != null) {
				return false;
			}
		} else if (!login.equals(other.login)) {
			return false;
		}
		if (senha == null) {
			if (other.senha != null) {
				return false;
			}
		} else if (!senha.equals(other.senha)) {
			return false;
		}
		if (usuariopermissao == null) {
			if (other.usuariopermissao != null) {
				return false;
			}
		} else if (!usuariopermissao.equals(other.usuariopermissao)) {
			return false;
		}
		return true;
	}
	
	

}
