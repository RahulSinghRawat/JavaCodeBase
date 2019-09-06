package com.string.rahul;

public class StringDemo {
    public static void main(String[] args) {
        String original = "computer";
        StringBuilder result = new StringBuilder("hi");
        int index = original.indexOf('t');
        result.setCharAt(0, original.charAt(0));
        result.setCharAt(1, original.charAt(original.length()-1));
        result.insert(1, original.charAt(4));
        result.append(" ");
        result.append(original.substring(1,4));
        System.out.println(result);
    }
}