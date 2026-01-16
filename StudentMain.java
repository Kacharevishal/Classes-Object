package practice16;

public class StudentMain {

	public static void main(String[] args) {

		Student std1 = new Student();  
		System.out.println("------------------------------------");
		System.out.println("This is a Student No: 1");
		
		System.out.println(("Student Id: ")+(std1.stdId = 1));
		System.out.println(("Student Name: ")+(std1.stdName = "Ram"));
		System.out.println(("Student Div: ")+(std1.stdDiv = 'A'));
		System.out.println(("Student City: ")+(std1.stdCity = "Pune"));
		System.out.println(("Student Fees: ")+(std1.stdFees = 20000));
		
		std1.stdSchoolTime();
		std1.stdLunchTime();
		std1.stdPlayingTime();
		
		Student std2 = new Student();  
		System.out.println("------------------------------------");
		System.out.println("This is a Student No: 2");
		
		System.out.println(("Student Id: ")+(std2.stdId = 2));
		System.out.println(("Student Name: ")+(std2.stdName = "Raj"));
		System.out.println(("Student Div: ")+(std2.stdDiv = 'A'));
		System.out.println(("Student City: ")+(std2.stdCity = "Nashik"));
		System.out.println(("Student Fees: ")+(std2.stdFees = 30000));
		
		std2.stdSchoolTime();
		std2.stdLunchTime();
		std2.stdPlayingTime();
		
		Student std3 = new Student();  
		System.out.println("------------------------------------");
		System.out.println("This is a Student No: 1");
		
		System.out.println(("Student Id: ")+(std3.stdId = 1));
		System.out.println(("Student Name: ")+(std3.stdName = "Sham"));
		System.out.println(("Student Div: ")+(std3.stdDiv = 'B'));
		System.out.println(("Student City: ")+(std3.stdCity = "Satara"));
		System.out.println(("Student Fees: ")+(std3.stdFees = 40000));
		
		std3.stdSchoolTime();
		std3.stdLunchTime();
		std3.stdPlayingTime();
		
		
		
	}

}
