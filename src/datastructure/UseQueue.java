package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> queue = new LinkedList<String>();
		queue.add("Italy");
		queue.add("France");
		queue.add("Albania");
		queue.add("Germany");
		queue.add("Spain");

		System.out.println("Current List: ");
		System.out.println(queue.peek());
		System.out.println(queue.element());
		System.out.println(queue.poll());


		Iterator<String> state = queue.iterator();
		while (state.hasNext()) {
			System.out.println(state.next());

		}

		queue.remove();
		System.out.println("Updated List: ");
		for (String st: queue) {
			System.out.println(st);

		}
	}

}
