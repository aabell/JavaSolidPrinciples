package com.javaSolid.depedencyAssociation;

public class Application {
	public static void main(String[] args) {
		Vehicle car = new Vehicle();
		car.startEngine();
		car.speedUp();
		car.stopEngine();
		
		//This is know as Dependency Association
		Driver driver = new Driver();
		driver.driveTheVehicle(car);
	}

}
