package com.javaSolid.Four.DependencyInversion;

public class DeviceFactory {
	public static void main(String args[]){
		GeneralManufacturingProcess manfacturer = new SmartphoneManufacturingProcess("Iphone process");
		manfacturer.launchProcess();
	
	}

}
