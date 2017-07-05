package com.abhinav_tiwari;

import java.util.ArrayList;

public class Search_emp_id {
	
	public static void search(int id,ArrayList<Employee_office_Details> emp_list) throws NoIdFoundException
	{
		int flag=0;		
		for(int j=0;j<emp_list.size();j++)
		{
			if(id==emp_list.get(j).getId())
			{
				flag=1;
				System.out.println();
				System.out.println(emp_list.get(j).getId()+"    "+emp_list.get(j).getName()+"    "+emp_list.get(j).getOffice_address()+"     "+emp_list.get(j).getDesignation());
			}
		}
		if(flag==0)
		{
				throw new NoIdFoundException("Sorry no match found");			
		}
		
	}

}
