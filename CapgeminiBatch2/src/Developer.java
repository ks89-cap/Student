
public class Developer extends Employee{
	public void desig() {
		System.out.println("developer");
		
	}
	public void salary() {
		System.out.println("80000");
	}
	public void empName() {
		System.out.println("Peter");
		super.empName();
	}
	public void dusplay()
	{
		System.out.println(super.id);
		System.out.println(super.name);//variable level
	}
	//create TestEmployee class

}
