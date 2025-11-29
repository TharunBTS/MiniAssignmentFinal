package com.example.assignment.vehicletax;

import java.util.List;



public class DisplayVehicleProperties {
	
	public static void display(List<AddVehicle> list)
	{
//		System.out.println("VehicleId   VehicleRegistrationNumber   VehicleBrand   MaximumVelocityOfVehicle   Capacity   TypeOfVehicle   VehicleTax");
//   	 	list.forEach(x -> System.out.println(x.getVehicleId()+"             "+x.getVehicleRegistrationNumber()+"           "+x.getVehicleBrand()+"        "+x.getMaximumVelocityOfVehicle()+"                    "+x.getCapacity()+"            "+x.getTypeOfVehicle()+"              "+x.getVehicleTax()));
	
	
   	 String line = "=".repeat(140);
		System.out.println(line);
		System.out.println(String.format("%s", "ID") + String.format("%30s", "VehicleRegistrationNumber") + String.format("%20s", "VehicleBrand") + String.format("%30s", "MaximumVelocityOfVehicle") + String.format("%20s", "Capacity") + String.format("%20s", "TypeOfVehicle") + String.format("%20s", "VehicleTax"));
		System.out.println(line);
	 	list.forEach((x) -> {
	 		System.out.println(x.getVehicleId() + String.format("%20s", x.getVehicleRegistrationNumber()) + String.format("%30s", x.getVehicleBrand()) + String.format("%20s", x.getMaximumVelocityOfVehicle()) + String.format("%30s", x.getCapacity()) + String.format("%20s", x.getTypeOfVehicle()) + String.format("%20s", x.getVehicleTax()));
	 	
	 	});
	 	System.out.println(line);
	
	
	}

}
