package com.maths.rahul;

public class BinaryCheck {
public static void main(String[] args) {
	int number = 1010;
	System.out.println("number :"+number);
	System.out.println(isBinary(number));
}

public static boolean isBinary(int number) {
	int copy = number;
	while(copy != 0) {
		if(copy % 10 > 1)
			return false;
		copy = copy/10;
	}
	return true;
}
}
