package com.isupport.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.http.HTTPException;

import com.isupport.domain.Estimates;
import com.isupport.service.EstimateService;

public class ViewAllEstimatesServlet extends HttpServlet {

	public void doGet (HttpServletRequest request, HttpServletResponse response) throws HTTPException, IOException, ServletException
	{

		// do some work
		EstimateService estimateService = EstimateService.getService();
		List<Estimates> estimates = estimateService.getAllEstimates();
		//store all estimates
		request.setAttribute("estimates", estimates);
		
		ServletContext context = getServletContext();
		RequestDispatcher dispatch = context.getRequestDispatcher("/viewAllEstimates.jsp");
		dispatch.forward(request, response);
		
	}
	
}
