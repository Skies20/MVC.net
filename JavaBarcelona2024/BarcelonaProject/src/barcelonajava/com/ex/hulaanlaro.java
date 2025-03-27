package barcelonajava.com.ex;

import java.util.Random;
import java.util.Scanner;

public class hulaanlaro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int randomNum = rand.nextInt((9 + 1) - 1) + 1;
        String sus = null;
        String guess = null;
        boolean correctGuess = false;
        int attempt = 5;
        switch (randomNum) {
            case 1:
                sus = "Red";
                break;  
            case 2:
            	sus = "Cyan";
                break;  
            case 3:
            	sus = "Green";
                break;  
            case 4:
            	sus = "Yellow";
                break;  
            case 5:
            	sus = "Black"; 
                break;  
            case 6:
            	sus = "White";
                break;  
            case 7:
            	sus = "Purple";
                break;
            case 8:
            	sus = "Brown";
                break;
            case 9:
            	sus = "Pink";
                break;
            default:
                break;                         
        }
        System.out.println("There is 1 impostor among us");
        do {
        System.out.println("Eject the sus");
        System.out.println("Cyan, Brown, White, Black, Yellow, Purple, Green, Pink, or Red");
        guess = input.nextLine();//huhula ang player
            if(sus.equals(guess)){//panalo
                System.out.println("WELL DONE!");
                System.out.println(sus + " is the impostor");
                correctGuess = true;
            }else {//talo
                if(attempt -->1) {
                	System.out.println("You ejected an innocent!");
                	System.out.println("You still have " + attempt + " attempts left!");
                }else {//talo na talaga
                	System.out.println("Impostor win, we lost because of you.");
                	System.out.println(sus + " is the impostor");
                	
                }
        // Scanner input = new Scanner(System.in);
        // String guess = null;
        //int randomNum = (int)(Math.random() * 3); //0 to 3    
        }
    }while(attempt>0 && !correctGuess);
	}

}
