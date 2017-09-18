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
import com.yourcodelab.controller.SolicitacaoServicoController;
import com.yourcodelab.model.Servico;
import com.yourcodelab.model.SolicitacaoServico;

/**
 * Servlet implementation class InserirSolicitacaoServicoServlet
 */
@WebServlet("/InserirSolicitacaoServicoServlet")
public class InserirSolicitacaoServicoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InserirSolicitacaoServicoServlet() {
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
		
		SolicitacaoServicoController oscontroller = new SolicitacaoServicoController();
		String idCliente = request.getParameter("idCliente");
		String idServico = request.getParameter("idServico");
		String descricao = request.getParameter("descricao");
		String dataos = request.getParameter("dataos");
		
		SolicitacaoServico os = new SolicitacaoServico(new Integer(0), Integer.parseInt(idCliente), Integer.parseInt(idServico), descricao, dataos);
		
		try {
			oscontroller.inserirOS(os);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String nextJSP = "/cliente/listarClientes.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request, response);
	}

}
