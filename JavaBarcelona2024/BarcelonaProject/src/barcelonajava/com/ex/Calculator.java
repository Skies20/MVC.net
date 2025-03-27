package barcelonajava.com.ex;

import java.util.Scanner;
import java.util.Random;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr = new Scanner (System.in);
		
		System.out.println("Hello user! What is your name?");
		String myName = sr.nextLine();
		
		System.out.println("Welcome, " + myName + "!");
		System.out.println("What operation would you like to use?");
		System.out.println("Press");
		System.out.println("1 to add");
		System.out.println("2 to subtract");
		System.out.println("3 to multiple");
		System.out.println("4 to divide");
		int operation = sr.nextInt();
		
		
		
	}

}
//System.out.println("");