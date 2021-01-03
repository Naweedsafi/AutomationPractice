package Class3;

import java.util.Iterator;
import java.util.Vector;

public class Vector1 {
	public static void main(String[] args) {
	Vector<String> vct = new Vector<String>();	
	vct.add("FIRST");
	vct.add("SECOND");
	vct.add("THIRD");
	
	vct.add(2, "Random");
	System.out.println(vct.get(3));
	System.out.println(vct.firstElement());
	System.out.println(vct.lastElement());
	System.out.println(vct.isEmpty());
	
	Iterator<String> itr = vct.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	}
}








