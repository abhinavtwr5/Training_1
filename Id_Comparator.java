package com.abhinav_tiwari;

import java.util.Comparator;

public class Id_Comparator implements Comparator<Employee_office_Details> {
	public int compare(Employee_office_Details s1,Employee_office_Details s2){  
		if(s1.id==s2.id)  
		return 0;  
		else if(s1.id>s2.id)  
		return 1;  
		else  
		return -1;
	}
}
		  
		  


