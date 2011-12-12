package com.isupport.service;

import java.util.ArrayList;
import java.util.List;

import com.isupport.domain.Estimates;
import com.isupport.domain.Requirement;

public class EstimateService {

	private List<Estimates> estimates = new ArrayList<Estimates>();
	private static EstimateService reference;
	
	 public static EstimateService getService()
	    {
	    	if (reference == null)
	    		reference = new EstimateService();
	    	return reference;
	    }
	 
	 public EstimateService(){
		List<Requirement> requirements = null;
		Estimates estimates1 = new Estimates(1, "BCR", 1, "Delete Bank Account Functionality", 1, 2, 3, 2.5, requirements );
		Estimates estimates2 = new Estimates(2, "BCR", 2, "Change Name Functionality", 1, 2, 3, 2.5, requirements);
		Estimates estimates3 = new Estimates(3, "BCR", 3, "Sarah Is Cool", 1, 2, 3, 2.5, requirements);
		estimates.add(estimates1);
		estimates.add(estimates2);
		estimates.add(estimates3);
	 }
	 
	 
	 public List<Estimates> getAllEstimates()
	 {
		return new ArrayList<Estimates>(estimates);
	 }
	 
	 
	 public List<Estimates> getEstimateByRequestNumber(int changeRequestNumber){
		 
		 List<Estimates> returnList = new ArrayList<Estimates>();
		 
		 for (Estimates next : estimates){
			 
			 if (next.getRequestNumber() == changeRequestNumber){
				 returnList.add(next); 
			 }
			 
		 }
		 return returnList;
	 }
	 
	 
	 public double calculateEstimatedManDays(double optimisticManDays, double realisticManDays, double pesimisticManDays){
		 double estimatedManDays = 0;
		 double firstCalc;
		 double secondCalc;
		 
		 firstCalc = (realisticManDays / realisticManDays);
		 secondCalc = (firstCalc / pesimisticManDays);
		 estimatedManDays = (realisticManDays + secondCalc);
		 
		 return estimatedManDays;
	 }
	 
	 public void addNewRequirement(Estimates newRequirement)
	 {
				estimates.add(newRequirement);
	 }
}
