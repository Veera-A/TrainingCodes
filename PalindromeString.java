package Training;

import java.util.*;

public class PalindromeString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Palindrome \n\n");
		
		System.out.println("Enter the string : ");
		String st = sc.next();
		
		StringBuffer sbStr = new StringBuffer(st);
		
		 String st2 = sbStr.reverse().toString();
		
		 if(st.equalsIgnoreCase(st2))
			 System.out.println(" \n Given String is Palindrome");
		 else
			 System.out.println(" \n Given String is Palindrome");
		 
		 
//		 
//		if(isPalindrome(st))
//			System.out.println(" \n Given String is Palindrome");
//		else
//			System.out.println("\n Given String is not a Palindrome");
//		
		
	}

	static boolean isPalindrome(String st) {
		
		st = st.toLowerCase();
		int f = 0, l = st.length()-1;
				
		while(st.charAt(f++) == st.charAt(l--) && f<=l ) {
		}
		
		return f>l;
		
	}

}
