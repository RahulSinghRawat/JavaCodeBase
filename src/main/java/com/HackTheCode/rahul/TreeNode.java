package com.HackTheCode.rahul;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
	String text;
	List<TreeNode> Children;
	
	public TreeNode(String text) {
		this.text = text;
		this.Children = new ArrayList<>();
	}
	}
