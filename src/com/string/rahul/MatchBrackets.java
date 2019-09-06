package com.string.rahul;

public class MatchBrackets{

    public static String matchBrackets(String brackets){

      int open = 0;
      int count =0;

     for(int i=0;i<brackets.length();i++){
        if(brackets.charAt(i)=='('){
        open++;
        }else if(brackets.charAt(i)==')'){
         open--;
        }
        if(open<0){
        count++;
        open++;
     }
  }
     
    
  return Integer.toString(count+open);
}

    public static String RemoveBrackets(String str) { 
    	  
        // code goes here   
        /* Note: In Java the return type of a function and the 
           parameter types being passed are defined, so this return 
           call must match the return type of the function.
           You are free to modify the return type. */
             int open = 0;
          int count =0;

         for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
            open++;
            }else if(str.charAt(i)==')'){
             open--;
            }
            if(open<0){
            count++;
            open++;
         }
      }
      return Integer.toString(count+open);
           
        
      } 
  public static void main(String[] args) {

  System.out.println(matchBrackets("())("));
  //System.out.println(matchBrackets("(((())))"));
  //System.out.println(matchBrackets("))))"));
}}
