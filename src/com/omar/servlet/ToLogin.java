package com.omar.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.omar.biz.LoginBiz;
import com.omar.biz.impl.LoginBizImpl;
import com.omar.utils.PsdMd5;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class ToLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ToLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String psd = PsdMd5.getMd5(request.getParameter("psd"));
		System.out.println(psd);
		LoginBiz loginBiz = new LoginBizImpl();
		Boolean flag = loginBiz.getBooleanByNamePsd(name, psd);
		String flag1 = Boolean.toString(flag);
		
		request.setAttribute("flag", flag1);
		System.out.println(flag1);
		
		if(flag){
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
