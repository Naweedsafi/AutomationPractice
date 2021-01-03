package Class3;

import java.util.HashSet;

public class HashsetDemo {
	
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		HashSet<String> set1 = new HashSet<String>();
		set.add("Green");
		set.add("Red");
		set.add("Blue");
		set.add("Red");
		
		set1.add("White");
		set1.add("Black");
		
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		set1.addAll(set);
		System.out.println(set1);
		
		for(String s : set1) {
			System.out.println(s);
		}
	}
	

}
