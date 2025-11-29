package com.example.assignment.main;



import java.util.Scanner;

import com.example.assignment.PropertyTax;
import com.example.assignment.TotalTax;
import com.example.assignment.VehicleTax;
import com.example.login.Login;


public class Final {

	public static void main(String[] args) throws Exception {
		
		PropertyTax propertyTax = new PropertyTax();
		VehicleTax vehicleTax = new VehicleTax();
		TotalTax totalTax = new TotalTax();
		Login login = new Login();
		
		
		Scanner ip = new Scanner(System.in);
		
		if(login.loginMethod())
		{
			while(true)
			{
				System.out.println("1. PROPERTY TAX");
				System.out.println("2. VEHICLE TAX");
				System.out.println("3. TOTAL");
				System.out.println("4. EXIT");
				
				int n = ip.nextInt();
				
				switch(n)
				{
					case 1 : 
						propertyTax.propertyMethod();
						break;
					case 2 : 
						vehicleTax.vehicleMethod();
						break;
					case 3 : 
						totalTax.totalList();
						break;
					case 4 : 
						System.out.println("Than You For Visiting, Exiting..............");
						return;
				}
				
				
			}
		}
		
			
			
		}
	

//		PropertyTax propertyTax = new PropertyTax();
//		propertyTax.propertyMethod();
//		System.out.println(list);
		
//		VehicleTax vehicleTax = new VehicleTax();
//		vehicleTax.vehicleMethod();
		
//		TotalTax totalTax = new TotalTax();
//		totalTax.totalList();

	}

