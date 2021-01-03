package Class3;

import java.util.Iterator;
import java.util.TreeSet;
//sorted order
public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("33");
		ts.add("44");
		ts.add("22");
		ts.add("55");
		
		Iterator<String> itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
