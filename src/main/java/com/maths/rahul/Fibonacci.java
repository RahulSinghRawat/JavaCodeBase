package com.maths.rahul;

public class Fibonacci {
	public static void main(String[] args) {
      /*  int n = 10, t1 = 1, t2 = 1;
        System.out.print("First " + n + " terms: ");
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1+",");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }*/
		
		//FibonacciwithLoop(12);
		System.out.println(Recursive(10));
    }
	
	public static void FibonacciwithLoop(int number) {
		
		int t1 = 1;
		int t2 = 1;
		for (int i = 1; i <= number; i++) {
			System.out.println(t1);
			
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}
	}
	
	public static int Recursive(int number) {
		if(number == 1 || number == 0)
			return 1;
		
		return Recursive(number-1) + Recursive(number - 2);
		
	}
}
