package Problems;

public class GetMaxSumofwith_K_move {

	public static void main(String[] args) {
		
		//int arr[] = {10,2,-10,5,20};
		int arr[] = {10,-20,-5,2};
		int result = 10;
		
	/*	for(int i=0;i<arr.length;i++) {
			if(arr[i]>0)
				result = result + arr[i];
		}
		
		System.out.println(result);*/
		int index = 0;
		while(index<arr.length-1) {
			int temp_Index = 0;
			int max = Integer.MIN_VALUE;
			int k = 3;
			while(k>0) {

				if(index+k<arr.length && arr[index+k]>max) {
					max = arr[index+k];
					temp_Index = index+k;
				}
				k--;
			}
			
			index = temp_Index;
			result = result + arr[index];
		}
		
		System.out.println(result);
	}
}
