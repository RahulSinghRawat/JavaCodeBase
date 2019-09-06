package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class IntuitProblem1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("code");
		list.add("doce");
		list.add("ecod");
		list.add("framer");
		list.add("frame");
		
		System.out.println(funWithAnagrams(list));
	}
	
	public static boolean areAnagram(char str1[], char str2[]) 
	    { 
	        int count1[] = new int[256]; 
	        Arrays.fill(count1, 0); 
	        int count2[] = new int[256]; 
	        Arrays.fill(count2, 0); 
	        int i; 
	  
	   
	        for (i = 0; i < str1.length && i < str2.length; 
	             i++) { 
	            count1[str1[i]]++; 
	            count2[str2[i]]++; 
	        } 
	  
	      
	        if (str1.length != str2.length) 
	            return false; 
	  
	        for (i = 0; i < 256; i++) 
	            if (count1[i] != count2[i]) 
	                return false; 
	  
	        return true; 
	    } 
	
	public static List<String> funWithAnagrams(List<String> s){
		
		for(int i =0;i<s.size()-1;i++) {
			if(areAnagram(s.get(i).toCharArray(), s.get(i+1).toCharArray())) {
				s.remove(i+1);
				i--;
			}	
		
	}
		return s;
	}
	
}
