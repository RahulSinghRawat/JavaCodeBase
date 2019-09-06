package com.DP.rahul;

//A Dynamic Programming based Java 
//implementation to count decodings 
import java.io.*; 

class DecodeWaysFromString 
{ 
	
//A Dynamic Programming based 
//function to count decodings 
static long countDecodingDP(String inputStr) 
{ 
	int n = inputStr.length();
	// A table to store results of subproblems 
	int count[] = new int[n + 1]; 
	count[0] = 1; 
	count[1] = 1; 
	if(inputStr.charAt(0)=='0') //for base condition "01123" should return 0 
		return 0; 
	for (int i = 2; i <= n; i++){ 
		count[i] = 0; 
		if (inputStr.charAt(i - 1) > '0') 
			count[i] = count[i - 1]; 
		if (inputStr.charAt(i - 2) == '1' || (inputStr.charAt(i - 2) == '2' && inputStr.charAt(i - 1) < '7')) 
			count[i] += count[i - 2]; 
	} 
	return count[n]; 
} 

//Driver Code 
public static void main (String[] args) 
{ 
	String inString = "2101";
	System.out.println("Count is " + 
			countDecodingDP(inString)); 
} 
} 



