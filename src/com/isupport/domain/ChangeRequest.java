package com.isupport.domain;

public class ChangeRequest {
	
	private static int nextId = 1;
	private int id;
	private String requestType;
	private int requestNumber;
	private String name;
	
	public ChangeRequest(int id, String requestType, int requestNumber, String name) {
		this.id = nextId+1;
		this.requestType = requestType;
		this.requestNumber = requestNumber;
		this.name = name;
	}
	
	public String toString() {
		return this.name ;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getRequestType() {
		return requestType;
	}
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}
	public int getRequestNumber() {
		return requestNumber;
	}
	public void setRequestNumber(int requestNumber) {
		this.requestNumber = requestNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
