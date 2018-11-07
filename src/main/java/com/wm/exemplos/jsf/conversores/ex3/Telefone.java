package com.wm.exemplos.jsf.conversores.ex3;

public class Telefone {

	private String codigoPais = "00";//a string "00" eh somente para ajudar no exemplo
	
	private String codigoArea = "00";//a string "00" eh somente para ajudar no exemplo
	
	private String numero = "00000000";//a string "00000000" eh somente para ajudar no exemplo
	
	public Telefone() {
		
	}

	public Telefone(String codigoPais, String codigoArea, String numero) {
		this.codigoPais = codigoPais;
		this.codigoArea = codigoArea;
		this.numero = numero;
	}

	public String getCodigoPais() {
		return codigoPais;
	}

	public void setCodigoPais(String codigoPais) {
		this.codigoPais = codigoPais;
	}

	public String getCodigoArea() {
		return codigoArea;
	}

	public void setCodigoArea(String codigoArea) {
		this.codigoArea = codigoArea;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
}