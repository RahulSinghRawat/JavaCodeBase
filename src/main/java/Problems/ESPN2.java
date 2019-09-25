package Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ESPN2 {
public static void main(String[] args) {
	List<Integer> list = new ArrayList<>();
	list.add(0);
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	
	
	for (String string : findPairs(list, 3)) {
		System.out.println(string);
	}
}
	public static List<String> findPairs(List<Integer> inputNumbers, int sumNumber) {
		
		List<String> tempList = new ArrayList<>();
		Map<Integer,Integer> hashMap = new HashMap<>();
		
		 for(int i=0;i<inputNumbers.size();i++) {
			 if(hashMap.containsKey(inputNumbers.get(i))) {
				 tempList.add("("+hashMap.get(inputNumbers.get(i))+","+i+")");
			 }
			 
			 hashMap.put(sumNumber - inputNumbers.get(i), i);
			 
		 }
		return tempList;
	    

	    }

}
