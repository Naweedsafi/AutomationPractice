package Classone;

public class FizzBuzz {

	public static void main(String[] args) {
		int num = 100;
		for(int i = 0; i<=num; i++) {
			
			if(((i%3)==0) && ((i%5)==0))
				System.out.println("Value of num:"+i+"FizzBuzz");
			else if((i%3)==0)
			System.out.println("Value of num:"+i+"Fizz");
			else if((i % 5)==0)
				System.out.println("Value of num"+i+"Buzz");
			else
				System.out.println(i);
			
		}

	}

}
