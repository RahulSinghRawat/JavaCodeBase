package com.tree.rahul;
import java.util.ArrayDeque;
import java.util.Queue;

class BinaryTreeLeftView {

	// Iterative function to print left view of given binary tree
	public static void leftView(Node root)
	{
		// return if tree is empty
		if (root == null) {
			return;
		}

		// create an empty queue and enqueue root node
		Queue<Node> queue = new ArrayDeque<>();
		queue.add(root);

		// pointer to store current node
		Node curr;

		// run till queue is not empty
		while (!queue.isEmpty())
		{
			// calculate number of nodes in current level
			int size = queue.size();
			int count = 0;

			// process every node of current level and enqueue their
			// non-empty left and right child to queue
			while (count++ < size) {
				curr = queue.poll();

				// if this is first node of current level, print it
				if (count == 1) {
					System.out.print(curr.data + " ");
				}

				if (curr.left != null) {
					queue.add(curr.left);
				}

				if (curr.right != null) {
					queue.add(curr.right);
				}
			}
		}
	}

	// main function
	public static void main(String[] args)
	{
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.right = new Node(4);
		root.right.left = new Node(5);
		root.right.right = new Node(6);
		root.right.left.left = new Node(7);
		root.right.left.right = new Node(8);

		leftView(root);
	}
}