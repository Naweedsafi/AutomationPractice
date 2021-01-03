package Class3;

public class Calculation {
	
	public void sum(int a, int b) {
		System.out.println(a +b);
	}
	
	public void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {
		Calculation obj = new Calculation();
		obj.sum(5, 6);
		obj.sum(4, 5, 3);
	}
}
