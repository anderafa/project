package br.com.sisnema.financeiroweb.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

@FacesConverter("converters.inscricaoConverter")
public class InscricaoConverter implements Converter {
	public Object getAsObject(FacesContext context, UIComponent component,
			String value) throws ConverterException {
		/*
		 * Irá converter CPF formatado para um sem pontos e traço. Ex.:
		 * 355.245.198-87 torna-se 35524519887.
		 */
		String cpf = value;
		if (value != null && !value.equals(""))
			cpf = value.replaceAll("\\.", "").replaceAll("\\-", "");

		return cpf;
	}

	public String getAsString(FacesContext context, UIComponent component,
			Object value) throws ConverterException {
		/*
		 * Irá converter CPF não formatado para um com pontos e traço. Ex.:
		 * 35524519887 torna-se 355.245.198-87.
		 */

		String texto = value.toString();

		if (texto != null && texto.length() == 14){
			texto = texto.substring(0, 2) + "." + texto.substring(2, 5) + "." + texto.substring(5, 8) + "/" + texto.substring(8, 12) + "-" + texto.substring(12, 14);
		}else if (texto != null && texto.length() == 11){
			texto = texto.substring(0, 3) + "." + texto.substring(3, 6) + "." + texto.substring(6, 9) + "-" + texto.substring(9, 11);
		}
		
		

		return texto;
	}
}
