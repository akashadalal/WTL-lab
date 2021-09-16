package net.javaguides.usermanagement.web;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.javaguides.usermanagement.model.Loginbean;
import net.javaguides.usermanagement.dao.Logindao;

@WebServlet("/login")

public class Loginservlet extends HttpServlet {
	 private static final long serialVersionUID = 1L;
	    private Logindao loginDao;

	    public void init() {
	        loginDao = new Logindao();
	    }

	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	        String username = request.getParameter("username");
	        String password = request.getParameter("password");
	        Loginbean loginBean = new Loginbean();
	        loginBean.setUsername(username);
	        loginBean.setPassword(password);

	        try {
	            if (loginDao.validate(loginBean)) {
	                //HttpSession session = request.getSession();
	                // session.setAttribute("username",username);
	                response.sendRedirect("loginsuccess.jsp");
	            } else {
	                HttpSession session = request.getSession();
	                //session.setAttribute("user", username);
	                //response.sendRedirect("login.jsp");
	            }
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }

}
