package com.info.beans;

public class Guest {
	
	private String name;
	
	private long phNo;
	
	

	public Guest(String name, long phNo) {
		super();
		this.name = name;
		this.phNo = phNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhNo() {
		return phNo;
	}

	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	
	

}
