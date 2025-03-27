package barcelonajava.com.ex;

import java.util.Scanner;

public class myJavaOperators {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int addend1 , addend2 , sum1;
		System.out.println("This is addition");
		System.out.println("Type the first addends");
		addend1 = input.nextInt();
		System.out.println("Type the second addends");
		addend2 = input.nextInt();
		System.out.println("The sum of " + addend1 + " and " + addend2);
		sum1 = addend1 + addend2;
		System.out.println("is " + sum1);
		
		System.out.println(" ");
		
		int subend1 , subend2 , sub2;
		System.out.println("This is subtraction");
		System.out.println("Type the first subtrahend");
		subend1 = input.nextInt();
		System.out.println("Type the second subtrahend");
		subend2 = input.nextInt();
		System.out.println("The subtrahend of " + subend1 + " and " + subend2);
		sub2 = subend1 - subend2;
		System.out.println("is " + sub2);
		
		System.out.println(" ");
		
		int multiend1 , multiend2 , multiplier;
		System.out.println("This is multiplicant");
		System.out.println("Type the first multiplicant");
		multiend1 = input.nextInt();
		System.out.println("Type the second multiplicant");
		multiend2 = input.nextInt();
		System.out.println("The multiplicant of " + multiend1 + " and " + multiend2);
		multiplier = multiend1 * multiend2;
		System.out.println("is " + multiplier);
		
		System.out.println(" ");
		
		int divend1 , divend2 , quotient;
		System.out.println("This is quotient");
		System.out.println("Type the first divident");
		divend1 = input.nextInt();
		System.out.println("Type the seconnd divident");
		divend2 = input.nextInt();
		System.out.println("The divident of " + divend1 + " and " + divend2);
		quotient = divend1 / divend2;
		System.out.println("is " + quotient);
		
	}

}
