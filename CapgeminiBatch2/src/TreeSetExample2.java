import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class TreeSetExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts= new TreeSet<>();
		ts.add("Selenium");
		ts.add("Java");
		ts.add("Python");
	List<Object> ls= new ArrayList<>(ts);
	Collections.reverseOrder();
	System.out.println(ls);
	System.out.println(ts.last());
	System.out.println(ts.first());

	}
	

}
