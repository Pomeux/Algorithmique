package com.algo.list;

import java.util.Iterator;

public class ListChain<T> implements Iterable<T> {
    private Node<T> debut;
    private Node<T> fin;
    private T val;
    private int size;



    public ListChain(T val) {
        this.val=val;
        debut=new Node<T>(val,null);
        fin=debut;
        size=1;
    }
    public ListChain() {

    }
    public void add(T val) {
        if(debut==null) {
            debut = new Node(val, null);
            fin=debut;
        } else {
            Node<T> node=new Node(val,null);
            fin.setNext(node);
            fin=node;
        }
        size+=1;
    }
    public void delete(T val) {

    }
    public void delete(int i) {

    }
    public Iterator<T> iterator() {
        return null;
    }
    public String toString() {
        return "";
    }

}