package practice16;

public class LaptopMain {

	public static void main(String[] args) {

		Laptop lenovo = new Laptop();
		System.out.println("-------------------------------------");
		System.out.println("This is a Lenovo Laptop");
		System.out.println(("Laptop Model: ")+(lenovo.lapModel = 1100));
		System.out.println(("Laptop Name: ")+(lenovo.name = " Lenovo"));
		System.out.println(("Memory Type: ")+(lenovo.memoryType = "SSD"));
		System.out.println(("Operating System: ")+(lenovo.os = "Windows"));
		System.out.println(("Laptop Price: ")+(lenovo.price = 78000.50));
		
		lenovo.laptopDisplay();
		lenovo.laptopSetting();
		lenovo.laptopWoring();
		
		Laptop dell = new Laptop();
		System.out.println("-------------------------------------");
		System.out.println("This is a Dell Laptop");
		System.out.println(("Laptop Model: ")+(dell.lapModel = 1111));
		System.out.println(("Laptop Name: ")+(dell.name = "DELL"));
		System.out.println(("Memory Type: ")+(dell.memoryType = "SSD"));
		System.out.println(("Operating System: ")+(dell.os = "Windows"));
		System.out.println(("Laptop Price: ")+(dell.price = 60000.50));
		
		dell.laptopDisplay();
		dell.laptopSetting();
		dell.laptopWoring();
		
		Laptop asus = new Laptop();
		System.out.println("-------------------------------------");
		System.out.println("This is a ASUS Laptop");
		System.out.println(("Laptop Model: ")+(asus.lapModel = 112233));
		System.out.println(("Laptop Name: ")+(asus.name = "ASUS"));
		System.out.println(("Memory Type: ")+(asus.memoryType = "SSD"));
		System.out.println(("Operating System: ")+(asus.os = "Linux"));
		System.out.println(("Laptop Price: ")+(asus.price = 89000.50));
		
		asus.laptopDisplay();
		asus.laptopSetting();
		asus.laptopWoring();

	}

}
