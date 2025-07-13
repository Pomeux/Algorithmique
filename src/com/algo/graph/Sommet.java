package com.algo.graph;

import com.algo.list.ListChain;


public class Sommet<T> {
	private int degree;
	private T sommet;
	private ListChain<T> adjacent;

	
	public Sommet(T sommet) {
		this.sommet=sommet;

	}
	public void setDegree(int degree) { this.degree=degree;}
	public int getDegree() {
		return degree;
	}
	public T getSommet() {
		return sommet;
	}
	public void setSommet(T sommet) {
		this.sommet=sommet;
	}

	@Override
	public String toString() {
		return ""+sommet;
	}
}
