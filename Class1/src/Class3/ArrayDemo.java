package Class3;

public class ArrayDemo {
	// This method takes parameter and calculate the area of circle.
	public void calculateAreaofCircle(double raduis) {
		double area = Math.PI*(raduis*raduis);
		System.out.println(area);
	}
	// This method calculate area of traingle
	public void calcuateAreaofTraingle(double base, double height) {
		double area = (base*height)/2;
		System.out.println(area);
	}
	public static void main(String[] args) {
		ArrayDemo obj = new ArrayDemo();
		obj.calculateAreaofCircle(3.6);
		obj.calcuateAreaofTraingle(3.6, 5.5);
	}
}
