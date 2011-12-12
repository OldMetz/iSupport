package com.isupport.service;

import java.util.List;

import com.isupport.domain.Estimates;

public class EstimateMainService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		EstimateService estimateService = EstimateService.getService();
		List<Estimates> estimates = estimateService.getAllEstimates();
		
		for (Estimates est : estimates)
		{
			System.out.println(est.getEstimatedManDays());
		}
		
		
	}

}
