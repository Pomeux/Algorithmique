package com.algo.graph;

import com.algo.list.ListChain;

//à changer pour utilisé Node en tant que classe mère
public class Sommet<T> {
	private int degree;
	private T sommet;
	private ListChain<T> adjacent;

	
	public Sommet(T sommet,int degree) {
		this.sommet=sommet;
		this.degree=degree;
	}

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
