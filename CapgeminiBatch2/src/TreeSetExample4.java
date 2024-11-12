import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class TreeSetExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts= new TreeSet<>();
		ts.add(100);
		ts.add(50);
		ts.add(75);
		ts.add(80);
		ts.add(30);
		ts.add(40);
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println("=============================");
		List<Integer> ls= new ArrayList<>(ts);
		System.out.println(ls.get(0));
		System.out.println(ls.get(1));
		System.out.println(ts.);


	}

}
