import com.student1.Student;
//import com.student.Student;

public class StudentMain {

	public static void main(String[] args) {

		Student std1 = new Student();
		System.out.println(("Student Id: ")+(std1.stdId = 111));
		System.out.println(("Student Name: ")+(std1.stdName = "Raj Shing"));
		System.out.println(("Student City: ")+(std1.stdCity = "Pune"));
		
		std1.display();
		
		com.student.Student std2 = new com.student.Student();
		System.out.println(("Student Id: ")+(std2.stdId = 112));
		System.out.println(("Student Name: ")+(std2.stdName = "Rani Shing"));
		System.out.println(("Student City: ")+(std2.stdCity = "Panjab"));
		
		std2.display();
	}

}
