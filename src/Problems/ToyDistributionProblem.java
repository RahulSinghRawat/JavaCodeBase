package Problems;

public class ToyDistributionProblem {

	public static void main(String[] args) {
		
		System.out.println(findDamagedToy(5, 1, 5));
	}
	
	public static int findDamagedToy(int N, int T, int D) {
		int arr[] = new int[N];
		int count = 1;
		int cycle = 1;
	    int result=0;
		for(int i=0;i<arr.length;i++) {
			arr[i] = count++;
		}
		
		for(int j = D-1;j<arr.length;j++) {
			if(cycle < T && j == arr.length-1) {
				j = -1;
				cycle++;
				continue;
			}
			result = arr[j];
			if(cycle++ == T)
				break;
		}
		
		return result;
	}
}
