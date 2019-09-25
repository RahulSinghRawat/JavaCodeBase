package Problems;

import java.util.ArrayList;
import java.util.List;

public class ESPN1 {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		for (Integer integer : productArray(list)) {
			System.out.print(integer + " ");
		}

	}

	public static List<Integer> productArray(List<Integer> inputList) {

		int n = inputList.size();
		List<Integer> left = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			left.add(0);
		}
		List<Integer> right = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			right.add(0);
		}
		List<Integer> prod = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			prod.add(0);
		}
		int i, j;

		left.set(0, 1);

		right.set(n - 1, 1);

		for (i = 1; i < n; i++)

			left.set(i, (inputList.get(i - 1) * left.get(i - 1)));

		for (j = n - 2; j >= 0; j--)

			right.set(j, (inputList.get(j + 1) * right.get(j + 1)));

		for (i = 0; i < n; i++)

			prod.set(i, left.get(i) * right.get(i));

		return prod;
	}
}
