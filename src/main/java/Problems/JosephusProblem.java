package Problems;

public class JosephusProblem {
public static void main(String[] args) {
	
	int n = 7;
	int k = 3;
	System.out.println(JosephusProblemFunction(n, k));
}

public static int JosephusProblemFunction(int n,int k) {
	
	if(n==1)
		return 1;
	return (JosephusProblemFunction(n - 1, k) + k-1) % n + 1; 
}
}
