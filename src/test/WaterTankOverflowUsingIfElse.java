package test;

import java.util.Scanner;

public class WaterTankOverflowUsingIfElse{
	
	public static void main(String[] args) {

	
	float waterLevel;
	try (Scanner sc1 = new Scanner(System.in)) {
		System.out.println("Input the water level: ");
		waterLevel = sc1.nextInt();
	}
	
	if(waterLevel==1)
		System.out.println("Starting water tank");
	
	else if(waterLevel==5)
	System.out.println("Warning Alert Triggered");
	
	else if(waterLevel==8)
		System.out.println("Final Alert triggered.");
		
	else if(waterLevel==10)
		System.out.println("ShutDown Water Pump");
	
	else
		System.out.println("Nothing To Do That");
	
	}
}
