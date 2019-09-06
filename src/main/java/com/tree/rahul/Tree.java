package com.tree.rahul;

class Tree {
	  public TreeNode root;

	  public Tree(TreeNode n) {
	    this.root = n;
	  }

	  public static void preorder(TreeNode n) {
	    if(n != null) {
	      System.out.print(" "+n.data+" ");
	      preorder(n.left);
	      preorder(n.right);
	    }
	  }

	  public static void postorder(TreeNode n) {
	    if(n != null) {
	      postorder(n.left);
	      postorder(n.right);
	      System.out.print(" "+n.data+" ");
	    }
	  }

	  public static void inorder(TreeNode n) {
	    if(n != null) {
	      inorder(n.left);
	      System.out.print(" "+n.data+" ");
	      inorder(n.right);
	    }
	  }

	  public static void main(String[] args) {
	    /*

	               D
	              / \
	             /   \
	            /     \
	           A       F
	          / \     / \
	         /   \   /   \
	        E     B R     T
	       / \     /     / \
	      G   Q   V     J   L
	    */

	    TreeNode d, a, f, e, b, r, t1, g, q, v, j, l;
	    d = new TreeNode('D');
	    a = new TreeNode('A');
	    f = new TreeNode('F');
	    e = new TreeNode('E');
	    b = new TreeNode('B');
	    r = new TreeNode('R');
	    t1 = new TreeNode('T');
	    g = new TreeNode('G');
	    q = new TreeNode('Q');
	    v = new TreeNode('V');
	    j = new TreeNode('J');
	    l = new TreeNode('L');

	    Tree t = new Tree(d);

	    t.root.right = f;
	    t.root.left = a;

	    /*

	           D
	          / \
	         /   \
	        /     \
	       A       F
	    */

	    a.right = b;
	    a.left = e;

	    f.right = t1;
	    f.left = r;

	    e.right = q;
	    e.left = g;

	    r.left = v;

	    t1.right = l;
	    t1.left = j;

	    System.out.print("Preorder:\n");
	    preorder(t.root);
	    System.out.print("\nPostorder:\n");
	    postorder(t.root);
	    System.out.print("\nInorder:\n");
	    inorder(t.root);
	    System.out.print("\n");
	  }
	}