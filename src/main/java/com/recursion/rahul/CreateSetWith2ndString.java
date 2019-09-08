package com.recursion.rahul;
/*  Given two Strings str1 = ABC and str2 = DEF, print AD,AE,AF,BD,BE,BF,CD,CE,CF  */
public class CreateSetWith2ndString {
	public static void main(String[] args) {
		
		String string1 = "ABC";
		String string2 = "DEF";
		
	    recursiveReverse(string1, string2);
	}

	public static void recursiveReverse(String string1, String string2) {
		
		if(string1.isEmpty()) {
			return ;
		}
	     
		//System.out.println();
		 
		   createSet(string1.charAt(0), string2);
		   string1 = string1.substring(1);
		   recursiveReverse(string1, string2);
		//System.out.println(string1);   
	}

	public static void createSet(char str1, String str2) {
		
		if(str2.isEmpty()) {
			return ;
		}
	     
		System.out.println(str1+""+str2.charAt(0));
		 str2 = str2.substring(1);
		   createSet(str1,str2);
	}
}
