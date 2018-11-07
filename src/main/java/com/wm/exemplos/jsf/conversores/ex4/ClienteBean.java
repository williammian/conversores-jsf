package com.wm.exemplos.jsf.conversores.ex4;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "clienteBeanEx4")
public class ClienteBean {
	
	private List<Cliente> lista;
	
	private Cliente cliente;
	
	private ClienteService clienteService = new ClienteService();
	
	@PostConstruct
	void postConstruct() {
		lista = clienteService.pesquisa();
	}
	
	public List<Cliente> getLista() {
		return lista;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
