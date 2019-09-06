package com.maths.rahul;
//https://www.java67.com/2015/10/how-to-solve-fizzbuzz-in-java.html
public class FizzBuzz {
public static void main(String[] args) {
	System.out.println(Findfizzbuzz(2));
}

public static String Findfizzbuzz(int number) {
	
	if(number % 3 == 0 && number % 5 == 0) {
		return "fizzbuzz";
	}
	else if(number % 3 == 0)
		return "fizz";
	else if(number % 5 == 0)
		return "buzz";
	
	
	return String.valueOf(number);
}
}
