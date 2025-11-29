package com.example.assignment.propertytax;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.example.db.DbConnect;

public class DisplayAllProperties {
	
	public static void display(List<AddProperty> list) throws Exception
	{
		
		String line = "=".repeat(103);
		System.out.println(line);
		System.out.println(String.format("%s", "ID") + String.format("%20s", "BaseValueOfLand") + String.format("%20s", "BUILTUPAREA") + String.format("%20s", "AgeOfLandInYears") + String.format("%20s", "LocatedInCity") + String.format("%20s", "Tax"));
		System.out.println(line);
   	 	list.forEach((x) -> {
   	 		System.out.println(x.getPropertyId() + String.format("%20s", x.getBaseValueOfLand()) + String.format("%20s", x.getBuildUpArea()) + String.format("%20s", x.getAgeOfLandInYears()) + String.format("%20s", x.getLocatedInCity()) + String.format("%20s", x.getTax()));
   	 	
   	 	});
   	 	System.out.println(line);
		

		
	
//		Connection connection = DbConnect.getConnection();
//		String sql = "select * from addProperty";
//		PreparedStatement ps = connection.prepareStatement(sql);
//		ResultSet rs = ps.executeQuery();
//		AddProperty ap = new AddProperty();
//		while(rs.next())
//		{
//			System.out.println("PropertyId   BaseValueOfLand   BuildUpArea   AgeOfLandInYears   LocatedInCity   Tax");
//			ap = new AddProperty();
//			System.out.println( rs.getInt(1) +"             "+rs.getInt(2)+"                   "+ rs.getInt(3)+"              "+rs.getInt(4)+"              "+rs.getString(5)+"                  "+rs.getDouble(6));
//			 
//		}
		
	}
	

}
