package barcelonajava.com.ex;
import java.util.Arrays;
public class arrayList {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		 String[] cars = {"Lambrrgambrr", "BMW", "Ford", "Mazda"};
		 char[] let = {'u', 't', 'f', 'w', 'g'};
		 
		 cars[0] = "Bugutata";

		 for(int i = 0; i < cars.length; i++){
			System.out.println(cars[i]);
		 }
		 System.out.println("apat na cars");
		 
		 let[2]='m';
		 
		 for(int i = 0; i < let.length; i++){
			System.out.println(let[i]);
		 }
		 
		 int myNumbers[]=new int[10];//declaration and instantiation 
		 myNumbers[0]=10;
		 myNumbers[1]=20;
		 myNumbers[2]=30;
		 myNumbers[3]=40;
		 myNumbers[4]=50; 
		 myNumbers[5]=60;
		 myNumbers[6]=70;
		 myNumbers[7]=80;
		 myNumbers[8]=90;
		 myNumbers[9]=100;
		 System.out.println("10 to 100");
		 for(int i=0;i<myNumbers.length;i++) {//ordinary sequence
			System.out.println(myNumbers[i]);
		 }
		 int sumMyNumber = 0;
		 for(int i=0;i<myNumbers.length;i++) {
			 sumMyNumber += myNumbers[i];
		 }
		 
		System.out.println("Sum of all MyNumber is " + sumMyNumber);
		System.out.println("reverse sequence 100 to 10");
		 for(int i =(myNumbers.length-1); i >= 0; i--){//reverse
			System.out.println(myNumbers[i]);
		 }
		 for(int i =(myNumbers.length-1); i >= 5; i--){//reverse
				System.out.println(myNumbers[i]);
		 }
		 
		 System.out.println("Change 80 to 85");
		 for(int i=0; i<myNumbers.length;i++);
//		 	if(myNumbers[i]==80) {
//		 		myNumbers[i]=85;
//		 		System.out.println("80 is change to 85");
//		 	}
		 
		 
		 int randomNum[]=new int[10];//declaration and instantiation 
		 randomNum[0]=61;
		 randomNum[1]=75;
		 randomNum[2]=86;
		 randomNum[3]=06;
		 randomNum[4]=36; 
		 randomNum[5]=56;
		 randomNum[6]=12;
		 randomNum[7]=89;
		 randomNum[8]=35;
		 randomNum[9]=84;
		 Arrays.sort(randomNum);
		 for(int i =(randomNum.length-1); i >= 0; i--){//reverse
			System.out.println(randomNum[i]);
		}
		 System.out.println("arrange cars alpabetically");
		 String[] Cars = {"Lambrrgambrr", "BMW", "Ford", "Mazda"};
		 Arrays.sort(Cars);
		 for(int i = 0; i < Cars.length; i++){
				System.out.println(Cars[i]);
		 
			 }
		 
	}
}
//System.out.println("");