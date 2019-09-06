package com.tree.rahul;
//https://www.techiedelight.com/find-pair-with-given-sum-bst/
import java.util.HashSet;
import java.util.Set;

class FindAPairWithGivenSum
{
	// Recursive function to insert an key into BST
	public static Node insert(Node root, int key)
	{
		// if the root is null, create a new node an return it
		if (root == null) {
			return new Node(key);
		}

		// if given key is less than the root node, recur for left subtree
		if (key < root.data) {
			root.left = insert(root.left, key);
		}

		// if given key is more than the root node, recur for right subtree
		else {
			root.right = insert(root.right, key);
		}

		return root;
	}

	// Function to find a pair with given sum in given BST
	public static boolean findPair(Node root, int sum, Set set)
	{
		// base case
		if (root == null) {
			return false;
		}

		// return true if pair is found in the left subtree else continue
		// processing the node
		if (findPair(root.left, sum, set)) {
			return true;
		}

		// if pair is formed with current node, print the pair and 
		// return true
		if (set.contains(sum - root.data))
		{
			System.out.print("Pair found (" + (sum - root.data) + ", "
									+ root.data + ")");
			return true;
		}

		// insert current node's value into the set
		else {
			set.add(root.data);
		}

		// search in right subtree
		return findPair(root.right, sum, set);
	}

	// main function
	public static void main(String[] args)
	{
		int[] keys = { 15, 10, 20, 8, 12, 16, 25 };
		Node root = null;

		for (int key : keys) {
			root = insert(root, key);
		}

		// find pair with given sum
		int sum = 28;

		// create an empty set
		Set<Integer> set = new HashSet<>();

		if (!findPair(root, sum, set)) {
			System.out.print("Pair do not exists");
		}
	}
}