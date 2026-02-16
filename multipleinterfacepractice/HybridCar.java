package com.multipleinterfacepractice;

public class HybridCar implements FuelVehicle,ElectricleVehicle{

	@Override
	public void chargeBattery() {

		System.out.println("This is a Method of EV");
	}

	@Override
	public void fillFuel() {

		System.out.println("This is a Method of Fuel Vehicle");
	}

}
