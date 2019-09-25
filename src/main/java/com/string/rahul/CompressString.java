package com.string.rahul;

// Time complexity O(n)
public class CompressString {
	public static void main(String[] args) {
		String str = "aaabbccdde";
		compress(str);
	}

	private static void compress(String inputString) {
		int len = inputString.length();
		int count = 1;
		for (int i = 0; i < len; i++) {
			if (i + 1 == len)
				break;

			if (inputString.charAt(i) == inputString.charAt(i + 1))
				count++;
			else {
				System.out.print(inputString.charAt(i));
				System.out.print(count);
				count = 1;
			}
		}
		System.out.print(inputString.charAt(len - 1));
		System.out.print(count);
	}
}