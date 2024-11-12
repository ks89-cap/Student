import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue= new ArrayDeque<>();
		//queue is interface therefore we cannot create object of Queue.Therefore we can use LinkedList and ArrayDequeue
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		
		

	}

}
