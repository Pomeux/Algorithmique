package com.algo.list;

import java.util.Iterator;
import java.util.NoSuchElementException;

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
    public void deleteDebut() {

    }
    public void deleteFin() {

        if(debut==null) {
            throw new NoSuchElementException("a");
        }
        if(debut instanceof NodeDouble<T>) {

        } else {

        }

    }
    public void delete(T val) {
        Node<T> node=debut;
        if(debut==null) {
            throw new NoSuchElementException("a");
        }

        if(debut.getVal()==val) {
            gerer ce cas
        }

        while(!node.getNext().getVal().equals(val)) {
            node=node.getNext();
        }
        if( node.getNext().getNext()==null && node instanceof NodeDouble<T>) {
            NodeDouble<T> n= (NodeDouble<T>) node.getNext().getNext();
            n.setPrevious( (NodeDouble<T>) node);
        }
        node.setNext(node.getNext().getNext());
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