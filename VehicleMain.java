package oopConcept;

public class VehicleMain {

	public static void main(String[] args) {

		Vehicle truck = new Vehicle();
		System.out.println("------------------------------------");
		System.out.println("This is a Truck Properties");
		System.out.println(("Truck Name: ")+(truck.modelName = "TATA"));
		System.out.println(("Truck Color: ")+(truck.color = "Red"));
		System.out.println(("Truck Milage: ")+(truck.milage = "20km/h"));
		
		truck.vehicleEngine();
		truck.vehicleStaring();
		truck.vehicleWheels();
		
		Vehicle  bus = new Vehicle();
		System.out.println("------------------------------------");
		System.out.println("This is a Bus Properties");
		System.out.println(("Bus Name: ")+(bus.modelName = "EISHER"));
		System.out.println(("Bus Color: ")+(bus.color = "Whight"));
		System.out.println(("Bus Milage: ")+(bus.milage = "30km/h"));
		
		bus.vehicleEngine();
		bus.vehicleStaring();
		bus.vehicleWheels();
		
		Vehicle car = new Vehicle();
		System.out.println("------------------------------------");
		System.out.println("This is a Car Properties");
		System.out.println(("Car Name: ")+(car.modelName = "Lamborghini"));
		System.out.println(("Car Color: ")+(car.color = "Black"));
		System.out.println(("Car Milage: ")+(car.milage = "10km/h"));
		
		car.vehicleEngine();
		car.vehicleStaring();
		car.vehicleWheels();
		
	}

}
