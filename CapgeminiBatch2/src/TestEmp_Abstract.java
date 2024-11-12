
public class TestEmp_Abstract {

	public static void main(String[] args) {
		Developer_Abstract da= new Developer_Abstract();
		int salary= da.empSalary();
		System.out.println("salary is:"+salary);
		System.out.println("============================"); 
		Tester_Abstract ta= new Tester_Abstract();
		String details = ta.empDetails();
		System.out.println("Emp details is:"+details);

		
		// calling TESTER_ABSTRACT AND DEVELOPER_ABSTRACT

		// TODO Auto-generated method stub

	}

}
