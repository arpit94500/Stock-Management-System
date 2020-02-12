package com.arpit.controller;
import java.util.*;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.arpit.data.ItemDAOImpl;
import com.arpit.model.Item;

public class ItemController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	ItemDAOImpl utility = null;
	
	
	
	
    @Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		utility =new ItemDAOImpl();
	}

	public ItemController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			/*List<Item> items=utility.getItems();
			System.out.println(items);*/
			listItems(request,response);
		}
		catch(Exception e)
		{
			throw new ServletException(e);
		}
		
	}

	private void listItems(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<Item> items = utility.getItems();
		request.setAttribute("item_list", items);
		RequestDispatcher rd = request.getRequestDispatcher("list-items.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
