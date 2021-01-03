package Classone;

public class LoopControl {
	public static void main(String[] args) {

		int n = 9;
		int m, o, p, q;

		p = n+9-1;
		for (m = 1; m<= n; m++) 
		{
			for (q = p; q != 0; q--)
			{
				System.out.print(" ");
			}	
			for (o = 1; o <= m; o++)
			{
				System.out.print(o+" ");
			}
				
			System.out.println();
			p--;
	}
}}