import java.util.TreeSet;

public class TreeSetExample3 {
	public static void main(String[] args) {
		TreeSet<Integer> ts= new TreeSet<>();
		ts.add(1);
		ts.add(2);
		ts.add(3);
		ts.add(4);
		ts.add(5);
		ts.add(7);
		System.out.println(ts);
		System.out.println("print all those numbers:"+"");
		for(Integer a:ts)
		{
			if(a<7)
			{
				
				System.out.println(a);
			}
		}
	}
}
