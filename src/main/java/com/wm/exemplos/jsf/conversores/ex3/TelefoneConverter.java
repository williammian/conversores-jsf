package com.wm.exemplos.jsf.conversores.ex3;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import com.wm.exemplos.jsf.conversores.util.StringUtils;

@FacesConverter(forClass = Telefone.class)//value = "telefoneConverter"
public class TelefoneConverter implements Converter {

	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if (value == null) {
			return null;
		}

		Telefone telefone = (Telefone) value;

		return "+" + telefone.getCodigoPais() + " (" + telefone.getCodigoArea() + ") " + telefone.getNumero();
	}

	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if (value == null || "".equals(value.trim())) {
			return null;
		}

		String somenteNumeros = StringUtils.deixarSomenteDigitos(value);// de +55 (11) 2626-9415 para 551126269415

		try {
			String codigoPais = somenteNumeros.substring(0, 2);
			String codigoArea = somenteNumeros.substring(2, 4);
			String numero = somenteNumeros.substring(4);

			return new Telefone(codigoPais, codigoArea, numero);
		} catch (IndexOutOfBoundsException e) {
			FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"Problemas na conversão do telefone.", 
					"Ele deve ser informado com código do país, de área e o número. Ex: +55 (11) 2626-9415");

			throw new ConverterException(facesMessage);
		}
	}
}