package br.atos.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.atos.database.Dao;
import br.atos.model.LoginEntidade;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	Dao Dao = new Dao();
    	
    	String username = request.getParameter("username");
    	String password = request.getParameter("password");
    	
    	LoginEntidade loginEntidade = new LoginEntidade();
    	
    	loginEntidade.setUsername(username);
    	loginEntidade.setPassword(password);
    	
    	if(Dao.validaLogin(loginEntidade)) {
    		response.sendRedirect("loginSucesso.jsp");
    		
    		
    	}else {
    		response.sendRedirect("loginInvalido.jsp"); 
    	}
    	
    	
    	
	}
    
    
    
}
