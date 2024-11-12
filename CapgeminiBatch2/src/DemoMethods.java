
public class DemoMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CREATE AN OBJECT FOR THE CLASS
		DemoMethods methods= new DemoMethods();
		//Call a method
		// refernce_variable.name_method()
		methods.getName();
		//System.out.println(methods.location());
		String current_loc=methods.location();
		System.out.println(current_loc);
		System.out.println("--------------------");
		System.out.println(methods.getId());
		System.out.println("========================");
		boolean is_disp=methods.status();
		System.out.println(is_disp);
	}
	//adding public along with void is not mandatory
	void getName() {
		System.out.println("CAPGEMINI TRAINING FOR TETSING SESSIONS");
	}
	public String location() //access_modifier return data_type method_name()
	{
		return "location is Bangalore";
	}
	public int getId()
	{
		return 10;
	}
	public boolean status() {
		return true;
	}
	

}
