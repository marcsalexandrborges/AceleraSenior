package br.atos;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EnviarHtml
 */
@WebServlet("/EnviarHtml")
public class EnviarHtml extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnviarHtml() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter saida = response.getWriter();// Cria objeto que utiliza o response para enviar varias Strings (Grosso Modo)
		saida.println("<!DOCTYPE html>");
		saida.println("<html>");
		
		saida.print("<head>");
		saida.println("<meta charset=\"ISO-8859-1\">");
		saida.println("<title>Dados Do Marcos</title>");
		saida.println("</head>");
		saida.println("<body>");
		saida.println("<h2>Dados do Marcos</h2>");
		saida.println("<h1>Nome: </h1>");
		saida.println("<p1>Marcos</p1>");
		
		saida.println("<h1>Email: </h1>");
		saida.println("<p>marcos.barbosa@atos.net</p>");
		
		saida.println("<h1>Idade: </h2>");
		saida.println("<p>43</p>");
		
		saida.println("<h2>Como se enxerga daqui 5 anos dentro do universo java</h2>");
		saida.println("<p>Senior</p>");
		
		saida.println("<h2>Obrigado Professor </h2>");
		saida.println("<p>Aula nota 10</p>");
		
		saida.println("</body>");
		saida.println("</html>");
		
	
	}

}
