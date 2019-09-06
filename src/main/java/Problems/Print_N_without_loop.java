package Problems;

public class Print_N_without_loop {
	public static void main(String[] args) {
		new Print_N_without_loop().print_N(5);
	}

	public void print_N(int n) {
		if (n == 0)
			return;
		print_N(n - 1);
		System.out.println(n);

	}
}
