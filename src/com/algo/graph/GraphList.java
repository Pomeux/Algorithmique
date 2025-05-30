package com.algo.graph;

import java.util.ArrayList;

public class GraphList<T> {
	
	private int n;
	private ArrayList<Sommet<T>> tab; // sommet permet évité d'avoir un noeud au début passoire ou de s'embeter avec le cas premier dans les algos.
	
	private boolean oriente; 
	private boolean weighted;
	// faire en sorte dans le constructeur que la liste soit bien défini(par exemple qu'il n'y a pas de sommet weight et normal dans une même liste)
	public GraphList(ArrayList<Sommet<T>> tab,int n,boolean oriente,boolean weighted) {
		this.tab=tab;
		this.n=n;
		this.oriente=oriente;
		this.weighted=weighted;
	}
	public boolean getOriente() {
		return oriente;
	}
	public boolean getWeighted() {
		return weighted;
	}
	public int getN() {
		return n;
	}
	private int degree(int i) {
		if(1<=i && i<=n) {
			return tab.get(i).getDegree();
		}
		throw new IllegalArgumentException("numero de sommet pas présent"+getClass().getSimpleName());
	}
	@Override
	public String toString() {
		return "";
	}
	
	//implementé un iterateur
	
}
