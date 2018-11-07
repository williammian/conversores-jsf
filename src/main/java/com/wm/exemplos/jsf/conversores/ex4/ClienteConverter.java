package com.wm.exemplos.jsf.conversores.ex4;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("clienteConverter")
public class ClienteConverter implements Converter {
	
	private ClienteService clienteService = new ClienteService();

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if (value == null) {
			return null;
		}
		
		return clienteService.buscar(Integer.valueOf(value));
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if (value == null) {
			return null;
		}

		Cliente cliente = (Cliente) value;

		return cliente.getId().toString();
	}
}
