package Class3;

public class Child extends Parent {
	public void Child_method() {
		System.out.println("Child Method");
	}
	public static void main(String[] args) {
		Child obj = new Child();
		Parent obj1 = new Parent();
		obj.parent_method();
		obj.Child_method();
		obj1.parent_method();
		
	}
}
