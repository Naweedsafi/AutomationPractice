package Classone;

public class Cat {
	String Name;
	int age;

	public Cat(String name) {
		this.Name = name;
		System.out.println(name);
	}

	public Cat(int age) {
		this.age = age;
		System.out.println(age);
	}

	public Cat(String name, int age) {
		this.Name = name;
		this.age = age;
		System.out.println(name);
		System.out.println(age);
	}

	public void jump() {
		System.out.println("jump....");
	}

	public static void main(String[] args) {
		Cat obj = new Cat("Cat");
		obj.jump();
		
	
	}
}
