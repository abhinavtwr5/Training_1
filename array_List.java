package com.abhinav_tiwari;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class array_List {
	
	public static ArrayList<Employee_office_Details> arrayList() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
		int number_of_employees;
		int id = 0;
		String name=null;
		String office_address=null;
		String designation=null;
		int flag=0;
		ArrayList<Employee_office_Details> emp_list=new ArrayList<Employee_office_Details>();
		 System.out.println("Enter the number of employees");
	        number_of_employees=Integer.parseInt(br.readLine());
	        for(int i=0;i<number_of_employees;i++)
	        {
	        	System.out.println("Enter the id of the employee");
	        	try
	        	{
	        		id=Integer.parseInt(br.readLine());
	        		flag=Check_Input_Id.check_Duplicate_Id(id, emp_list);
	        		id=flag;
	        	}
	        	
	        	catch(NumberFormatException e)
	        	{
	        		System.out.println(e);
	        		System.exit(0);
	        	}
	        	
	        	System.out.println("Enter the name of the employee");
	        	name=br.readLine();
	        	System.out.println("Enter the Office name of the employee");
	        	office_address=br.readLine();
	        	System.out.println("Enter the designation of the employee");
	        	designation=br.readLine();
	        	

	        	Employee_office_Details obj=new Employee_office_Details(id, name, office_address, designation);
	        	emp_list.add(obj);
	        }
	        return emp_list;
	}

}