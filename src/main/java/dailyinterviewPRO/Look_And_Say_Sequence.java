package dailyinterviewPRO;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Look_And_Say_Sequence {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(2);
		list.add(1);
		say_sequence(list);
	}
	
	public static void say_sequence(List<Integer> LinkList) {
			
		if(LinkList.size()> 10) {
			return;
		}
		
		
		List<Integer> newSequence = new LinkedList<>();
		for (int i =0;i<LinkList.size();i++) {
			List<Integer> list = countSequence(LinkList, 0, LinkList.get(i), i);
			newSequence.addAll(list);
			//
		}
		
		for (Integer integer : newSequence) {
			System.out.print(integer);
		}
		System.out.println();
		
		say_sequence(newSequence);
	}

	public static List<Integer> countSequence(List<Integer> LinkList, int count, int number, int i) {
		List<Integer> NewLinkList = new LinkedList<>();
		  for(int j=i;j<LinkList.size();j++) {
				   if(number == LinkList.get(j)) {
					   count++;
					  
				   }else {
					   if(count!=0)
					      break;
				   }
			   }
		   NewLinkList.add(count);
		   NewLinkList.add(number);
		return NewLinkList;
	}
	
	public static List<Integer> removeDuplicates(List<Integer> list){
		Set<Integer> set = new HashSet<>();
		
		for (Integer integer : list) 
			 set.add(integer);
		
		List<Integer> l = new LinkedList<>();
		for (Integer integer : set) {
			l.add(integer);
		}
		
		return l;
	}
}
