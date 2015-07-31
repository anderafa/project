package br.com.sisnema.financeiroweb.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ColaboradorId implements java.io.Serializable {

	private static final long serialVersionUID = -8210098579727421173L;
	private int empresa;
	private int codigo;

	public ColaboradorId() {
	}

	public ColaboradorId(int empresa, int codigo) {
		this.empresa = empresa;
		this.codigo = codigo;
	}

	@Column(name = "empresa", nullable = false)
	public int getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(int empresa) {
		this.empresa = empresa;
	}

	@Column(name = "codigo", nullable = false)
	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ColaboradorId))
			return false;
		ColaboradorId castOther = (ColaboradorId) other;

		return (this.getEmpresa() == castOther.getEmpresa())
				&& (this.getCodigo() == castOther.getCodigo());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getEmpresa();
		result = 37 * result + this.getCodigo();
		return result;
	}

}
