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
@Table(name = "usuariopermissao", schema = "public")
public class Usuariopermissao implements java.io.Serializable {

	private static final long serialVersionUID = 4620880317297223057L;
	private Integer uspCodigo;
	private Usuario usuario;
	private Integer empresa;
	private String permissao;

	public Usuariopermissao() {
	}

	public Usuariopermissao(Usuario usuario, Integer empresa, String permissao) {
		this.usuario = usuario;
		this.empresa = empresa;
		this.permissao = permissao;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "usuario"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "uspCodigo", unique = true, nullable = false)
	public Integer getUspCodigo() {
		return this.uspCodigo;
	}

	public void setUspCodigo(Integer uspCodigo) {
		this.uspCodigo = uspCodigo;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Column(name = "empresa", nullable = false)
	public Integer getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(Integer empresa) {
		this.empresa = empresa;
	}

	@Column(name = "permissao", nullable = false, length = 50)
	public String getPermissao() {
		return this.permissao;
	}

	public void setPermissao(String permissao) {
		this.permissao = permissao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
		result = prime * result
				+ ((permissao == null) ? 0 : permissao.hashCode());
		result = prime * result
				+ ((uspCodigo == null) ? 0 : uspCodigo.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
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
		if (!(obj instanceof Usuariopermissao)) {
			return false;
		}
		Usuariopermissao other = (Usuariopermissao) obj;
		if (empresa == null) {
			if (other.empresa != null) {
				return false;
			}
		} else if (!empresa.equals(other.empresa)) {
			return false;
		}
		if (permissao == null) {
			if (other.permissao != null) {
				return false;
			}
		} else if (!permissao.equals(other.permissao)) {
			return false;
		}
		if (uspCodigo == null) {
			if (other.uspCodigo != null) {
				return false;
			}
		} else if (!uspCodigo.equals(other.uspCodigo)) {
			return false;
		}
		if (usuario == null) {
			if (other.usuario != null) {
				return false;
			}
		} else if (!usuario.equals(other.usuario)) {
			return false;
		}
		return true;
	}
	
	

}
