package queue1;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueueDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue=new PriorityQueue();
		queue.offer("Job1");
		queue.offer("Job2");
		queue.offer("Job3");
		System.out.println(queue.peek());
		System.out.println("*****");
		//peek and remove the head element for queue
		System.out.println(queue.poll());
		System.out.println("******");
		//after removing i am peeking object from queue
		String s = queue.peek();
		System.out.println(s);
		System.out.println("******");
		for(String str:queue) {
			System.out.println(str);
		}


	}

}
