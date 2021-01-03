package Class3;

public class Employee {
	int id;
	String name;
	
	Employee(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public void show() {
		System.out.println(id + " " + name);
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee(101,"Johan");
		Employee e2 = new Employee(102,"Lucky");
		e1.show();
		e2.show();
	}
}
