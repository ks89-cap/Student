
public class StaticImplementation {
	static int i=0;   //static - declaration and initilaization of variable
	int j=0;
	
	StaticImplementation()
	{
		i++;
		j++;
		System.out.println("increment of i:" +i);
		System.out.println("increment of j: "+j);
	}

}
