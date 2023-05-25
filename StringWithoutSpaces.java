package Training;

import java.util.*;

public class StringWithoutSpaces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Print String without space character \n");
		System.out.println("Enter the string : ");
		String st = sc.nextLine();
		
		System.out.println("Printing given String without spaces : \n" + StringWithoutSpace(st));
	}

	static String StringWithoutSpace(String st) {
		String[] str = st.trim().split(" ");
		st="";
		
		for(int i=0 ; i<str.length ; i++) {
			st = st + str[i];
		}
		
		return st;
	}

}
