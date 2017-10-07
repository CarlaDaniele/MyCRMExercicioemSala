package com.yourcodelab.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.yourcodelab.dao.ServicoDAO;
import com.yourcodelab.model.Cliente;
import com.yourcodelab.model.Servico;

public class ServicoController {
		private ServicoDAO dao = new ServicoDAO();
		
		public void inserirServico(Servico s)throws ClassNotFoundException, IOException, SQLException{
			dao.inserirServico(s);
		}
		
		public List<Servico> listarTodos()throws ClassNotFoundException, IOException, SQLException{
			return dao.listarTodos();
		}
		
		public void deletarServico(Integer id) throws ClassNotFoundException, IOException, SQLException{
			dao.deletarServico(id);
		}
	
}