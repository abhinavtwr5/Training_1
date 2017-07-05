package com.abhinav_tiwari;

public class Employee_office_Details extends Employee {
	
	protected String office_address;
	protected String designation;
	
	public Employee_office_Details(int id, String name, String office_address, String designation) {
		super(id, name);
		this.office_address = office_address;
		this.designation = designation;
	}

	public String getOffice_address() {
		return office_address;
	}

	public void setOffice_address(String office_address) {
		this.office_address = office_address;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	

}
