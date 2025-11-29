package com.example.login;

import java.util.Scanner;

import com.example.validations.ValidationClass;

public class Login {
	
	private String userName;
	private String password;
	private static final String USER = "user";
	private static final String PASSWORD = "user@123";
	
	public boolean loginMethod()
	{
		Scanner ip = new Scanner(System.in);
		String line = "+-"+"-".repeat(31)+"-+";
		do
		{
			
			System.out.println("""
					%s					 
					| WELCOME TO TAX CALCULATION APP |
					%s
					PLEASE LOGIN TO CONTINUE - 
					""".formatted(line,line));
			System.out.print("USERNAME - ");
			userName = ip.nextLine();
			System.out.print("PASSWORD - ");
			password = ip.nextLine();
			
		}while(!ValidationClass.loginValidation(userName, password, USER, PASSWORD));
		
		
		
		
		
		
		return true;
		
	}
	

}
