package com.multipleinterfacepractice;

public class VehicleMain {

	public static void main(String[] args) {

		ElectricleVehicle ev;
		ev = new HybridCar();
		ev.chargeBattery();
		
		FuelVehicle fv;
		fv = new HybridCar();
		fv.fillFuel();
	}

}
