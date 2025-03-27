public class guessTheDay {

    public class guessTheDay {

        public static void main(String[] args) {
            Random rand = new Random();
            int randomNum = rand.nextInt((7 + 1) - 1) + 1;
            String day = null;
            String guess = null;
            switch (randomNum) {
                case 1:
                    day = "Sunday"
                    break;  
                case 2:
                    day = "Monday"
                    break;  
                case 3:
                    day = "Tuesday"
                    break;  
                case 4:
                    day = "Wednesday"
                    break;  
                case 5:
                    day = "Thursday"
                    break;  
                case 6:
                    day = "Friday"
                    break;  
                case 7:
                    day = "Saturday"
                    break;
                default:
                    break;                         
            }
            System.out.println("Guess what is the day today");
            System.out.println("Choose a day, choose wisely");
            System.out.println("Monday to Sunday");
            guess = input.nextLine();//huhula ang player
                if(day.equals(guess)){
                    System.out.println("WIN WIN WIN")
                    System.out.println("The day is " + day)
                }else
                    System.out.println("NUH UH LOSER")
                    System.out.println("The correct day is " + day)
            System.out.println("")
            // Scanner input = new Scanner(System.in);
            // String guess = null;
            //int randomNum = (int)(Math.random() * 3); //0 to 3
            System.out.println(day);

        }
    }//closing ng main
}//closing ng class
//System.out.println("")