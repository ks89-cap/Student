//EXAMPLE FOR CONSTRUCTOR
public class Constructor_1 {
	//create a constructor
	int id;
	String name;
	public Constructor_1(){  //if we put void along with constructor it wint work
		System.out.println("hello");  //default constructor
		
	}
	public Constructor_1(int id,String name) //parameterized constructor
	{
		this.id=id;
		this.name=name;
	}
	public void display()
	{
		System.out.println("id: "+id+"\n"+"name: "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create the obj of class
		Constructor_1 con= new Constructor_1();    //default constr
		Constructor_1 con1= new Constructor_1(102340,"hari");  //parameterized constr
		con1.display();
		con.display();
		

	
		

	}

}
