package practice16;

public class ColdDrinkMain {

	public static void main(String[] args) {

		ColdDrink pepsi = new ColdDrink();
		System.out.println("---------------------------------");
		System.out.println("This is a ColdDrink(Pepsi)");
		System.out.println(("ColdDrink Id: ")+(pepsi.cdId = 01));
		System.out.println(("ColdDrink Name: ")+(pepsi.cdName = "Pepsi"));
		System.out.println(("ColdDrink Color: ")+(pepsi.cdColor = "Black"));
		System.out.println(("ColdDrink Test: ")+(pepsi.test = "Sweet"));
		System.out.println(("ColdDrink Price: ")+(pepsi.cdPrice = 40.5));
		
		pepsi.makingProcess();
		pepsi.makingContainer();
		pepsi.testCheck();
		
		ColdDrink sprite = new ColdDrink();
		System.out.println("---------------------------------");
		System.out.println("This is a ColdDrink(Sprite)");	
		System.out.println(("ColdDrink Id: ")+(sprite.cdId = 1122));
		System.out.println(("ColdDrink Name: ")+(sprite.cdName = "Sprite"));
		System.out.println(("ColdDrink Color: ")+(sprite.cdColor = "litleGreen"));
		System.out.println(("ColdDrink Test: ")+(sprite.test = "Namkin"));
		System.out.println(("ColdDrink Price: ")+(sprite.cdPrice = 40.5));
		
		sprite.makingProcess();
		sprite.makingContainer();
		sprite.testCheck();
		
		ColdDrink cocacola = new ColdDrink();
		System.out.println("---------------------------------");
		System.out.println("This is a ColdDrink(COCA-COLA)");
		System.out.println(("ColdDrink Id: ")+(cocacola.cdId = 12));
		System.out.println(("ColdDrink Name: ")+(cocacola.cdName = "COCA-COLA"));
		System.out.println(("ColdDrink Color: ")+(cocacola.cdColor ="Black"));
		System.out.println(("ColdDrink Test: ")+(cocacola.test = "litleSweet"));
		System.out.println(("ColdDrink Price: ")+(cocacola.cdPrice = 30.5));
		
		cocacola.makingProcess();
		cocacola.makingContainer();
		cocacola.testCheck();
		
	}
}
