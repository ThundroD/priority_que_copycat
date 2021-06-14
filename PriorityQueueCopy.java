package priortyQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;


//Initiate new class
public class PriorityQueueCopy {
	ArrayList<String> listStr = new ArrayList<String>();
	
	//Create method to print alphabetically
	public void printList() {
		//sort alphabetically
		Collections.sort(listStr); 
		//cast the array list to a linked list
		LinkedList<Object> linkedString = new LinkedList<Object>(listStr);
    	//while there is something in the LinkedList, run following code
    	while (linkedString.size() > 0) {
    		//print out the current first in "queue" word
    		System.out.print(linkedString.get(0) + " ");
    		//remove the first item in the linked list
   	 		linkedString.removeFirst();
    	}
    	//print out a new blank line for better readability
    	System.out.println("\n");
	}
	//Create method to print in reverse
	public void revPrintList(){
		Collections.reverse(listStr); //reverse ArrayList
		//cast the array list to a linked list
		LinkedList<Object> linkedString = new LinkedList<Object>(listStr);
		//while there is something in the LinkedList, run following code
		while (linkedString.size() > 0) {
			//print out the current first in "queue" word
			System.out.print(linkedString.get(0) + " ");
			//remove the first item in the linked list
			linkedString.removeFirst();
		}
		//print out a new blank line for better readability
		System.out.println("\n");
	}
		
	public void peekCopy() {
		//get first in ArrayList
		String first = listStr.get(0);
		//print out first in ArrayList
		System.out.println(first);
		//print out a new blank line for better readability
		System.out.println("\n");
		}
	
	public void pollCopy() {
		//print out first in ArrayList
		System.out.println(listStr.get(0));
		//print out a new blank line for better readability
		System.out.println("\n");
		//remove first in ArrayList
		listStr.remove(0);
	}

	public void add(String str) {
		//Add string to array
		listStr.add(str);
		//cast the array list to a linked list
		LinkedList<Object> linkedString = new LinkedList<Object>(listStr);
		//while there is something in the LinkedList, run following code
    	while (linkedString.size() > 0) {
    	//print out the current first in "queue" word
    	System.out.print(linkedString.get(0) + " ");
        //remove the first item in the linked list
   	 	linkedString.removeFirst();
    	}
    	//print out a new blank line for better readability
    	System.out.println("\n");
	}
	
	public void remove(String string) {
		//remove string in array
		listStr.remove(string);
		//cast the array list to a linked list
		LinkedList<Object> linkedString = new LinkedList<Object>(listStr);
    	//while there is something in the LinkedList, run following code
    	while (linkedString.size() > 0) {
    	//print out the current first in "queue" word
    	System.out.print(linkedString.get(0) + " ");
        //remove the first item in the linked list
   	 	linkedString.removeFirst();
    	}
    	//print out a new blank line for better readability
    	System.out.println("\n");
	}


}
