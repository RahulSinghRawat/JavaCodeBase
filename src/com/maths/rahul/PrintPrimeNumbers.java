package com.maths.rahul;

public class PrintPrimeNumbers {
public static void main(String[] args) {
	printPrimeNumbers(20);
}

public static void printPrimeNumbers(int number) {

	if(number == 2) {   // base case 2 is the least prime number
		System.out.print(number+",");
		return;
	}
	
   if(isPrime(number)) {
	      printPrimeNumbers(number-1);
	      System.out.print(number+",");
   }else
          printPrimeNumbers(number-1);

}

public static boolean isPrime(int number) {
	
	for(int i=2; i<number; i++){
        if(number%i == 0){
            return false; //number is divisible so its not prime
        }
     }
     return true; //number is prime now
}
}
