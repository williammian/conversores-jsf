package com.wm.exemplos.jsf.conversores.ex3;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "contatoBeanEx3")
public class ContatoBean {
	
	private Contato contato = new Contato();
	
//	private javax.faces.convert.Converter telefoneConverter = new TelefoneConverter();

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
//	public Converter getTelefoneConverter() {
//		return telefoneConverter;
//	}
}
