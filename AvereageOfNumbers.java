package Training;

import java.util.Scanner;

public class AvereageOfNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number count ");
		int n= sc.nextInt();
		
		int[] avg = new int[n];
		
		
		System.out.println("Enter " +n+ " inputs");
		for(int i=0 ; i< avg.length ; i++) {
			
			avg[i] = sc.nextInt()	;
		}
		
		System.out.println("\n Average of given inputs is : "+averageOfNumbers(avg, n));
		
	}

	static double averageOfNumbers(int[] avg, int n) {
		
		int sum=0; 
		double avrg = 0.0;
		for(int i=0; i<avg.length ; i++) {
			
			sum += avg[i];
		}
		
		avrg = sum/n;
		
		
		return avrg;
			
	}

}
