package com.wm.exemplos.jsf.conversores.ex2;

import java.util.Locale;
import java.util.TimeZone;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "usuarioLogadoBeanEx2")
public class UsuarioLogadoBean {
	
	private Locale locale = new Locale("pt", "BR");
	
	public Locale getLocale() {
		return locale;
	}
	
	public TimeZone getTimeZone() {
		return TimeZone.getDefault();
	}
}
