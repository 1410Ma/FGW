package com.omar.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.omar.pojo.HYXM;

/**
 * Servlet implementation class NewXM
 */
@WebServlet("/newXM")
public class NewXM extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewXM() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String time = request.getParameter("time");
		String address = request.getParameter("address");
		String content = request.getParameter("content");
		String cp = request.getParameter("cp");
		String select1 = request.getParameter("select");
	    
		HYXM hy = new HYXM(name,time,address,content,cp,select1);
		/*
		 * 存储到数据库中
		 */
		
//		System.out.println(hy);
//		request.setAttribute("hyxm", hy);
		request.getRequestDispatcher("/main.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
