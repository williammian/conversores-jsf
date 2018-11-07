package com.wm.exemplos.jsf.conversores.ex1;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "produtoBeanEx1")
public class ProdutoBean {
	
	private Produto produto = new Produto();

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}
