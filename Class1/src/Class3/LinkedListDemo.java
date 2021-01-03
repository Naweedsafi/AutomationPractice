package Class3;

import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {	
	LinkedList<String> linkedlist = new LinkedList();
	linkedlist.add("F");
	linkedlist.add("G");
	linkedlist.add("B");
	linkedlist.add("R");
	linkedlist.add("S");
	linkedlist.add("E");
	linkedlist.add("T");
	linkedlist.addLast("Z");
	linkedlist.addFirst("A");
	linkedlist.add(0, "A2");
	System.out.println("Original content of linkedlist "+ linkedlist);
	
	linkedlist.remove("F");
	linkedlist.remove(4);
	System.out.println("content of linkedlist after remove  "+ linkedlist);
	linkedlist.removeFirst();
	linkedlist.removeLast();
	System.out.println("content of linkedlist after remove  "+ linkedlist);
	
	Object val = linkedlist.get(2);
	linkedlist.set(2, (String)val);

	}
}







