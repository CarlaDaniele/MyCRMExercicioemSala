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

/**
 * Servlet implementation class DeletarServicoServlet
 */
@WebServlet("/DeletarServicoServlet")
public class DeletarServicoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeletarServicoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String nextJSP = "/cliente/listarClientes.jsp";
		
		//Passo 2 - Converter Id para integer
		if(id != null){
			Integer x =  new Integer(Integer.parseInt(id));
			
			//Passo 3 - Inserir lógica para chamar service
			ServicoController controller = new ServicoController();
	
				
				try {
					controller.deletarServico(x);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				nextJSP = "index.jsp";
			
			
		}
	
		//Passo 4 - redirecionar
		RequestDispatcher rd = getServletContext().getRequestDispatcher(nextJSP);
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
