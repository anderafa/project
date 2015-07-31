package br.com.sisnema.financeiroweb.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ColaboradorenderecoId implements java.io.Serializable {

	private static final long serialVersionUID = 1624373520431062913L;
	private int colaborador;
	private int codigo;

	public ColaboradorenderecoId() {
	}

	public ColaboradorenderecoId(int colaborador, int codigo) {
		this.colaborador = colaborador;
		this.codigo = codigo;
	}

	@Column(name = "colaborador", nullable = false)
	public int getColaborador() {
		return this.colaborador;
	}

	public void setColaborador(int colaborador) {
		this.colaborador = colaborador;
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
		if (!(other instanceof ColaboradorenderecoId))
			return false;
		ColaboradorenderecoId castOther = (ColaboradorenderecoId) other;

		return (this.getColaborador() == castOther.getColaborador())
				&& (this.getCodigo() == castOther.getCodigo());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getColaborador();
		result = 37 * result + this.getCodigo();
		return result;
	}

}
