package com.maths.rahul;

public class PowerOf2 {
public static void main(String[] args) {
	System.out.println(isPowerOf2(6));
}

public static boolean isPowerOf2(int number) {
	int start = 1;
	while(start <= number) {
		if(start == number)
			return true;
		start = start * 2;
	}
	return false;
}
}
