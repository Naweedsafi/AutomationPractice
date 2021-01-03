package Classone;

public class ArrayDemo {
	public static void main(String[] args) {
		int array[] = { 5, 6, 8, 9, 10 };
		int arr[] = new int[5];
		arr[0] = 10;
		arr[1] = 10;
		arr[2] = 10;
		arr[3] = 10;
		arr[4] = 10;
		// System.out.println(array.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		String color[] = {"red","yellow","blue","green"};
		for(int j =0; j<color.length; j++) {
			System.out.println(color[j]);
			}
		// Write a program calculate sum of the array
		int sumofnum[] = {2,5,7,9,4,3};
		int sum =0;
		for(int q =0; q<sumofnum.length; q++) {
			sum =sum + sumofnum[q];
		}
		System.out.println(sum);
		// Write a program calculate average f array
		
		int numbers[] = {2,5,4,5,6,7,4};
		int add =0;
		for(int b =0; b<numbers.length; b++) {
			add =add + numbers[b];
		}
		double avg = add/numbers.length;
		System.out.println(avg);
	}
	
}
