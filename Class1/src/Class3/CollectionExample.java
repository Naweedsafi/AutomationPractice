package Class3;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionExample {
	public static void main(String[] args) {
	Student1 s1 = new Student1(101,"Mina",19);
	Student1 s2 = new Student1(102,"Naweed",17);
	Student1 s3 = new Student1(103,"Nasrat",20);
	
	ArrayList<Student1> studentlist = new ArrayList<Student1>();
	studentlist.add(s1);
	studentlist.add(s2);
	studentlist.add(s3);
	
	Iterator itr = studentlist.iterator();
	while(itr.hasNext()) {
		Student1 st = (Student1) itr.next();
		System.out.println(st.stID + " " + st.stName + " " + st.stAge);
	}
	for(Student1 st: studentlist) {
		System.out.println(st.stID + " " + st.stName + " " + st.stAge);
	}

}
}