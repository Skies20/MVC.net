package barcelonajava.com.ex;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSomething();
		System.out.println(myName("Ireneo"));
		System.out.println(myNum(27));
		System.out.println(addTwoNum(4, 7));
		System.out.println(subTwoNum(10, 3));
		System.out.println(mulTwoNum(4, 7));
		System.out.println(divTwoNum(12, 3));
		checkAge("Irene  ", 17);
		
	}
	
	static public void printSomething() { //method header
		System.out.println("Test Method");//method body
		
	}
	
	static String myName(String name) {//method header
		return name;//method body
	}
	
	static int myNum(int num) {//method header
		return num;//method body
	}
	
	static int addTwoNum(int addends1,int addends2) {
		return addends1 + addends2;
	}
	
	static int subTwoNum(int minuend1,int minuend2) {
		return minuend1 - minuend2;
	}
	
	static int mulTwoNum(int factor1,int factor2) {
		return factor1 * factor2;
	}
	
	static int divTwoNum(int dividend1,int dividend2) {
		return dividend1 / dividend2;
	}
	
	static void checkAge(String name, int age) {
		if(age>=18) {
			System.out.println
			(name + "Access granted - waa naa nag lulu naa");
		}else {
			System.out.println
			(name + "Access denied - bawal ka pa mag lulu");
		}
	}
}//closing main method
