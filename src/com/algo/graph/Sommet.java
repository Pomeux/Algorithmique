package com.algo.graph;

import com.algo.list.ListChain;

import java.util.Iterator;


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

	public 	Iterator<T> t() {
		return adjacent.iterator();
	}

	@Override
	public String toString() {
		return ""+sommet;
	}
}
