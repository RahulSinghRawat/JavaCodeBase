package dailyinterviewPRO;

/*Given an array of integers, return a new array such that each element at index i 
 * of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. 
If our input was [3, 2, 1], the expected output would be [2, 3, 6].*/
public class Test1 {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		int temp[] = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			temp[i] = getProduct(arr,i);
		}
		
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
	}
	
	public static int getProduct(int arr[], int j) {
		
		int product = 1;
		
		for(int i = 0;i<arr.length;i++) {
			if(i == j)
				continue;
			
			product = product * arr[i];
		}
		return product;
	}
}
