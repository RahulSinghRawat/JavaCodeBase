package com.tree.rahul;

import java.util.LinkedList;
import java.util.Queue;

public class Write3Subtree {

	public static void main(String[] args) {

		BinaryTreeLCA binaryTree = new BinaryTreeLCA();
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left= new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.left.right.left = new Node(8);
		root.left.right.right = new Node(9);
		root.left.right.right.left = new Node(12);
		root.left.right.right.right = new Node(13);
		root.right.right.left = new Node(10);
		root.right.right.right = new Node(11);
		
		Node LcaNode = binaryTree.findLCA(8,9,root);
		LevelTraversal(root, LcaNode.data);
	}

	public static void LevelTraversal(Node root, int lca) {

		Queue<Node> queue = new LinkedList<>();

		queue.add(root);

		Node LCANode = null;
		while (!queue.isEmpty()) {
			Node node = queue.poll();

			if (node.data != lca) {
				System.out.print(node.data + " ");

				if (node.left != null)
					queue.add(node.left);

				if (node.right != null)
					queue.add(node.right);
			} else {
				LCANode = node;
				continue;
			}
		}
		System.out.println();
		System.out.print(LCANode.data+" ");
		inorderTraversal(LCANode.right);
		System.out.println();
		inorderTraversal(LCANode.left);
		

	}

	public static void inorderTraversal(Node root) {

		if (root == null)
			System.out.println("Tree is Empty:");

		if (root.left != null)
			inorderTraversal(root.left);

		System.out.print(root.data+" ");

		if (root.right != null)
			inorderTraversal(root.right);

	}
}
