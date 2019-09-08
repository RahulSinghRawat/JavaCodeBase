package com.recursion.rahul;

/*  Given two Strings str1 = ABC , Print A, B, C, AB, AC, BC, ABC  */

public class PowerSet {
public static void main(String[] args) {
	
	String string1 = "ABCDE";
	
    recursiveReverse(string1);
    System.out.print(string1);
}

public static void recursiveReverse(String string1) {
	
	if(string1.isEmpty()) {
		return ;
	}
    
	System.out.print(string1.charAt(0)+" ");
	   powerSet(string1.charAt(0), string1.substring(1));
	   string1 = string1.substring(1);
	   recursiveReverse(string1);  
}

public static void powerSet(char str1, String string2) {
	
	if(string2.isEmpty()) {
		return ;
	}
	
	System.out.print(str1+""+string2.charAt(0)+" ");
	
	powerSet(str1, string2.substring(1));
}
}

