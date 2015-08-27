package br.com.sisnema.financeiroweb.util;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class FormatUtil {
	
	private static final String formatData = "dd/MM/yyyy";
	private static final String formatCPF = "999.999.999-99";
	private static final String formatCNPJ = "99.999.999/9999-99";

	public static String getFormatcpf() {
		return formatCPF;
	}

	public static String getFormatcnpj() {
		return formatCNPJ;
	}

	public static String getFormatdata() {
		return formatData;
	}
	
	
}
