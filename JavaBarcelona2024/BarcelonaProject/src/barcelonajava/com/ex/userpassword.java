package barcelonajava.com.ex;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class userpassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner scanner = new Scanner(System.in)) {
			List<String> validUsernames = new ArrayList<>();
			validUsernames.add("Player 1");
			validUsernames.add("Player 2");
			List<String> validPasswords = new ArrayList<>();
			validPasswords.add("Password 1");
			validPasswords.add("Password 2");
			
			System.out.print("Welcome, Adventurer! Please enter your username: ");
			String enteredUsername = scanner.nextLine();
			
			if (validUsernames.contains(enteredUsername)) {
				System.out.print("Please enter your password: ");
				String enteredPasswords = scanner.nextLine();
				
				if (validPasswords.get(validUsernames.indexOf(enteredUsername)).equals(enteredPasswords)) {
					System.out.println("Login successful"); }
				 else {
					System.out.println("Incorrect password");
				}
			}else {
				System.out.println("Incorrect username");
			}
		}
	}
}
//System.out.println("");
