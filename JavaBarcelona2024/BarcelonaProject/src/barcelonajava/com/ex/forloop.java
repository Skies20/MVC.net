package barcelonajava.com.ex;

import java.util.Scanner;

public class forloop {
  
    public static void main(String[] args) {
    	
//99-76    	
        for(int i = 9; i > 6; --i) {
            for(int j = 9; j > 5; --j) {
            System.out.print(i);
            System.out.println(j);
            }//closing a nested for loop
        }//closing a main for loop
        
//pyramid low to high        
        
        for(int i = 1; i < 9; ++i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }//closing a nested for loop
            System.out.println();
        }//closing a main for loop
        
//pyramid high to low        
        
        for(int i = 8; i > 1; --i) {
            for(int j = 1; j < i; ++j) {
                System.out.print("* ");
            }//closing a nested for loop
            System.out.println();
        }//closing a main for loop
        
        
//multiplication       
     for(int a = 0; a <= 10; a++) {//first line
    	 System.out.print(a + "\t");
     }
     System.out.println();
     for(int b = 1; b <= 10; b++) {
    	 System.out.print(b + "\t");
    	 for(int x = 1; x <= 10; x++) {
    		 System.out.print(x*b + "\t");
    	 }System.out.println();
     }

//xmas tree
    
     int z = 10;
     for(int i = 1; i < z; i++) {
    	 for(int j = i; j<z; j++)
    	 System.out.print(" ");
    	 for(int b = 1; b <= (2*i - 1);b++) {
    		 if(b % 2 == 0) {
    			 System.out.print("o");
    		 }else {
    			 System.out.print("*");
    		 }
    	 } System.out.println();
     }
     System.out.println(" 	|||");
     System.out.println(" ('')	|||    ('')");
     System.out.print(" __________________");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
  }
}
