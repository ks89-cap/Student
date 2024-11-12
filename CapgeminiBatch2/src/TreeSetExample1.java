import java.util.TreeSet;

public class TreeSetExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts= new TreeSet<>();
		ts.add(0);
		ts.add(1);
		ts.add(3);
		
		System.out.println(ts);
		ts.remove(3);
		System.out.println("after removal"+ts);
		System.out.println("=============================");

		boolean a=ts.contains(4);
		System.out.println(a);
		System.out.println("=============================");

		//FIRST ELEMENT
		Integer a1=ts.first();
		System.out.println(a1);
		System.out.println("=============================");

		//LAST ELEMENT
		Integer B1=ts.last();
		System.out.println(B1);
		System.out.println("=============================");

		//ITERATE
		for(int da:ts)
		{
			System.out.println(da);
		}
		


	}

}
