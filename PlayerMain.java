package oopConcept;

public class PlayerMain {

	public static void main(String[] args) {

		Player cricketer = new Player();
		System.out.println("------------------------------------");
		System.out.println("This is a Cricket Player Properties");
		System.out.println(("Player No: ")+(cricketer.playNo = 45));
		System.out.println(("Player Name: ")+(cricketer.playName = "Rohit Sharma"));
		System.out.println(("Player Address: ")+(cricketer.playAddress = "Mumbai"));
		
		cricketer.plyPracticeTime();
		cricketer.plyLunchTime();
		cricketer.plyWorkoutTime();
		
		Player football = new Player();
		System.out.println("------------------------------------");
		System.out.println("This is a FootBall Player Properties");
		System.out.println(("Player No: ")+(football.playNo = 11));
		System.out.println(("Player Name: ")+(football.playName = "Sunil Chhetri"));
		System.out.println(("Player Address: ")+(football.playAddress = "Mumbai"));
		
		football.plyPracticeTime();
		football.plyLunchTime();
		football.plyWorkoutTime();
		
		Player Kabaddi = new Player();
		System.out.println("------------------------------------");
		System.out.println("This is a Kabaddi Player Properties");
		System.out.println(("Player No: ")+(Kabaddi.playNo = 8));
		System.out.println(("Player Name: ")+(Kabaddi.playName = "Sidharth Desi"));
		System.out.println(("Player Address: ")+(Kabaddi.playAddress = "Gujarat"));
		
		Kabaddi.plyPracticeTime();
		Kabaddi.plyLunchTime();
		Kabaddi.plyWorkoutTime();
	}

}
