package com.algo.list;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ListChain<T> implements Iterable<T> {
    private Node<T> debut;
    private Node<T> fin;
    private T val;

    private int size;

    public boolean double_liste;

    public ListChain(T val,boolean double_liste) {
        this.val=val;
        this.double_liste=double_liste;
        if(!double_liste)
            debut=new Node<T>(val,null);
        else
            debut=new NodeDouble<T>(val,null,null);

        fin=debut;
        size=1;
    }
    public ListChain(boolean double_liste) {
        this.double_liste=double_liste;
    }
    public void addFin(T val) {
        if(debut==null) {
            if(!double_liste)
                debut = new Node<T>(val, null);
            else
                debut=new NodeDouble<T>(val,null,null);
            fin=debut;
        } else {
            if(!double_liste) {
                Node<T> node=new Node<T>(val,null);
                fin.setNext(node);
                fin=node;
            } else {
                NodeDouble<T> node=new NodeDouble<T>(val,null,(NodeDouble) fin);
                fin.setNext(node);
                fin=node;
            }


        }
        size+=1;
    }
    public void addDebut(T val) {
        if(debut==null) {
           addFin(val);
        } else {
            if(!double_liste) {

            } else {

            }
            size+=1;
        }

    }
    public void deleteDebut() {

        if(debut==null) {
            throw new NoSuchElementException("Liste Vide");
        }
        Node<T> node=debut.getNext();
        if(node==null) {
            debut=node;
            if(node instanceof NodeDouble<T>) {
                NodeDouble nodeDouble=(NodeDouble)node;
                nodeDouble.setPrevious(null);
            }

        }
    }
    public void deleteFin() {

        if(debut==null) {
            throw new NoSuchElementException("Liste Vide");
        }
        if(debut instanceof NodeDouble<T>) {

        } else {

        }

    }
    public void delete(T val) {
        Node<T> node=debut;
        if(debut==null) {
            throw new NoSuchElementException("Liste Vide");
        }

        if(debut.getVal()==val) {


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
    private int getSize() { return size;}
    public Iterator<T> iterator() {
        return null;
    }
    public String toString() {
        //changer les tostring pour que ça soit des string modulable
        return debut.toString()+ " size:"+size;
    }


}