package com.algo.pile;

import com.algo.list.ListChain;

public class Pile<T> {
    private ListChain<T> pile;

    public Pile() {
        pile = new ListChain<>(true);
    }
    public T sommet() {
        return pile.at(1);
    }
    public void empiler(T val) {
        pile.add_begin(val);
    }
    public void depiler() {
        pile.delete_begin();
    }
    public int get_size() {
        return pile.getSize();
    }
    public String toString() {
        return ""; //faire avec l'itérateur
    }


}
