package com.wm.exemplos.jsf.conversores.ex2;

import java.math.BigDecimal;
import java.util.Date;

public class Produto {
	
	private Date dataLancamento;
	
	private BigDecimal preco;

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	
	public Date getDataLancamento() {
		return dataLancamento;
	}
	
	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
}
