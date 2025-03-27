package barcelonajava.com.ex;

import java.util.Scanner;

public class loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String answer = "skibidi";
		String response = null;
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("Password:");
			response = input.next();
		}while (!answer.equals(response)); //may "!" kaya nag end agad imbis na mag loop kapag tama
		
		System.out.println("End of Loop!");

	}
}
