package barcelonajava.com.ex;

public class MyMainClass {

	private static String globalVariable = "This is a Global variable";
	
	public static void main(String[] args) {
		String firstName = "Ireneo";
		String middleName = "Magbanua";
		String surName = "Barcelona III";
		String grade = "12";
		int age = 17;
		String section = "Altman";
		boolean legalAge = age > 17;
		long lrn = 136635120943l;
		float height = 1.7f;
		double pi = 3.14159265359d;
		int aNumber;//this is a declaration
		aNumber = 5;//this is a initialization
		int a,b,c;//this is a multiple declaration
		a = 4;
		b = 3;
		c = 2;
		// TODO Auto-generated method stub
		System.out.println(firstName + " " +  middleName + " " + surName);
		System.out.println("I'm " + age + " " + "years old");
		System.out.println("I'm in grade " + grade);
		System.out.println("My section is " + section);
		System.out.println("Am I in legal age? " + legalAge);
		System.out.println("My LRN is " + lrn);
		System.out.println("My height is " + height + " " + "meters");
		System.out.println("Pi is " + pi);
		System.out.println("This is a " + aNumber);
		System.out.println("a is " + a);
		System.out.println("b is " + b);
		System.out.println("c is " + c);
		System.out.println(globalVariable);
		callAge(age);
	}//ito ang closing ng main static void
		static void callAge(int studentAge) {
			int myStudentAge = studentAge;
			System.out.println("student age is " + myStudentAge);
			System.out.println(globalVariable);
		}//closing ng callName
		//System.out.println("B4 L4 Apitong St. Cristina Hms. Cielito Caloocan Cicy");
		//System.out.println("hehe");
		
	}
