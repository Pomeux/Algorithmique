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

    //à factoriser
    public void add(T val,int i) {
        //  faire puis factoriser les autres



        if(i>size) {
            throw new IllegalArgumentException("Illegal index");
        } else if(i==0) {
            addDebut(val);
            return;
        } else if(i==size) {
            addFin(val);
            return;
        }
        if(double_liste) {
            // if(depart_debut(i)) {
                int d=0;
                NodeDouble<T> node = (NodeDouble<T>) debut;
                while (d < i-1) {
                    node = (NodeDouble<T>) node.getNext();
                    d++;
                }
            NodeDouble<T> new_node = null;

                new_node = new NodeDouble<T>(val, (NodeDouble<T>) node.getNext(), node);
                node.setNext(new_node);

            if (i == 0) {
                debut = new_node;
            }
            if (i == size) {
                fin = new_node;
            }
            //} else {

            //}
        }
        /*
//modifie pour mettre ajout debut et ajout fin
        if(double_liste) {
            // if (depart_debut(i)) {
            int d = 0;
            NodeDouble<T> node = (NodeDouble<T>) debut;
            while (d < i-1) { //faut que ça s'arre^tete avant
                node = (NodeDouble<T>) node.getNext();
                d++;
            }

            NodeDouble<T> new_node = null;
            if (node != null && node.getNext() != null) {
                new_node = new NodeDouble<T>(val, (NodeDouble<T>) node.getNext(), node);
                node.setNext(new_node);

            } else if (node == null) {

                new_node = new NodeDouble<T>(val, null, null);
            } else {
                new_node = new NodeDouble<T>(val, null, node);
                node.setNext(new_node);
            }

            if (i == 0) {
                debut = new_node;
            }
            if (i == size) {
                fin = new_node;
            }
        }

          /*  } else {
                int d=size;
                NodeDouble<T> node= (NodeDouble<T>) fin;
                while(d>i) {

                }
            }*/
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