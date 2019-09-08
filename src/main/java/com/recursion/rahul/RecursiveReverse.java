package com.recursion.rahul;

public class RecursiveReverse {
	public static void main(String[] args) {

		String string = "Rahul";

		System.out.println(recursiveReverse(string));
	}

	public static String recursiveReverse(String string) {

		if (string.isEmpty()) {
			return string;
		}
		System.out.println(string + string.length());
		return recursiveReverse(string.substring(1) + string.charAt(0));
	}
}