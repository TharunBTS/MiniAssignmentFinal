package com.example.assignment;

import com.example.db.DbQueries;

public class TotalTax {
	
//	PropertyTax propertyTax = new PropertyTax();
//	VehicleTax vehicleTax = new VehicleTax();
	
	
	public void totalList() throws Exception
	{
		int arr1[] = DbQueries.recordCount();
		double arr2[] = DbQueries.taxSum();
		
		
		String hyphen="-";
//		int res1=p.totalRows();
		System.out.println(hyphen.repeat(103));
		System.out.println(String.format("%s","SR. NO")+String.format("%20s","Particular")+ String.format("%30s", "Quantity") + String.format("%30s", "Tax") );
		System.out.println(hyphen.repeat(103));
//		double res2=v.totalTax();
//		int res3=v.totalRows();
		System.out.println(String.format("%s","1")+String.format("%20s","Property") + String.format("%30s",arr1[0])+String.format("%40s", arr2[0]));
		System.out.println(String.format("%s","2")+String.format("%20s", "Vehicle")+String.format("%30s", arr1[1])+String.format("%38s", arr2[1]));	
		System.out.println(hyphen.repeat(103));
		System.out.println(String.format("%s","TOTAL")+String.format("%47s", (arr1[0]+arr1[1]))+String.format("%39s", (arr2[0]+arr2[1])));
		System.out.println(hyphen.repeat(103));
		
		

	}

}
