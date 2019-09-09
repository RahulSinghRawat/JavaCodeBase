package Problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinimumSwaps {
	static int minimumSwaps(List<Integer> popularity) {
		int swap=0;
		boolean visited[]=new boolean[popularity.size()];

		for(int i=0;i<popularity.size();i++){
			int j=i,cycle=0;
			while(!visited[j]){
				visited[j]=true;
				j=popularity.get(j)-1;
				  cycle++;
			}
			
			if(cycle!=0)
				swap+=cycle-1;
		}
		return swap;
	}

	public static void main(String[] args) {
		
	List<Integer> popularity = new ArrayList<Integer>();
	popularity.add(3);
	popularity.add(4);
	popularity.add(1);
	popularity.add(2);
		
		int res = minimumSwaps(popularity);
		System.out.println(res);
		
	}
}
