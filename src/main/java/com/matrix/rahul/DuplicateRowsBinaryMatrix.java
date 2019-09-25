package com.matrix.rahul;
//A class representing a Trie node
class Trie
{
	boolean isLeaf;	// set when node is a leaf node
	Trie[] character = new Trie[2];

	// Constructor
	Trie()
	{
		isLeaf = false;
	}
};

public class DuplicateRowsBinaryMatrix
{
	// Iterative function to insert array in Trie.
	public static boolean insert(Trie head, int[] A)
	{
		// start from root node
		Trie curr = head;

		for(int i = 0; i < A.length; i++)
		{
			// create a new node if path doesn't exists
			if (curr.character[A[i]] == null) {
				curr.character[A[i]] = new Trie();
			}

			// go to next node
			curr = curr.character[A[i]];
		}

		// if row is inserted before, return false
		if (curr.isLeaf) {
			return false;
		}

		// mark leaf node and return true
		return (curr.isLeaf = true);
	}

	public static void main (String[] args)
	{
		Trie head = new Trie();

		int mat[][] =
		{
			{1, 0, 0, 1, 0},
			{0, 1, 1, 0, 0},
			{1, 0, 0, 1, 0},
			{0, 0, 1, 1, 0},
			{0, 1, 1, 0, 0}
		};

		// insert all rows of into trie
		for (int i = 0; i < mat.length; i++) {
			if (!insert(head, mat[i])) {
				System.out.println("Duplicate row found: Row #" + (i + 1));
			}
		}
	}
}