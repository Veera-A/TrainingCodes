package Training;

import java.util.*;

public class StringCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("String Operation.");
		System.out.println("Enter the String : ");
		
		String st = sc.nextLine();
		
		
		System.out.println("Number of words in string is " + countWords(st) + " \n "
				+ "Number of characters in string is " + countCharacter(st) );
	}

	static int countCharacter(String st) {
		
		char[] ch = st.toLowerCase().toCharArray();
		int count = 0;
		
		for(int i = 0; i < ch.length; i++) {			
			if(ch[i] >= 'a' && ch[i] <= 'z')
				count++;			
		}
		
		return count;
	}
	
	
	static int countWords(String st) {
		
		String[] str = st.trim().split(" ");
		
		return str.length;
		
	}

}
