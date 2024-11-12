
public class Sessions_Constr {
	
	int eid;
	String ename;
	static String comp_name="Cpagemini";
	public Sessions_Constr(int id, String name)
	{
		this.eid=id;
		this.ename=name;
	}
		
		public void display()
		{
			System.out.println("employee id:: "+eid);
			System.out.println("employee name::"+ename);

		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sessions_Constr ss= new Sessions_Constr(101,"amal");
		ss.display();
		ss.getid();//nonstatic
		getUserName(); //warning becs of static method.THEREFORE NEVER USE SS TO CALL STATIC METHOD.

	}
	public static void getUserName()
	{
		System.out.println("john");
		getEmailId();  // u can directly call the static method inside another static method without creating obj of class.
	}
	public void getid() {
		System.out.println("id:: 12345");
		getUserId(); // u can call nonstatic method inside a non static  method
	}
	public static void getEmailId()
	{
		System.out.println("email:: john@gmail.com");
	}
	public void getUserId() {
		System.out.println("user id:: ab01");
	}


}
