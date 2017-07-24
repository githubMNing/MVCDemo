package com.company.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;

import com.company.dao.pojo.Product;
import com.company.service.factory.ServiceFactory;

@WebServlet("/ProductFindByIdServlet")
public class ProductFindByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("pid"));
		String option = request.getParameter("option");
		Product product = ServiceFactory.getProductInstance().findById(id);
		List<Product> productList = new ArrayList<>();
		productList.add(product);
		if(product != null){
			if("update".equals(option)) {
				request.setAttribute("product", product);
				request.getRequestDispatcher("product_update.jsp").forward(request, response);
			}else {
				request.setAttribute("productListFromServlet", productList);
				request.getRequestDispatcher("product_findAll.jsp").forward(request, response);
			}
			
		}else{
			HttpSession session = request.getSession();
			session.setAttribute("errmsg", "no product");
			response.sendRedirect(request.getContextPath() + "/error.jsp");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}


}
