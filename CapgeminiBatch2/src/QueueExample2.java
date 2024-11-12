import java.util.LinkedList;
import java.util.Queue;

public class QueueExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue= new LinkedList<>();
		//queue is interface therefore we cannot create object of Queue.Therefore we can use LinkedList and ArrayDequeue
		queue.offer("JAVA");
		queue.offer("PYTHON");
		queue.offer("C#");
		String a=queue.peek();
		System.out.println(a);
	

	}

}
