package Class3;

import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args) {
		 ArrayList names = new ArrayList();
		 names.add("ABC");
		 names.add(1);
		 
		 String name = (String) names.get(0);
		 System.out.println(name);
	}

}
