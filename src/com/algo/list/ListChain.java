package com.algo.list;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ListChain<T> implements Iterable<T> {
    private Node<T> begin;
    private Node<T> end;
    private static int compt;
    private final int id;
    static {
        compt++;

    }
    private int size;

    public boolean double_list;

    public ListChain(T val,boolean double_list) {
        this.double_list=double_list;
        this.id=compt;
        if(!double_list)
            begin=new Node<>(val,null);
        else
            begin=new NodeDouble<>(val,null,null);

        end=begin;
        size=1;
    }

    public ListChain(boolean double_list) {
        this.double_list=double_list;
        this.id=compt;
    }

    public T at(int i) {
        int d=1;
        Node<T> node=begin;
        if(0<i &&i<size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        while(d<i) {
            node=node.getNext();
            d++;
        }

        return node.getVal();
    }
    public void set(T val,int i) {
        int d=1;
        Node<T> node=begin;
        if(0<i &&i<size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        while(d<i) {
            node=node.getNext();
            d++;
        }

        node.setVal(val);
    }


    public void add(T val,int i) {
        if (i > size) {
            throw new IllegalArgumentException("Illegal index");
        } else if (i == 0) {
            add_begin(val);
            return;
        } else if (i == size) {
            add_end(val);
            return;
        }
        if (double_list) {
            int d = 1;
            NodeDouble<T> new_node;
            NodeDouble<T> node;
            if (depart_begin(i)) {

                node = (NodeDouble<T>) begin;
                while (d < i) {
                    node = (NodeDouble<T>) node.getNext();
                    d++;
                }



            } else {

                d = size;
                node = (NodeDouble<T>) end;
                while (d > i) {
                    node = node.getPrevious();
                    d--;
                }


            }
            new_node = new NodeDouble<T>(val, (NodeDouble<T>) node.getNext(), node);
            ((NodeDouble<T>) node.getNext()).setPrevious(new_node);
            node.setNext(new_node);


        } else {
            Node<T> node=begin;
            Node<T> new_node;
            int d=1;
            while(d<i) {
                node =node.getNext();
                d++;
            }
            new_node = new Node<>(val,  node.getNext());
            node.setNext(new_node);
        }
        size++;
    }

    private boolean depart_begin(int i) {

        int distance_end=size-i;
        return i<=distance_end;

    }

    public void add_end(T val) {
        if(begin==null) {
            if(!double_list)
                begin = new Node<>(val, null);
            else
                begin=new NodeDouble<>(val,null,null);
            end=begin;
        } else {
            if(!double_list) {
                Node<T> node=new Node<>(val,null);
                end.setNext(node);
                end=node;
            } else {
                NodeDouble<T> node=new NodeDouble<T>(val,null,(NodeDouble) end);
                end.setNext(node);
                end=node;
            }


        }
        size+=1;
    }
    public void add_begin(T val) {
        if(begin==null) {
           add_end(val);
        } else {
            if(double_list) {
                NodeDouble<T> node=new NodeDouble<T>(val,(NodeDouble) begin,null);
                ((NodeDouble<T>) begin).setPrevious(node);
                begin=node;
            } else {
                Node<T> node=new Node(val,begin);
                begin=node;
            }
            size+=1;
        }

    }
    public void delete_begin() {

        if(begin==null) {
            throw new NoSuchElementException("Liste Vide");
        }

        begin=begin.getNext();
        if(double_list) {
            ((NodeDouble<T>) begin).setPrevious(null);
        }
        size--;
    }
    public void delete_end() {

        if(begin==null) {
            throw new NoSuchElementException("Liste Vide");
        }
        if(begin.getNext()==null) {
            delete_begin();
        }
        if(double_list) {


            end=((NodeDouble<T>) end).getPrevious();

            end.setNext(null);
        } else {
             Node<T> node=begin;


             while(node.getNext().getNext()!=null) {
                 node=node.getNext();
             }
             node.setNext(null);
             System.out.println(node.getVal());
             end=node;
        }
        size--;
    }
    public void delete(T val) {

    }
    public boolean est_vide() {
        return size==0;
    }
    public void delete(int i) {
        if(begin==null) {
            throw new NoSuchElementException("Liste Vide");
        }

        if( i<1|| i>size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        else if(i==1) {
            delete_begin();
            return;
        } else if(i==size) {
            delete_end();
            return;
        }
        if(double_list) {
            int d=1;
            NodeDouble<T> node=null;

            if(depart_begin(i)) {
                node=(NodeDouble<T>) begin;

                while(d<i-1) {
                    d++;
                  node=(NodeDouble<T>) node.getNext();
                }
                ((NodeDouble<T>) node.getNext().getNext()).setPrevious(node);
                node.setNext(node.getNext().getNext());
            } else {
                node=(NodeDouble<T>) end;
                d=size;
                while(d>i+1) {
                    d--;
                    node=(NodeDouble<T>) node.getPrevious();
                }
                node.getPrevious().getPrevious().setNext(node);
                node.setPrevious(node.getPrevious().getPrevious());
                System.out.println("a");
            }



        } else {
            Node<T> node=begin;
            int d=1;

            while(d<i-1) {
                d++;
                node=node.getNext();
            }

            node.setNext(node.getNext().getNext());
        }

    size--;

    }

    public void  inverser() {

    }

    public static ListChain inverser(ListChain l1) {

        return null;
    }

    public int getSize() { return size;}
    public Iterator<T> iterator() {
        return null;
    }
    private int getId() {
        return id;
    }
    @Override
    public boolean equals(Object obj) {
        if(this==obj)
            return true;
        if(obj==null)
            return false;
        if(!(obj instanceof ListChain))
            return false;
        ListChain<T> l=(ListChain<T> ) obj;
        return l.getId()==id && begin==l.begin && end==l.end; //regler
    }

    @Override
    public String toString() {
        //changer les tostring pour que ça soit des string modulable
        return begin.toString()+ " size:"+size;
    }


}