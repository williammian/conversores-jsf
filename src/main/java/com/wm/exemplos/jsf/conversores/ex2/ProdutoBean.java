package com.wm.exemplos.jsf.conversores.ex2;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "produtoBeanEx2")
public class ProdutoBean {
	
	private Produto produto = new Produto();

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}
