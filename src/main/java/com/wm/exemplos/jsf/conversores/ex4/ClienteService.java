package com.wm.exemplos.jsf.conversores.ex4;

import java.util.Arrays;
import java.util.List;

public class ClienteService {
	
	private static final List<Cliente> CLIENTES = Arrays.asList(
				new Cliente(1, "Alexandre"),
				new Cliente(2, "José"),
				new Cliente(3, "Carlos")
			);
	
	
	public List<Cliente> pesquisa() {
		return CLIENTES;
	}
	
	public Cliente buscar(Integer id) {
		return CLIENTES.stream()
				.filter(c -> c.getId().equals(id))
				.findFirst()
				.get();
	}

}
