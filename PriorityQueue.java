package priortyQueue;

public class PriorityQueue {

	public static void main(String[] args) {
		//create new object
		PriorityQueueCopy states = new PriorityQueueCopy();
		System.out.println("Let's add some states: ");
		//use methods on new object to replicate Priority Queue
		states.add("Ohio");
		states.add("Kentucky");
		states.add("Illinois");
		states.add("Michigan");
		states.add("Indiana");
		states.add("Wisconsin");
		System.out.println("Let's remove Ohio");
		states.remove("Ohio");
		System.out.println("Let's sort the states alphabetically: ");
		states.printList();
		System.out.println("Let's sort them in reverse alphabetical order: ");
		states.revPrintList();
		System.out.println("Let's see what is at the front: ");
		states.peekCopy();
		System.out.println("Let's see what is at the front again after seeing it we'll remove it this time: ");
		states.pollCopy();
		System.out.println("Let's print our list again to see if we've successfully removed the front item: ");
		states.revPrintList();
        
	}

}
