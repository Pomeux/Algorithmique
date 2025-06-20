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

    public T at(int i) {
        int d=1;
        Node<T> node=debut;
        if(0<i &&i<size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        while(d<i) {
            node=node.getNext();
            d++;
        }

        return node.getVal();
    }

    //à factoriser
    public void add(T val,int i) {
        //  faire puis factoriser les autres


        if (i > size) {
            throw new IllegalArgumentException("Illegal index");
        } else if (i == 0) {
            addDebut(val);
            return;
        } else if (i == size) {
            addFin(val);
            return;
        }
        if (double_liste) {
            int d = 1;
            NodeDouble<T> new_node = null;
            NodeDouble<T> node = null;
            if (depart_debut(i)) {
                System.out.println("A"+val);
                node = (NodeDouble<T>) debut;
                while (d < i) {
                    node = (NodeDouble<T>) node.getNext();
                    d++;
                }



            } else {
                System.out.println("B"+val);
                d = size;
                node = (NodeDouble<T>) fin;
                while (d > i) {
                    node = (NodeDouble<T>) node.getPrevious();
                    d--;
                }


            }
            new_node = new NodeDouble<T>(val, (NodeDouble<T>) node.getNext(), node);
            node.setNext(new_node);
        } else {
            Node<T> node=debut;
            Node<T> new_node = null;
            int d=1;
            while(d<i) {
                node =node.getNext();
                d++;
            }
            new_node = new Node<T>(val,  node.getNext());
            node.setNext(new_node);
        }
        size++;
    }

    private boolean depart_debut(int i) {

        int distance_fin=size-i;
        if(i<=distance_fin) {
            return true;
        } else {
            return false;
        }
    }
    //public void add(iterator)

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
            if(double_liste) {
                NodeDouble<T> node=new NodeDouble<T>(val,(NodeDouble) debut,null);
                ((NodeDouble<T>) debut).setPrevious(node);
                debut=node;
            } else {
                Node<T> node=new Node(val,debut);
                debut=node;
            }
            size+=1;
        }

    }
    public void deleteDebut() {

        if(debut==null) {
            throw new NoSuchElementException("Liste Vide");
        }

        debut=debut.getNext();
        if(double_liste) {
            ((NodeDouble<T>) debut).setPrevious(null);
        }
    }
    public void deleteFin() {

        if(debut==null) {
            throw new NoSuchElementException("Liste Vide");
        }
        if(debut.getNext()==null) {
            deleteDebut();
        }
        if(double_liste) {
            fin=((NodeDouble<T>) fin).getPrevious();
            fin.setNext(null);
        } else {
             Node<T> node=debut;


             while(node.getNext().getNext()!=null) {
                 node=node.getNext();
             }
             node.setNext(null);

        }

    }
    public void delete(T val) {
        Node<T> node=debut;
        if(debut==null) {
            throw new NoSuchElementException("Liste Vide");
        }

        if(debut.getVal()==val) {
            debut=debut.getNext();

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
        if(i>size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        else if(i==1) {
            deleteDebut();
            return;
        } else if(i==size) {
            deleteFin();
            return;
        }
        if(double_liste) {

        }
        int d=1;
        while(d<i-1) {

        }


    }

    public void  inverser() {

    }

    public static ListChain inverser(ListChain l1) {

        return null;
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