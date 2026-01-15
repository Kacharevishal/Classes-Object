package oopConcept;

public class StudentMain {

	public static void main(String[] args) {

		Student student1 = new Student();
		
		System.out.println("-----------------------------");
		System.out.println("This is a Student No: 1");
		System.out.println(("Student Name: ")+(student1.stdName = "Vishal"));
		System.out.println(("Student Id: ")+(student1.stdId = 11));
		System.out.println(("Student Age: ")+(student1.stdAge = 22));
		
		student1.stdLearning();
		student1.stdLooking();
		student1.stdWriting();
		
		Student student2 = new Student();
		System.out.println("-----------------------------");
		System.out.println("This is a Student No: 2");
		System.out.println(("Student Name: ")+(student2.stdName = "Raj"));
		System.out.println(("Student Id: ")+(student2.stdId = 12));
		System.out.println(("Student Age: ")+(student2.stdAge = 22));
		
		student2.stdLearning();
		student2.stdLooking();
		student2.stdWriting();
		
		
		Student student3 = new Student();
		System.out.println("-----------------------------");
		System.out.println("This is a Student No: 3");
		System.out.println(("Student Name: ")+(student3.stdName = "Ram"));
		System.out.println(("Student Id: ")+(student3.stdId = 13));
		System.out.println(("Student Age: ")+(student3.stdAge = 23));
		
		student3.stdLearning();
		student3.stdLooking();
		student3.stdWriting();
		
		
		
		
		
		
	}

}
