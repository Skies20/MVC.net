package barcelonajava.com.ex;

public class modulusIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("This is the use of Modulus\n"
//			+"that uses % and return the remainder");
//		int a = 17; int b = 7;
//		System.out.println("The remainder of "
//		+ a + "/" + b + " is " + a%b);
//		System.out.println("");
//		System.out.println("This is a sample of increment.");
//		System.out.println("The initial value of x is 1");
//		System.out.println("When increment applies x++");
//		int x = 1;
//		System.out.println("The value of x is not yet increase\n"
//				+ "x = " + x++ + " but on the next use, its value\n"
//				+ " increases as such. x is now " + x);
//		System.out.println("");
//		System.out.println("This is a sample of increment after the variable.");
//		System.out.println("The initial value of y is 3");
//		System.out.println("When increment applies ++y");
//		int y = 3;
//		System.out.println("The value of y is already increase\n"
//				+ "++y = " + ++y + " on the first use of the variable\n"
//				+ " as such. y is now " + y);
		
		int num1 = 3; int num2 = 7;
		System.out.println("int num1 = 3; int num2 = 7;");
		System.out.println("num1 += 3");
		System.out.println(num1 += 3);
		System.out.println("6 is the answer because it adds 3\n"
				+ "on num1 which is number 3");
		
		System.out.println("");
		
		System.out.println("num2 -= 3");
		System.out.println(num2 -= 3);
		System.out.println("4 is the answer because 7 subtracted by 3");
		
		System.out.println("");
		
		System.out.println("num1 *= 2");
		System.out.println(num1 *= 2);
		System.out.println("12 is the answer because on num1 += the answer is 6\n"
				+ "therefore the answer is 6 * 2 = 12");
		
		System.out.println("");
		
		System.out.println("num2 /= 2");
		System.out.println(num2 /= 2);
		System.out.println("2 is the answer because since the answer of num2 -= 3 is 4\n"
				+ "therefore the answer is 4 divided by 2 is 2");
		
		System.out.println("");
		
		System.out.println("++num1 - num2");
		System.out.println(++num1 - num2);
		System.out.println("11 is the answer because the value of num1 is 12 and we add 1 because its ++num1 so it will be 13\n"
				+ "and it will be subtracted by 2 since the value of num2 is 2");
		
		System.out.println("");
		
		System.out.println("--num2 + num1");
		System.out.println(--num2 + num1);
		System.out.println("14 is the answer because the value of num1 is 13 and the value of num2 is 2 \n"
				+ "and it will subtracted by 1 since its --num2 therefore the answer is 14");
		
		
		System.out.println("");
		
		System.out.println("num1 + num2");
		System.out.println(num1 + num2);
		System.out.println("14 is the answer because nothing will be added or subtracted\n"
				+ "therefore the answer is 14");
		
		System.out.println("");
		System.out.println("Part 2");
		System.out.println("");
		int x=3; int y=7;
		System.out.println("++x + --y");
		System.out.println(++x + --y);
		System.out.println("10 is the answer because 4 plus 6 equals to 10");
//x=4 y=6		
		System.out.println("");
		
		System.out.println("x-- - y++");
		System.out.println(x-- - y++);
		System.out.println("-2 is the answer because 4 subtracted by 6 is -2\n"
				+ "because 6 is larger than 4 therefore it will turn into negative");
//x=4 turning into 3 y= turning into 7		
		System.out.println("");
		
		System.out.println("--x + ++y");
		System.out.println(--x + ++y);
		System.out.println("10 is the answer because we will subtract 1 because of post decrement of x and add 1 because of post increment of y\n"
				+ "and we will subtract 1 because of pre decrement of x and we will add 1 because of pre increment of y that is why the answer is 10");
//x=2 y= 8		
		System.out.println("");
		
		System.out.println("x++ - y--");
		System.out.println(x++ - y--);
		System.out.println("-6 is the answer because 8 is larger than 2, so it will turn into negative therefore 2 minus 8 is equal to -6");
//x=2 turning into 3 y= 8 turning into 7		
		System.out.println("");
		
		System.out.println("x += 8");
		System.out.println(x += 8);
		System.out.println("11 is the answer because the value of x is 3 because of post increment therefore 3 plus 8 is equal to 11");
//x=11
		System.out.println("");
		
		System.out.println("y -= 4");
		System.out.println(y -= 4);
		System.out.println("3 is the answer because the value of y is 7 because of post decrement therefore 7 minus 4 is 4");
//y=3		
		System.out.println("");
		
		System.out.println("x + y");
		System.out.println(x + y);
		System.out.println("14 is the answer because the value of x is 11 and the value of y is 3,\n"
				+ " therefore the answer is 11 plus 3 is equal to 14");
//		
		System.out.println("");
		System.out.println("Part 3");
		System.out.println("");
//		
		int a=1; int b=2; int c=3; int d=4;
		System.out.println("a++ + --b");
		System.out.println(a++ + --b);
		System.out.println("2 is the answer because the value of b will be 1 because its pre decrement\n"
				+ "therefore the answer is 2");
//a=1 turning into 2 b=1
		System.out.println("");
		
		System.out.println("c += d");
		System.out.println(c += d);
		System.out.println("7 is the answer because we will add 3 and 4");
//c=3 d=4
		System.out.println("");
		
		System.out.println("--a + ++d");
		System.out.println(--a + ++d);
		System.out.println("6 is the answer because the value of a will be added by 1 but it will subtract by 1 because of pre decrement\n"
				+ "and the value of d is 4 and it will be added by 1 because of pre increment therefore the answer is 6");
//a=1 d=5		
		System.out.println("");
		
		System.out.println("c-- + ++b");
		System.out.println(c-- + ++b);
		System.out.println("9 is the answer because the value of c is 7 and the value of b is 2\n"
				+ " therefore the answer is 7 plus 2 is equal to 9");
//c=7 turning into 6 b=2
		
		System.out.println("");
		
		System.out.println("a++ < --c");
		System.out.println(a++ < --c);
		System.out.println("true is the answer because the value of a is 2 and the value of c is 5, \n"
				+ "therefore the answer is 2 is less than 5");
//a=2 c=5		
		System.out.println("");
		
		System.out.println("++b > --d");
		System.out.println(++b > --d);
		System.out.println("false because the value of b is 2 but because of pre increment it will turn into 3\n"
				+ " and the value of d is 5 but because of pre decrement it will turn into 4, therefore the answer is 3 is not greater than 4");
//b=3 d=4		
		System.out.println("");
		
		System.out.println("a-- + ++d > --b - --c");
		System.out.println(a-- + ++d > --b - --c);
		System.out.println("True because the value of a is 2, the value of d is 5 so we will add them 2 plus 5 is equal to 7, \n"
				+ " the value of b is 2 and the value of c is 4 and we will subtract them 2 minus 4 is equal to -2 therefore the answer is 7 is greater than -2");
//a=2 turning into 1 d=5 > b=2 c=4	
		System.out.println("");
		
		System.out.println("++b + ++c > ++a + d++");
		System.out.println(++b + ++c > ++a + d++);
		System.out.println("true because the value of b is 2 but because of pre increment it will turn into 3, the value of c is 4 because of pre increment it will turn into 5 \n"
				+ "and we will add them 3 plus 5 is equal to 8, the value of a is 1 but because of pre increment it will turn into 2 and the value of d is 5 \n"
				+ "and we will add them so 2 plus 5 is equal to 7 therefore the answer is 8 is greater than 7");
//b=3 c=5 > a=2 d=5 turning into 6		
		System.out.println("");
		
		System.out.println("a-- + --b - --c != ++d");
		System.out.println(a-- + --b - --c != ++d);
		System.out.println("true because the value of a is 2, the value of b is 3 but because of pre decrement it will turn into 2 and we will add them so 2 plus 2 is equal to 4, \n"
				+ " the value of c is 5 but because of pre decrement it will turn into 4 and we will add them so 4 minus 4 is equal to 0\n"
				+ "  the value of d is 6 because of post increment and because of pre increment it will turn into 7 therefore 0 is not equal to 7");
//a= 2 turning into 1 b=2 c=4 != d=7		
		System.out.println("");
		
		System.out.println("++a + ++b + c++ == d*3");
		System.out.println(++a + ++b + c++ == d*3);
		System.out.println("false because the value of a is 2 but because of post decrement it will turn into 1 but because of post increment it will turn back into 2, \n"
				+ " the value of b is 2 but because of pre increment it will turn into 3 and we will add them so 2 plus 3 is equal to 5, \n"
				+ "the value of c is 4 and we are going to add them again so 5 plus 4 is 9, the value of d is 7 and we are going to multiply it to 3 so 7 multiply by 3 is equal to 21, \n"
				+ "therefore 9 is equal to 21 is false");
//a=2 b=3 c=4 == d=7*3=21		
		
		System.out.println();
		System.out.println("part 4");
		System.out.println();
		
		int xx = 7; int yy = 4;
		System.out.println("xx-- < 9 && yy < 9");
		System.out.println(xx-- < 9 && yy < 9);
		System.out.println("True because the value of xx is 7 so it is less than 9 \n"
				+ "and the value of yy is 4 so it is less than 9 therefore the answer is true");
		
		System.out.println();
		
		System.out.println("--xx > 4 && ++yy > 4");
		System.out.println(--xx > 4 && ++yy > 4);
		System.out.println("True because the value of xx is 7 but because of pre decrement and post decrement the value of xx will be 5 so it is greater than 4\n"
				+ "and the value of yy is 4 but because of pre increment the value of yy will be 5 so it is greater than 4, therefore the answer is true");
		
		System.out.println();
		
		System.out.println("xx-- > 4 || ++y > 4");
		System.out.println(xx-- > 4 || ++y > 4);
		System.out.println("True because the value of xx is 5 so it is greater than 4 and the value of yy is 5 but because of pre increment the value of yy will be 6 \n"
				+ "so it is not greater than 4, therefore the answer is true");
//xx=5 yy=6		
		System.out.println();
//xx=4 yy=6		
		System.out.println("xx > 3 || yy > 7");
		System.out.println(xx > 3 || yy > 7);
		System.out.println("True because the value of xx is 5 but because of post decrement it will turn into 4 so it is greater than 3 \n"
				+ "and the value of yy is 6 so it is not greater than 7");
		
		System.out.println();
		
		System.out.println("xx-- > 5 && yy++ > 3");
		System.out.println (!(xx-- > 5 && yy++ > 3));
		System.out.println("");
		
		System.out.println();
		
		System.out.println("++xx > 7 || yy > 8");
		System.out.println(!(++xx > 7 || yy > 8));
		System.out.println("");
	}

}
