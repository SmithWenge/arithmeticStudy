package ¶þ²æÊ÷;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ¶þ²æÊ÷´òÓ¡ {
	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		Node node8 = new Node(8);
		
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node3.left = node5;
		node3.right = node6;
		node5.left = node7;
		node5.right = node8;
		printTree(node1);
	}

	private static class Node {
		int val;
		Node left;
		Node right;

		public Node(int val) {
			this.val = val;
		}

		@Override
		public String toString() {
			return " " + val;
		}
	}

	public static void printTree(Node root) {
		if (root == null) {
			throw new IllegalArgumentException();
		}
		LinkedList<Node> queue = new LinkedList<Node>();
		queue.addLast(root);
		int last = root.val;
		int nlast = Integer.MAX_VALUE;
		List<Integer> rows = new ArrayList<>();
		while (!queue.isEmpty()) {
			Node curr = queue.removeFirst();
			if (curr.left != null) {
				queue.addLast(curr.left);
				nlast = curr.left.val;
			}
			if (curr.right != null) {
				queue.addLast(curr.right);
				nlast = curr.right.val;
			}
			rows.add(curr.val);
			if (curr.val == last) {
				System.out.print(rows);
				System.out.println();
				rows.clear();
				last = nlast;
			}
		}
	}
}
