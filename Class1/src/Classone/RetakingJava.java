package Classone;

public class RetakingJava {
	static int max =0;
	public static void main(String[] args) {
		
		// findling common elements in two different arrays
		
		  int[] Arr = {2,4,5,66,71,71,99}; 
		  int[] Arr1 = {2,4,5,32,71,71,90};
		  
		  for(int i =0; i<Arr.length; i++) { 
			  for(int j=0; j<Arr1.length; j++) {
				  if(Arr[i]== (Arr1[j])) {
		  System.out.println(Arr[i]); 
		  }
				  }
			  }
		 
		// finding duplicate element in Array
		/*
		 * int[] Arr = {2,4,5,66,71,71,99}; for(int i =0; i<Arr.length; i++) { for(int
		 * j=i+1; j<Arr.length; j++) { if(Arr[i]== (Arr[j])) {
		 * System.out.println(Arr[i]); } } }
		 */
		// to find the largest number in Array
		/*
		 * int[] Arr = {2,4,5,66,71,1,99};
		 * 
		 * for(int i=0; i<Arr.length; i++) { if(Arr[i]>max) { max = Arr[i];
		 * }System.out.println(max); }
		 */
		
		// write a program in java to display  the multiplication table of a given integer.
		
		/*
		 * int n = 10; int j; for(j=0; j<=n; j++) { System.out.println(n+ " X "+j+ " = "
		 * +n*j); }
		 */

		// write a program in java to display pattern like right angle triangle with a number.
		
		/*
		 * int n = 9; int i,j,s,x; s=n+9-1;
		 * 
		 * for(i=1; i<=n; i++) { for(x=s; x!=0; x--) { System.out.print(" "); }
		 * //System.out.println(i); for(j=1; j<=i; j++) { System.out.print(i+" "); }
		 * System.out.println(); s--; }
		 */
		
		// fizz buzz
		
		/*
		 * int num = 100; for(int i=0; i<=num; i++ ) {
		 * 
		 * if(((i % 5)==0) && ((i%3) == 0)) { System.out.println("Value of num: " +i+
		 * "fizzBuzz"); } else if(i%3==0)// is it multiply of 3? {
		 * System.out.println("Value of num: " +i+ "fizz"); }
		 * 
		 * else if(i%5 ==0) { System.out.println("Value of num: " +i+ "Buzz"); } else
		 * if((i % 2)==0) { System.out.println("Value of num: " +i+ "BuzzBuzz"); } else
		 * System.out.println(i); }
		 */
	}
}












