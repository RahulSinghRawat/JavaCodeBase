package com.tree.rahul;

import java.util.StringTokenizer;

public class TestClass {
public static void main(String[] args) {
	String string = "xyz abc mnp \"asdf dfaa asdf\" asd \"fdas asdsdafF\"";
	
   String arr[] = string.split(" ");
   
   StringTokenizer token = new StringTokenizer(string);
   
   System.out.println("Number of tokens "+arr.length);
   for (int i = 0; i < arr.length; i++) {
	System.out.println(arr[i]);
}
}
}
