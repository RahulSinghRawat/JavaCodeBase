package dailyinterviewPRO;

public class Test {
public static void main(String[] args) {
	int arr[] = {1112};
	
	for(int i = 0;i<arr.length;i++) {
		int count = 0;
		for(int j = 0;j<arr.length;j++) {
		if(arr[i] != arr[j])
			break;
		count++;
		}
		
		System.out.println(count+""+arr[i]);
		
	}
}
}
