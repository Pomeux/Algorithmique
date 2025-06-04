package com.algo.list;

public class NodeDouble<T> extends Node<T>{
    private NodeDouble<T> previous;

    public NodeDouble(T val,NodeDouble<T> next,NodeDouble<T> previous) { //inverser next et previous et tout modifier
        super(val,next);
        this.previous=previous;
    }
    public void setPrevious(NodeDouble<T> previous) {
        this.previous = previous;
    }
    public NodeDouble<T> getPrevious() {
        return previous;
    }


    @Override
    public String toString() {
        if(previous==null) return getVal().toString()+getNext().toString();
        if(getNext()==null) return getVal().toString();
        return "<=>"+getVal().toString()+"<=>"+getNext().toString();
    }
}
