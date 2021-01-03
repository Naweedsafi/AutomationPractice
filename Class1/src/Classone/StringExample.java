package Classone;

public class StringExample {

	public static void main(String[] args) {
		String myString = "Hellow Hava!";
		String St2 = "Java is a very beautiful";
		// Comparing two string return true of both match else return false.
		System.out.println(myString.equalsIgnoreCase(St2));
		System.out.println(myString.equals(St2));
		// Concatenates two string
		System.out.println(myString + St2);
		System.out.println(myString.concat(St2));
		// Retrieve the 9th Indexed character from string.
		System.out.println(myString.charAt(5));
		// Find the lenth of String
		System.out.println(myString.length());
		// Converting whole string to lower case
		System.out.println(myString.toLowerCase());
		// Converting whole string to Upper case
		System.out.println(myString.toUpperCase());
		// Retrieve index of first 'i' character
		System.out.println(St2.indexOf('u',2));
		// Retrieve the index of word 'very' from the string
		System.out.println(St2.indexOf("very"));
		// Converting value from Int to string
		int num = 50;
		String valofnum = String.valueOf(num);
		System.out.println(valofnum);
		//Converting integer to string
		String num1 ="99";
		int newnum = Integer.parseInt(num1);
		System.out.println(newnum);
		// Print the String starting from 5th Index to 12th index
		System.out.println(St2.substring(4, 9));
		// Split string
		String splt[] = St2.split("very");
		System.out.println("String Part 1 is -> "+splt[0]);
		System.out.println("String Part 2 is -> "+splt[1]);
		// Trim String
		System.out.println("Trimmed St2 -> "+St2.trim());
		
		
		
	}
}











