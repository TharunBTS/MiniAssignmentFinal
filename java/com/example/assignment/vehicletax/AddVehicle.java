package com.example.assignment.vehicletax;

import java.util.Scanner;


import com.example.db.DbQueries;
import com.example.validations.ValidationClass;

public class AddVehicle {
	
	private int vehicleId;
	private String vehicleRegistrationNumber;
	private String vehicleBrand;
	private int maximumVelocityOfVehicle;
	private int capacity;
	private String typeOfVehicle;
	private int purchaseCost;
	private double vehicleTax;
	
	private String confirmToSave;
	
	int type = 1;
	
	
	
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleRegistrationNumber() {
		return vehicleRegistrationNumber;
	}
	public void setVehicleRegistrationNumber(String vehicleRegistrationNumber) {
		this.vehicleRegistrationNumber = vehicleRegistrationNumber;
	}
	public String getVehicleBrand() {
		return vehicleBrand;
	}
	public void setVehicleBrand(String vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
	}
	public int getMaximumVelocityOfVehicle() {
		return maximumVelocityOfVehicle;
	}
	public void setMaximumVelocityOfVehicle(int maximumVelocityOfVehicle) {
		this.maximumVelocityOfVehicle = maximumVelocityOfVehicle;
	}
	
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getTypeOfVehicle() {
		return typeOfVehicle;
	}
	public void setTypeOfVehicle(String typeOfVehicle) {
		this.typeOfVehicle = typeOfVehicle;
	}
	public double getVehicleTax() {
		return vehicleTax;
	}
	public void setVehicleTax(double vehicleTax) {
		this.vehicleTax = vehicleTax;
	}
	
	public int getPurchaseCost() {
		return purchaseCost;
	}
	public void setPurchaseCost(int purchaseCost) {
		this.purchaseCost = purchaseCost;
	}
	@Override
	public String toString() {
		return "AddVehicle [vehicleId=" + vehicleId + ", vehicleRegistrationNumber=" + vehicleRegistrationNumber
				+ ", vehicleBrand=" + vehicleBrand + ", maximumVelocityOfVehicle=" + maximumVelocityOfVehicle
				+ ", capacity=" + capacity + ", typeOfVehicle=" + typeOfVehicle + ", vehicleTax=" + vehicleTax
				+ ", purchaseCost=" + purchaseCost + "]";
	}
	
	
	
	
	public void getProperty(Scanner ip)
	{
		
		try
		{
			System.out.println("ENTER THE PROPERTY DETAILS");
			
			do {
				System.out.println("Enter Vehicle registration Number ");
				vehicleRegistrationNumber = ip.next();
			}while(!ValidationClass.vehicleRegistrationValidation(vehicleRegistrationNumber));
			
			System.out.println("Enter Vehicle Brand ");
			vehicleBrand = ip.next();
			
			
			do
			{
				System.out.println("Enter Maximum Velocity of vehicle");
				maximumVelocityOfVehicle = ip.nextInt();
			}while(!ValidationClass.velocityValidator(maximumVelocityOfVehicle));
			
			
			do
			{
				System.out.println("Enter capacity");
				capacity = ip.nextInt();
			}while(!ValidationClass.capacityValidator(capacity));
			
			
			do
			{
				System.out.println("Enter type of vehicle");
				int type = ip.nextInt();
			}while(!ValidationClass.typeValidator(type));
			
			
			
			do {
					System.out.println("Enter Purchase cost ");
					purchaseCost = ip.nextInt();
			}while(!ValidationClass.purchaseValidator(purchaseCost));
			
			 
			 
			 
			 ip.nextLine();
			 System.out.println("Enter Y to save");
			 confirmToSave = ip.nextLine();
			
			 if(confirmToSave.equals("Y"))
			 {
				AddVehicle ap = new AddVehicle();
				ap.setVehicleRegistrationNumber(vehicleRegistrationNumber);
				ap.setVehicleBrand(vehicleBrand);
				ap.setMaximumVelocityOfVehicle(maximumVelocityOfVehicle);
				ap.setCapacity(capacity);
				if(type == 1)
				ap.setTypeOfVehicle("petrol");
				else if(type == 2)
					ap.setTypeOfVehicle("diesel");
				else if(type == 3)
					ap.setTypeOfVehicle("lpg");
				
				ap.setPurchaseCost(purchaseCost);
					
				System.out.println(ap);
				DbQueries.insertVehicleRrecord(ap);
			 }
		}
		catch(Exception e)
		{
			System.out.println("Data not inserted!! Retry");
			System.out.println(e.getMessage());
			return;
		}
		
		
		
//		return list;
	}
	
	
	
	
	

}
