package com.yourcodelab.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yourcodelab.controller.ServicoController;
import com.yourcodelab.model.Cliente;
import com.yourcodelab.model.Servico;

/**
 * Servlet implementation class InserirServicoServlet
 */
@WebServlet("/InserirServicoServlet")
public class InserirServicoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InserirServicoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServicoController servicocontroller = new ServicoController();
		//Obtendo parametros do formulário
		String servico = request.getParameter("servico");
		String preco = request.getParameter("preco");
		String descricao = request.getParameter("descricao");
		String diasuteis = request.getParameter("diasuteis");
		
		 //Instanciar objeto servico, convertendo preço e diasUteis
	
		Servico s = new Servico(new Integer(0), servico, Float.parseFloat(preco), descricao, Integer.parseInt(diasuteis));
		
		try {
			servicocontroller.inserirServico(s);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String nextJSP = "/servico/listarServico.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request, response);
		
	}

}
