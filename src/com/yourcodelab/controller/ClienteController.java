package com.yourcodelab.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.yourcodelab.dao.ClienteDAO;
import com.yourcodelab.model.Cliente;

public class ClienteController {
	private ClienteDAO dao = new ClienteDAO();
	
	public void inserirCliente(Cliente c){
		if(c != null)
			dao.inserir(c);
	}
	
	public List<Cliente> listarTodos(){
		return dao.listarTodos();
	}
	public void deletarCliente(Integer id) throws ClassNotFoundException, IOException, SQLException{
		dao.deletarCliente(id);
	}
}
