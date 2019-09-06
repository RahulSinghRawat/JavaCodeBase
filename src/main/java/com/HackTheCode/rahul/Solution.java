package com.HackTheCode.rahul;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the function below.
     */
    static void superStack(String[] operations) {
        List<Integer> stack = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (String s : operations) {
            if (s.startsWith("push")) {
                int value = Integer.parseInt(s.split(" ")[1]);
                stack.add(value);
            } else if (s.startsWith("pop")) {
                stack.remove(stack.size() - 1);
                //modify the hashmap
                for(Integer i: map.keySet()) {
                    if (stack.size() < i) {
                        map.put(i-1, map.get(i));
                        map.remove(i);
                    }
                }
            } else if (s.startsWith("inc")) {
                String[] splits = s.split(" ");
                int e = Integer.parseInt(splits[1]);
                int value = Integer.parseInt(splits[2]);
                map.put(e, map.getOrDefault(e, 0) + value);
            }

            if (stack.size() == 0) {
                System.out.println("EMPTY");
            } else {
                int value = stack.get(stack.size()-1);
                for(Integer i: map.keySet()) {
                    if (stack.size() <= i) {
                        value+=map.get(i);
                    }
                }
                System.out.println(value);
            }
        }
    }
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        int operations_size = 0;
        operations_size = Integer.parseInt(in.nextLine().trim());

        String[] operations = new String[operations_size];
        for(int i = 0; i < operations_size; i++) {
            String operations_item;
            try {
                operations_item = in.nextLine();
            } catch (Exception e) {
                operations_item = null;
            }
            operations[i] = operations_item;
        }

        superStack(operations);
        
    }
}
