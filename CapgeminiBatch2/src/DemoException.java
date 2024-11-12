
public class DemoException {
int age;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int i=10;
		int j=0;
		try {
		int k=i/j;
		System.out.println(k);

	}
	catch(ArithmeticException e)
	{
		System.out.println("exception handled");

	}
		finally
		{
			System.out.println("finnally always");
		}*/
}
	DemoException demo= new DemoException();
	demo.getAge(19);

	public void getAge(int age)throws Exception {
		if(age<18)
		{
			throw new Exception("age less than 18");
		}
		else {
			System.out.println("age is more than 18");

		}
}
}
	

