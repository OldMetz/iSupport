package com.isupport.domain;

import java.util.List;

public class Estimates extends ChangeRequest{

	private double optimisticManDays = 0;
	private double realisticManDays = 0;
	private double pesimisticManDays = 0;
	private double estimatedManDays = 0;
	private List<Requirement> requirements;
	


	public Estimates(int id, String requestType, int requestNumber,
			String name, double optimisticDelivery, double realisticDelivery,
			double pesimisticDelivery, double estimatedManDays,
			List<Requirement> requirements) {
		super(id, requestType, requestNumber, name);
		this.optimisticManDays = optimisticDelivery;
		this.realisticManDays = realisticDelivery;
		this.pesimisticManDays = pesimisticDelivery;
		this.estimatedManDays = estimatedManDays;
		this.requirements = requirements;
	}

	public Estimates(int id, String requestType, int requestNumber, String name) {
		super(id, requestType, requestNumber, name);

	}
	
	public double getOptimisticDelivery() {
		return optimisticManDays;
	}
	public void setOptimisticDelivery(double optimisticDelivery) {
		this.optimisticManDays = optimisticDelivery;
	}
	public double getRealisticDelivery() {
		return realisticManDays;
	}
	public void setRealisticDelivery(double realisticDelivery) {
		this.realisticManDays = realisticDelivery;
	}
	public double getPesimisticDelivery() {
		return pesimisticManDays;
	}
	public void setPesimisticDelivery(double pesimisticDelivery) {
		this.pesimisticManDays = pesimisticDelivery;
	}
	public List<Requirement> getRequirements() {
		return requirements;
	}
	public void setRequirements(List<Requirement> requirements) {
		this.requirements = requirements;
	}

	public double getEstimatedManDays() {
		return estimatedManDays;
	}

	public void setEstimatedManDays(double estimatedManDays) {
		this.estimatedManDays = estimatedManDays;
	}
	
	
		
}
