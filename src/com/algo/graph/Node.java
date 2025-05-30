package com.algo.graph;

public class Node<T> {
	private T val;
	private Node<T> next;
	
	public Node(T val,Node<T> next) {
		this.val=val;
		this.next=next;
	}
	public T getVal() {
		return val;
	}
	public Node<T> getNext() {
		return next;
	}
	public void setVal(T val) {
		this.val=val;
	}
	@Override
	public String toString() {
	
		return "->"+val+next;
	}
}
