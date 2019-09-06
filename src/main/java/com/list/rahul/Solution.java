package com.list.rahul;

public class Solution {

public static class Node{  
        int data;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
            this.next = null;  
        }  
    }  

public static Node head = null;  
public static Node tail = null;  

public static void addAtEnd(int data) {  
    //Create a new node  
    Node newNode = new Node(data);  

    //Checks if the list is empty  
    if(head == null) {  
        //If list is empty, both head and tail will point to new node  
        head = newNode;  
        tail = newNode;  
    }  
    else {  
        //newNode will be added after tail such that tail's next will point to newNode  
        tail.next = newNode;  
        //newNode will become new tail of the list  
        tail = newNode;  
    }  
}  
	
	public int solution(int[] A) {
		
		int len = A.length;
		while(len > 0) {
			if(head == null)
			    addAtEnd(A[0]);
			else {
				if(tail.data == -1) {
					Node newNode = new Node(tail.data);  
					tail.next = newNode;  
			        tail = newNode;
			        return lengthOfLinkedList();
				}else
				{
				addAtEnd(A[tail.data]);
				}
			}
			
			len--;
		}
		return lengthOfLinkedList();
		
	}
	
	public int lengthOfLinkedList()
	 {
	  Node temp=head;
	  int count = 0;
	  while(temp.data!=-1)
	  {
	   temp=temp.next;
	   count++;  
	  }
	  return count;
	 }
	
	public static void main(String[] args) {
		
		int []A = {1,4,-1,3,2};
		Solution s = new Solution();
		
		System.out.println(s.solution(A));
		
	}
}
