package barcelonajava.com.ex;

import java.util.Random;
import java.util.Scanner;

    public class SIGMA {

        public static void main(String[] args) {
        	Scanner input = new Scanner(System.in);
            Random rand = new Random();
            int randomNum = rand.nextInt((7 + 1) - 1) + 1;
            String day = null;
            String guess = null;
            boolean correctGuess = false;
            int attempt = 3;
            int money = 100;
            int bet = 0;
            switch (randomNum) {
                case 1:
                    day = "Sunday";
                    break;  
                case 2:
                    day = "Monday";
                    break;  
                case 3:
                    day = "Tuesday";
                    break;  
                case 4:
                    day = "Wednesday";
                    break;  
                case 5:
                    day = "Thursday"; 
                    break;  
                case 6:
                    day = "Friday";
                    break;  
                case 7:
                    day = "Saturday";
                    break;
                default:
                    break;                         
            }
            System.out.println("Guess what is the day today");
            do {
            System.out.println("Choose a day, choose wisely");
            System.out.println("Monday to Sunday");
//            guess = input.nextLine();//huhula ang player
//            System.out.println("How much will you bet?");
//            bet = input.nextInt();//pusta
                if(day.equals(guess)){//panalo
                    System.out.println("WIN WIN WIN $_$");
                    System.out.println("The day is " + day);
                    correctGuess = true;
                }else {//talo
                    if(attempt -->1) {
                    	System.out.println("Nuh uh mali hula XD");
                    	System.out.println("You still have " + attempt + " attempts left L XD");
                    }else {//talo na talaga
                    	System.out.println("Talo HAHAHA skill issue ./.");
                    	
                    }
//					Scanner input = new Scanner(System.in);
//             String guess = null;
//            int randomNum = (int)(Math.random() * 3); //0 to 3    
            }
        }while(!day.equals(guess)); 
    }//closing ng main
}//closing ng class
//System.out.println("");