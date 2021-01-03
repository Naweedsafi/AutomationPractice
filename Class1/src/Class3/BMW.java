package Class3;

public class BMW implements Demo{
	
	public void run() {
		System.out.println("Run Method");
	}
	
	public void display() {
		System.out.println("Display");
	}
public static void main(String[] args) {
	BMW obj = new BMW();
	obj.run();
	obj.display();
	
}
}
