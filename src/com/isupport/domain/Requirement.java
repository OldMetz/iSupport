package com.isupport.domain;

public class Requirement {

	private double requirementNumber;
	private String description;
	
	public Requirement(double requirementNumber, String description) {
		this.requirementNumber = requirementNumber;
		this.description = description;
	}
	
	public double getRequirementNumber() {
		return requirementNumber;
	}
	public void setRequirementNumber(double requirementNumber) {
		this.requirementNumber = requirementNumber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
