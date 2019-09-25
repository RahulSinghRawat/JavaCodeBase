package com.recursion.rahul;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;

public class ListOfList {

	public static void main(String[] args) {

		List<List<Integer>> list = new ArrayList<List<Integer>>(3);

		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(11);
		a2.add(22);
		a2.add(33);
		ArrayList<Integer> a3 = new ArrayList<Integer>();
		a3.add(111);

		list.add(a1);
		list.add(a2);
		list.add(a3);

		PriorityQueue<Integer> pq = new PriorityQueue<>();
		Iterator<List<Integer>> iterator = list.iterator();
		recursiveIteration(iterator, pq);
		
		for (Integer integer : pq) {
			System.out.println(integer+" ");
		}

	}

	public static void recursiveIteration(Iterator<List<Integer>> iterator, PriorityQueue<Integer> pq) {

		while (iterator.hasNext()) {
			for (Integer integer : iterator.next()) {
				pq.add(integer);
			}
			recursiveIteration(iterator, pq);
		}
	}

}