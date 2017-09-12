package com.yourcodelab.dao;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.yourcodelab.model.SolicitacaoServico;

public class SolicitacaoServicoDAO extends GenericDAO {
	private PreparedStatement ps;
	private String SQL_INSERT = "INSERT INTO TBOS(idCliente, idServico, descricao, dataos) VALUES (?, ?, ?, ?);";
	private String SQL_SELECT = "SELECT id, idCliente, idServico, descricao, dataos FROM TBOS;";
	
	public void inserirOS(SolicitacaoServico os)throws ClassNotFoundException, IOException, SQLException{
		openConnection();
		
		ps = connect.prepareStatement(SQL_INSERT);
		
		ps.setInt(1, os.getIdCliente());
		ps.setInt(2, os.getIdServico());
		ps.setString(3, os.getDescricao());
		ps.setString(4, os.getDataos());

		ps.executeUpdate();
		
		
		closeConnection();	
		
	}
	
	
}
