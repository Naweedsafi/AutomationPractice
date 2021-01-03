package Classone;

public class TwoDimensionArray {
	
	public static void main(String[] args) {
		String str[][] = new String[3][2];
		str[0][0] = "user_1";
		str[1][0] = "user_2";
		str[2][0] = "user_3";
		str[0][1] = "pwd_1";
		str[1][1] = "pwd_2";
		str[2][1] = "pwd_3";
		//System.out.println(str[1][0]);
		
		for(int i =0; i<str.length; i++) {
			for(int j =0; j<str[i].length; j++) {
				System.out.println(str[i][j]);
			}	
		}	
	}
}
