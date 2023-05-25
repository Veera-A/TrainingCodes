package Training;

import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Factorial Operation");
		System.out.println("Enter nuber to perform factorial : ");
		int in = sc.nextInt();
		
		factorialOfNumber(in);
	}

	static void factorialOfNumber(int in) {
		
		int fact =1;
		
		for(int i = 2 ; i <= in ; i++) {
			fact *= i;
		}
		
		System.out.println(fact);
	}

}
