package Class3;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Toyota");
		list.add("BMW");
		list.add("Honda");
		list.add("Acura");
		System.out.println(list);
		
		list.remove(0);
		System.out.println(list);
		
		list.set(1, "Luxes");
		System.out.println(list);
		System.out.println(list.indexOf("Acura"));
		
		ArrayList<String> list_1 = new ArrayList<String>();
		list_1.add("Cooper");
		list_1.add("Lambo");
		
		list.addAll(list_1);
		System.out.println(list);
		list.removeAll(list_1);
		System.out.println(list);
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		for(String obj:list) {
			System.out.println(obj);
		}
		
	}

}
