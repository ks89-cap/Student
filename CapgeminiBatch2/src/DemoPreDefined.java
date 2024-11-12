
public class DemoPreDefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DemoPreDefined demo= new DemoPreDefined();
double random_value= demo.randomValue();
System.out.println(random_value);
	}
	public double randomValue()
	{
		return Math.random()*4.00;
	}

}
