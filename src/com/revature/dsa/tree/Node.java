package com.revature.dsa.tree;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {
	private T data;
	private List<Node<T>> children;
	private Node<T> parent;

	public Node(T data) {
		this.data = data;
		this.children = new ArrayList<>();
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public List<Node<T>> getChildren() {
		return children;
	}

	public void setChildren(List<Node<T>> children) {
		this.children = children;
	}

	public Node<T> getParent() {
		return parent;
	}

	public void setParent(Node<T> parent) {
		this.parent = parent;
	}
	
	public void addChild(T data) {
		Node<T> node = new Node<>(data);
		addChild(node);
	}
	
	public void addChild(Node<T> node) {
		this.children.add(node);
		node.setParent(this);
	}
	
	public static void traverse(Node<?> node) {
		if (node == null) return;
		for (int i = 0; i < node.getChildren().size(); i++) {
			Node<?> child = node.getChildren().get(i);
			System.out.println(child.getData());
			traverse(child);
		}
	}
	
	public Node<T> find(T data) {
		return findNode(this, data);
	}

	private Node<T> findNode(Node<T> node, T data) {
		if (node == null) return null;
		System.out.println(node.getData() + " - " + data + " - " +node.getData().equals(data));
		if (node.getData().equals(data)) {
			return node;
		} else {
			for (int i = 0; i < node.getChildren().size(); i++) {
				return findNode(node.getChildren().get(i), data);
			}
		}
		return null;
	}
}
