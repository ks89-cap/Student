
public class Tester extends Employee {   //for hierarchical inheritance tester extends the employee but not developer, since developer is also child of employee
	public void domain() {
		System.out.println("QA TESTING DOMAIN");
		
	}
	public void empName() {        // this is for overriding
		System.out.println("Andrew");
		super.empName();
	}
	

}
