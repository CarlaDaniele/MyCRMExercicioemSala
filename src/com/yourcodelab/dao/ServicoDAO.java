package com.yourcodelab.dao;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yourcodelab.model.Cliente;
import com.yourcodelab.model.Servico;

public class ServicoDAO extends GenericDAO {
	private PreparedStatement ps;
	private String SQL_INSERT = "INSERT INTO TBSERVICO(servico, preco, descricao, diasuteis) VALUES (?, ?, ?, ?);";
	private String SQL_SELECT = "SELECT id, servico, preco, descricao, diasuteis FROM TBSERVICO;";
	
	public void inserirServico(Servico s)throws ClassNotFoundException, IOException, SQLException{
		// Abrir conexão
		openConnection();
		ps = connect.prepareStatement(SQL_INSERT);
		ps.setString(1, s.getServico());
		ps.setFloat(2, s.getPreco());
		ps.setString(3, s.getDescricao());
		ps.setInt(4, s.getDiasUteis());
		
		ps.executeUpdate();
		
		// Fechar conexão
		closeConnection();	
	}
	
	
	public List<Servico> listarTodos() throws SQLException, ClassNotFoundException, IOException{
		List<Servico> lista = new ArrayList<Servico>();
		
		// Abrir conexão
 		openConnection();
		
		// Preparar comando de SELECT
		ps = connect.prepareStatement(SQL_SELECT);
		
		// Retorno da consulta com os dados no ResultSet
		ResultSet rs = ps.executeQuery();
		
		if(rs != null){
			while(rs.next()){
				Servico s = new Servico(rs.getInt("id"), rs.getString("servico"), rs.getFloat("preco"), rs.getString("descricao"), rs.getInt("diasuteis"));
				lista.add(s);
			}
		}

		// Fechar conexão
		closeConnection();
		
		return lista;
		
	}
		
}
