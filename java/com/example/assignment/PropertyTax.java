package com.example.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.example.assignment.propertytax.AddProperty;
import com.example.assignment.propertytax.CalculatePropertyTax;
import com.example.assignment.propertytax.DisplayAllProperties;
import com.example.db.DbQueries;

public class PropertyTax {
	AddProperty addProperty = new AddProperty();
	CalculatePropertyTax calculatePropertyTax = new CalculatePropertyTax();
	List<AddProperty> list = new ArrayList<>();
	Scanner ip = new Scanner(System.in);
	
	public PropertyTax()
	{
		list = DbQueries.getRecord();
	}
	
	
	public void propertyMethod() throws Exception
	{

     while (true) {

         System.out.println("Enter 1-Add Property | 2-Calculate Tax | 3-Display All Properties | 4-Back to main menu");
         int n = ip.nextInt();

         switch (n) {

             case 1:
                 addProperty.getProperty(ip);
                 System.out.println(list);
                 break;

             case 2:
            	 list = DbQueries.getRecord();
              
            	 DisplayAllProperties.display(list);
            	 System.out.println("Enter propertyId from 1 to "+ list.size());
            	 int id = ip.nextInt();
            	 AddProperty ap = list.get(id-1);

                 if (ap.getLocatedInCity().equalsIgnoreCase("Y")) {
                     double tax = calculatePropertyTax.inCity(ap);
                     ap.setTax(n);
                     list.set(id-1, ap);
                     DbQueries.updateRecord(ap, tax);
                     System.out.println("PROPERTY TAX = " + tax);
                 } else if(ap.getLocatedInCity().equalsIgnoreCase("N")){
                     double tax = calculatePropertyTax.notInCity(ap);
                     ap.setTax(tax);
                     list.set(id-1, ap);
                     DbQueries.updateRecord(ap,tax);
                     System.out.println("PROPERTY TAX = " + tax);
                 }else {
                	 System.out.println("Enter Y or N");
                 }
                 
                 break;

             case 3:
            	 	list = DbQueries.getRecord();
            	 	DisplayAllProperties.display(list);
                 break;
                 
             case 4:
            	 return;

             default:
            	 System.out.println("Enter a valid number");
         }
     }
	
	
	}
	
	
}
