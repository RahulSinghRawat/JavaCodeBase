package com.big.tech.code;

import java.util.ArrayList;
import java.util.List;

/*Flatten a List<List<Integer>> in Java and implement the hasNext() and next() methods. 
e.g. [[6,8],4] should return true when at 6, 8 and false at 4.*/
public class FlattenList {
	int index = 0;
	List<Integer> flattenedList = new ArrayList<>();
	
	private FlattenList(){
	}
	
	public static FlattenList getList(List<List<Integer>> lists){
		FlattenList flattenList = new FlattenList();
		flattenList.flatten(lists);
		return flattenList;
	}

	private void flatten(List<List<Integer>> lists) {
		for(List<Integer> list : lists){
			flattenedList.addAll(list);
		}
	}
	
	public boolean hasNext(){
		return flattenedList.size() > index; 
	}
	
	public Integer next(){
		Integer result = flattenedList.get(index);
		index++;
		return result;
	}
}

/*public class FlattenListTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		
		FlattenList flattenList = FlattenList.getList(Arrays.asList(
				Arrays.asList(6, 8),
				Arrays.asList(4)
		));
		
		assertEquals(new Integer(6), flattenList.next());
		assertEquals(new Integer(8), flattenList.next());
		assertEquals(new Integer(4), flattenList.next());
		assertEquals(false, flattenList.hasNext());
		
	}

}*/