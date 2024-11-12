
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * create an object of child class- developer
		 */
		
		/*Developer dev= new Developer();
		System.out.println("acquired pptys from parent class");
		dev.empId();
		dev.empName();
		dev.empCity();
		System.out.println("============================");
		
		System.out.println("acquired pptys from child class");

		dev.desig();
		dev.salary(); */
		
		/*Tester test= new Tester();
		System.out.println("acquire pptys from parent class");
		test.empId();
		test.empName();
		test.empCity();
		System.out.println("acquire pptys from Developer class");
		test.desig();
		test.salary();
		System.out.println("acquire pptys from Tester class");
		test.domain();
		*/
		

//calls tester and developer and employee class.
		
/*Tester test= new Tester();
test.empId();
test.empCity();
test.domain();*/
		
		
		//Runtime Polymorphism---- Method overriding
		
		/*Developer dev= new Developer();
		dev.empName(); // employee class has been override by developer class
		System.out.println("========================");
		Tester test= new Tester();
		test.empName(); // employee class has been override by tester class
*/
		
		//POLYMORPHISM REFERNCE
		/*Employee[]emp= new Employee[2];
		emp[0]= new Tester();
		emp[1]= new Developer();
		for(int i=0; i<emp.length;i++)
		{
			emp[i].empName();
		}*/
		Developer dv= new Developer();
		dv.empName();
		dv.dusplay();
		System.out.println("===============");
		Tester tes= new Tester();
		tes.empName();
	}

}
