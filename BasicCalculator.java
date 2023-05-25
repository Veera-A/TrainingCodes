package Training;

import java.util.*;

public class BasicCalculator {
	static {
		System.out.println("Calculator.");
	}

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Perform the following operation \n "
					+ "1.Addition \n "
					+ "2.Subtraction \n "
					+ "3.Multiplication \n "
					+ "4.Division \n "
					+ "Press any option to start operations"
					+ "Press 0 to exit.");

			int option = sc.nextInt();

			try {

				switch(option) {
				    case 0:{}break;

					case 1:{
	
						System.out.println("Enter the number");
						int n1 = sc.nextInt();
						int n2 = sc.nextInt();
						System.out.println("Sum of given number is " + (n1+n2));
						System.out.println(" \n \n ");
						Thread.sleep(1000);
					}break;
	
					case 2:{
	
						System.out.println("Enter the number");
						int n1 = sc.nextInt();
						int n2 = sc.nextInt();
						System.out.println("Difference of given number is " + (n1-n2));
						System.out.println(" \n \n ");
						Thread.sleep(1000);
					}break;
	
					case 3:{
	
						System.out.println("Enter the number");
						int n1 = sc.nextInt();
						int n2 = sc.nextInt();
						System.out.println("Multiplication of given number is " + (n1*n2));
						System.out.println(" \n \n ");
						Thread.sleep(1000);
					}break;
	
					case 4:{
	
						System.out.println("Enter the number");
						int n1 = sc.nextInt();
						int n2 = sc.nextInt();
						System.out.println("Multiplication of given number is " + (n1/n2));
						System.out.println(" \n \n ");
						Thread.sleep(1000);
					}break;
	
					default :{
						throw new CustomExceptionCalc("Press valid option.");
					}


				}
			}
			catch(CustomExceptionCalc e) {
				System.out.println(e.getMessage());
			}
			catch(Exception e) {
				e.printStackTrace();
			}

		}while(true);
	}
}
