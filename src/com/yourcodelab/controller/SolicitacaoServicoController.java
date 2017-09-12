package com.yourcodelab.controller;

import java.io.IOException;
import java.sql.SQLException;

import com.yourcodelab.dao.SolicitacaoServicoDAO;
import com.yourcodelab.model.SolicitacaoServico;

public class SolicitacaoServicoController {
	public SolicitacaoServicoDAO dao = new SolicitacaoServicoDAO();
	
	public void inserirOS(SolicitacaoServico os)throws ClassNotFoundException, IOException, SQLException{
		dao.inserirOS(os);
	}
}
