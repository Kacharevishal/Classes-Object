package oopConcept;

public class AnimalMain {

	public static void main(String[] args) {

		Animal dog = new Animal();
		System.out.println("---------------------------------");
		System.out.println("This is a Dog Class...");
		
		System.out.println(("Dog Name: ")+(dog.animName = "Tommy"));
		System.out.println(("Dog Age: ")+(dog.animAge = 21));
		System.out.println(("Dog Color: ")+(dog.animColor ="Brown"));
		System.out.println(("Dog Height: ")+(dog.animHeight = 30));
		
		dog.animalEating();
		dog.animalRunning();;
		dog.animalSleeping();
		
		Animal elephant = new Animal();
		System.out.println("---------------------------------");
		System.out.println("This is a Elephant Class...");
		
		System.out.println(("Elephant Name: ")+(elephant.animName = "Boss"));
		System.out.println(("Elephant Age: ")+(elephant.animAge = 40));
		System.out.println(("Elephant Color: ")+(elephant.animColor ="Black"));
		System.out.println(("Elephant Height: ")+(elephant.animHeight = 250));
		
		elephant.animalEating();
		elephant.animalRunning();
		elephant.animalSleeping();
		
		Animal camel = new Animal();
		System.out.println("---------------------------------");
		System.out.println("This is a Camel Class...");
		
		System.out.println(("Camel Name: ")+(camel.animName = "Rock"));
		System.out.println(("Camel Age: ")+(camel.animAge = 50));
		System.out.println(("Camel Color: ")+(camel.animColor ="Yellow"));
		System.out.println(("Camel Height: ")+(camel.animHeight = 200));
		
		camel.animalEating();
		camel.animalRunning();
		camel.animalSleeping();
	}

}
