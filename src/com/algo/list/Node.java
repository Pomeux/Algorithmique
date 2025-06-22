package com.algo.list;

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
	public void setNext(Node<T> next) { this.next=next; }

	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(!(obj instanceof Node))
			return false;
		return false;
	}

	@Override
	public String toString() {
		if(next==null) return val.toString();
		return val+"->"+next;
	}
}
