package com.algo.graph;

public abstract class Graph<T> {
	private int n;
	private int m;

	private boolean weighted;
	private boolean oriente;

	public Graph(boolean weighted,boolean oriente) {
		this.weighted=weighted;
		this.oriente=oriente;
	}

	public boolean getOriente() {
		return oriente;
	}
	public boolean get_weighted() {
		return weighted;
	}
	public int get_node() {
		return n;
	}
	public int get_edge() {
		return m;
	}
	protected void set_node(int n) {
		this.n=n;
	}
	protected void set_edge(int m) {
		this.m=m;
	}
	public int getM() {
		return m;
	}

	public String toString() {
		return n+" "+m;
	}
	public abstract void add_node(T t);
	
}
