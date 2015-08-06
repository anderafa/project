package br.com.sisnema.financeiroweb.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class UsuarioId implements java.io.Serializable {

	private static final long serialVersionUID = 3316328583323404138L;
	private int codigo;
	private int empresa;

	public UsuarioId() {
	}

	public UsuarioId(int codigo, int empresa) {
		this.codigo = codigo;
		this.empresa = empresa;
	}

	@Column(name = "codigo", nullable = false)
	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Column(name = "empresa", nullable = false)
	public int getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(int empresa) {
		this.empresa = empresa;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UsuarioId))
			return false;
		UsuarioId castOther = (UsuarioId) other;

		return (this.getCodigo() == castOther.getCodigo())
				&& (this.getEmpresa() == castOther.getEmpresa());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodigo();
		result = 37 * result + this.getEmpresa();
		return result;
	}

	@Override
	public String toString() {
		return "UsuarioId [codigo=" + codigo + ", empresa=" + empresa + "]";
	}
	
	

}
