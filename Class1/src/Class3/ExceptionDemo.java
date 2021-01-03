package Class3;

public class ExceptionDemo {
public static void main(String[] args) {
	try {
		int arr[] = {1,2};
		arr[2]= 3/1;
		
}catch(ArithmeticException ae) {
	System.out.println("divided by zero ");
}catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("array index out of bound exception");
}
}}