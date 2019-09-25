package com.tree.rahul;

//Data structure to store a Binary Search Tree node


public class LowestCommonAncestor {
	// Recursive function to insert an key into BST
	public static Node insert(Node root, int key) {
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

	// Iterative function to search a given key in root
	public static boolean search(Node root, int key) {
		// traverse the tree and search for the key
		while (root != null) {
			// if given key is less than the current node, go to left
			// subtree else go to right subtree

			if (key < root.data) {
				root = root.left;
			} else if (key > root.data) {
				root = root.right;
			}
			// if key is found return true
			else {
				return true;
			}
		}

		// we reach here if the key is not present in the BST
		return false;
	}

	// Recursive function to find Lowest Common Ancestor of given nodes
	// x and y where both x and y are present in the Binary Search Tree
	public static Node LCARecursive(Node root, int x, int y) {
		// base case: empty tree
		if (root == null) {
			return null;
		}

		// if both x and y is smaller than root, LCA exists in left subtree
		if (root.data > Integer.max(x, y)) {
			return LCARecursive(root.left, x, y);
		}

		// if both x and y is greater than root, LCA exists in right subtree
		else if (root.data < Integer.min(x, y)) {
			return LCARecursive(root.right, x, y);
		}

		// if one key is greater (or equal) than root and one key is smaller
		// (or equal) than root, then the current node is LCA
		return root;
	}

	// Print Lowest Common Ancestor of two nodes in a BST
	public static int LCA(Node root, int x, int y) {
		// return if tree is empty or either x or y is not present
		// in the tree
		if (root == null || !search(root, x) || !search(root, y)) {
			return -1;
		}

		// lca stores lowest common ancestor of x and y
		Node lca = LCARecursive(root, x, y);

		// if lowest common ancestor exists, print it
		if (lca != null) {
			return lca.data;
			//System.out.println("LCA is " + lca.data);
		} else {
			//System.out.println("LCA do not exist");
			return -1;
		}
	}

	public static void main(String[] args) {
		Node root = null;
		/*
		 * Construct below tree 15 / \ / \ 10 20 / \ / \ / \ / \ 8 12 16 25
		 */
		int[] keys = { 15, 10, 20, 8, 12, 16, 25 };

		for (int key : keys) {
			root = insert(root, key);
		}

		System.out.println(LCA(root, 8, 12));
	}
}