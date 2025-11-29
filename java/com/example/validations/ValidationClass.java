package com.example.validations;

public class ValidationClass {
	
	public static boolean baseValueValidation(int id)
	{
		if(id <= 0)
		{
			System.out.println("The base value of land must be a non zero positive number");
			return false;
		}
		return true;
	}
	
	public static boolean locatedInMainCity(String location)
	{
		String yes = "y";
		String no = "n";
		if(yes.equalsIgnoreCase(location) || no.equalsIgnoreCase(location))
		{
			return true;
		}
		System.out.println("Enter single character of Y or N");
		return false;
	}
	
	public static boolean constructionAgeValidation(int age)
	{
		if(age <= 0)
		{
			System.out.println("The age of construction must be a non zero positive number");
			return false;
		}
		return true;
	}
	
	public static boolean vehicleRegistrationValidation(String vehicleRegistrationNumber)
	{
		if(vehicleRegistrationNumber.equals("0000") || vehicleRegistrationNumber.length() > 4)
		{
			System.out.println("Enter Vehicle Registration Number should be of length 4 and dont enter all zeroes");
			return false;
		}
		return true;
	}
	
	public static boolean purchaseValidator(int purchaseCost)
	{
		if(purchaseCost < 50000 || purchaseCost  >1000000)
		{
			System.out.println("The purchase cost must be between 50000 and 1000000");
			return false;
		}
		return true;
	}
	
	public static boolean velocityValidator(int velocity)
	{
		if(velocity < 120 || velocity  >300)
		{
			System.out.println("The velocity of vehicle must be between 120kmph and 300kmph");
			return false;
		}
		return true;
	}
	public static boolean capacityValidator(int capacity)
	{
		if(capacity < 2 || capacity  >50)
		{
			System.out.println("The capacity must be between 2 and 50");
			return false;
		}
		return true;
	}
	public static boolean typeValidator(int type)
	{
		if(type < 1 || type  > 3)
		{
			System.out.println("The type of vehicle must be between 1 and 3");
			return false;
		}
		return true;
	}
	public static boolean loginValidation(String userName, String password, String actualUserName, String actualPassword)
	{
		if(!userName.equals(actualUserName) || !password.equals(actualPassword))
		{
			System.out.println("Either the username or the password is incorrect");
			return false;
		}
		return true;
	}

}
