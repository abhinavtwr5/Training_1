package com.abhinav_tiwari;

import java.util.Comparator;

public class Name_Comparator implements Comparator<Employee_office_Details> {
	public int compare(Employee_office_Details s1,Employee_office_Details s2){  
		return s1.name.compareTo(s2.name);  
	}
}	
