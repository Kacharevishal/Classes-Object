package oopConcept;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee employee1 = new Employee();
		System.out.println("--------------------------------------------------------");
		System.out.println("This is a Employee No: 1");
		System.out.println(("Employee Id: ")+(employee1.empId= 01));
		System.out.println(("Employee Name: ")+(employee1.empName = "Raju"));
		System.out.println(("Employee Address: ")+(employee1.empAddress = "Pune"));
		
		employee1.employeeMeeting();
		employee1.employeeSprint();
		employee1.employeeWorking();
		
		Employee employee2 = new Employee();
		System.out.println("--------------------------------------------------------");
		System.out.println("This is a Employee No: 2");
		System.out.println(("Employee Id: ")+(employee2.empId= 02));
		System.out.println(("Employee Name: ")+(employee2.empName = "Radha"));
		System.out.println(("Employee Address: ")+(employee2.empAddress = "Banglor"));
		
		employee2.employeeMeeting();
		employee2.employeeSprint();
		employee2.employeeWorking();
		
		Employee employee3 = new Employee();
		System.out.println("--------------------------------------------------------");
		System.out.println("This is a Employee No: 3");
		System.out.println(("Employee Id: ")+(employee3.empId= 03));
		System.out.println(("Employee Name: ")+(employee3.empName = "Aman"));
		System.out.println(("Employee Address: ")+(employee3.empAddress = "Hydrabad"));
		
		employee3.employeeMeeting();
		employee3.employeeSprint();
		employee3.employeeWorking();
	}

}
