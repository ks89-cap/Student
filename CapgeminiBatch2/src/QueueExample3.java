import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class QueueExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Object> queue= new ArrayDeque<>(List.of("PYTHON","RUBY","C#"));
		Queue<Object> queue1= new ArrayDeque<>(List.of("PYTHON","RUBY","C#","JAVA"));
		boolean a= queue.equals(queue1);
		System.out.println(a);
		if(a==false)
		{
			System.out.println("it is not equal");
			
		}
		else
		{
			System.out.println("it is equal");
		}
	}

}
