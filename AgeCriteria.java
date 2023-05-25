package Training;

import java.util.Scanner;

public class AgeCriteria {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter age : ");
		
		int age = sc.nextInt();
		
		try {
			if(age <= 28)
				System.out.println("Eligible for Exam");
			else {
				throw new NewCustomException("Age is above the bar");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
