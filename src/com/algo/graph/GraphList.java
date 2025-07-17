package com.algo.graph;

import java.util.ArrayList;

public class GraphList<T> extends Graph<T>{
	

	private ArrayList<Sommet<T>> tab;

	public GraphList(int n,boolean oriente,boolean weighted) {
		super(oriente,weighted);
	}

	private int degree(int i) {
		if(1<=i && i<=get_node()) {
			return tab.get(i).getDegree();
		}
		throw new IllegalArgumentException("numero de sommet pas présent"+getClass().getSimpleName());
	}
	public void add_node(T t) {
		Sommet<T> s=new Sommet<>(t);
		tab.add(s);
		set_node(get_node()+1);
	}

	@Override
	public void add_edge(int i, T t) {
		Sommet<T> sommet=tab.get(i);

	}

	@Override
	public String toString() {
		return "";
	}
	
	//implementé un iterateur
	
}
