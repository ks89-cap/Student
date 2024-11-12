import java.util.LinkedList;
import java.util.Queue;

public class QueueExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue= new LinkedList<>();
		//queue is interface therefore we cannot create object of Queue.Therefore we can use LinkedList and ArrayDequeue
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		
		System.out.println("print the front element of the queue: "+ queue.peek());
		while(!queue.isEmpty())
		{
			System.out.println("removed in tfrom queue is: "+queue.poll());
		}
		System.out.println(queue+"is empty");

		
	}

}
