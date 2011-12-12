package com.isupport.servlets;

import java.io.IOException;
import java.util.ArrayList;
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

public class NewEstimateServlet extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		doPost(request, response);
	}
	
	public void  doPost (HttpServletRequest request, HttpServletResponse response)
			throws HTTPException, IOException, ServletException {
		
		EstimateService service = EstimateService.getService();
		String requestType = request.getParameter("REQUEST_TYPE");
		int requestNumber = new Integer(request.getParameter("REQUEST_NUMBER"));
		String requestDescription = request.getParameter("REQUEST_DESCRIPTION");
		double optimisticMandays = new Double(request.getParameter("OPTIMISTIC_MANDAYS"));
		double reaslisticMandays = new Double(request.getParameter("REALISTIC_MANDAYS"));
		double pesimisticMandays = new Double(request.getParameter("PESIMISTIC_MANDAYS"));
		
		int id = service.getAllEstimates().size()+1;
		double actualManDays = service.calculateEstimatedManDays(optimisticMandays, reaslisticMandays, pesimisticMandays);
		
		Estimates newEstimates = new Estimates(id, requestType, requestNumber, requestDescription, optimisticMandays, reaslisticMandays, pesimisticMandays, actualManDays, null);
		
		service.addNewRequirement(newEstimates);
		
		ServletContext context = getServletContext();
		
		RequestDispatcher dispatch = context.getRequestDispatcher("/estimates.jsp");
		
		dispatch.forward(request, response);
		
	}
	
}
