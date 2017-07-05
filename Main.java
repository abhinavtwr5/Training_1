package com.abhinav_tiwari;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	
	public static void main(String[] args)throws IOException, NoIdFoundException 
	
	{
		ArrayList<Employee_office_Details> emp_list=new ArrayList<Employee_office_Details>();
		BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
		String c=null;
        emp_list=array_List.arrayList(); // return arraylist of employees from class array_List.java 
        
        System.out.format("%5s %12s %15s %20s","Emp id ","Name ","Office ","Designation ");
        System.out.println();
        System.out.println();
        
        
        for(Employee_office_Details itr : emp_list)
        {
        	 System.out.format("%1s %14s %10s %15s",itr.getId(),itr.getName(),itr.getOffice_address(),itr.getDesignation());
        	 System.out.println();	 
        }
        
        System.out.println();
        System.out.println();
        do
        {
        	 System.out.println("Enter the value 1 for searching\nEnter the value 2 for sorting by id\nEnter the value 3 for sorting by name");
             int ch=Integer.parseInt(br.readLine());
             switch(ch)
             {
             case 1 : System.out.println("Enter the emp id to be searched");
                      int id=Integer.parseInt(br.readLine());
                      Search_emp_id.search(id,emp_list);
                      break;
                      
             case 2 : Collections.sort(emp_list,new Id_Comparator());  
             System.out.format("%5s %12s %15s %20s","Emp id ","Name ","Office ","Designation ");
             System.out.println();
             System.out.println();
             
             for(Employee_office_Details itr : emp_list)
             {
             	 System.out.format("%1s %14s %10s %15s",itr.getId(),itr.getName(),itr.getOffice_address(),itr.getDesignation());
             	 System.out.println();	 
             }
             break;
             
             case 3 : Collections.sort(emp_list,new Name_Comparator());  
             System.out.format("%5s %12s %15s %20s","Name ","Emp id ","Office ","Designation ");
             System.out.println();
             System.out.println();
             
             for(Employee_office_Details itr : emp_list)
             {
             	 System.out.format("%1s %14s %10s %15s",itr.getName(),itr.getId(),itr.getOffice_address(),itr.getDesignation());
             	 System.out.println();	 
             }
             break;
             
             default : System.out.println("Sorry Wrong Input");
           
        }
             System.out.println();
             System.out.println();
             System.out.println("Do you want to continue?\nPress y for yes\nPress any other button to exit");
             c=br.readLine();
        }while(c.equals("y") || c.equals("Y"));
            
	}
}

        	
         	
