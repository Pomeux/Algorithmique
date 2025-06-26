

package com.algo.recherche;

import com.algo.tree.BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Recherche {

    public static <T extends Comparable<T>> int  recherche_lineaire_trie(T[] tab,T t) {

        int i=0;
        while(i<tab.length && tab[i].compareTo(t)<0) {
            if(tab[i].equals(t)) {
                return i;
            }
        }
        return -1;
    }
    public static <T extends Comparable<T>> int recherche_lineaire_trie(List<T> tab, T t) {
        int i=0;
        while(i<tab.size() && tab.get(i).compareTo(t)<0) {
            if(tab.get(i).equals(t)) {
                return i;
            }
        }
        return -1;
    }


    public static <T> int  recherche_lineaire(T[] tab,T t) {

        int i=0;
        while(i<tab.length) {
            if(tab[i].equals(t)) {
                return i;
            }
        }
        return -1;
    }
    public static <T> int recherche_lineaire(List<T> tab,T t) {
        int i=0;
        while(i<tab.size()) {
            if(tab.get(i).equals(t)) {
                return i;
            }
        }
        return -1;
    }


    public static <T extends Comparable<T>> int recherche_dichotomique(T[] tab,T t) {

        int median=tab.length/2;
        int debut=0;
        int fin=tab.length-1;

        while(debut<fin) {
            if(tab[median].equals(t)) {
                return median;
            } else if(tab[median].compareTo(t)>0) {
                debut=median+1;
            } else {
                fin=median-1;
            }
        }
        return -1;

    }
    public static <T extends Comparable<T>> int recherche_dichotomique(List<T> tab, T t) {

        int median=tab.size()/2-1;
        int debut=0;
        int fin=tab.size()-1;

        while(debut<fin) {
            if(tab.get(median).equals(t)) {
                return median;
            } else if(tab.get(median).compareTo(t)>0) {
                debut=median+1;
            } else {
                fin=median-1;
            }
        }
        return -1;

    }

    public static <T> int occurence(List<T> tab, T t) {

        int i=0;
        int nb=0;
        while(i<tab.size()) {

            if(tab.get(i).equals(t)) {
                nb+=1;
            }
            i+=1;
        }
        return nb;
    }

    public static <T> int occurence(T[] tab, T t) {

        int i=0;
        int nb=0;
        while(i<tab.length) {

            if(tab[i].equals(t)) {
                nb+=1;
            }
            i+=1;
        }
        return nb;
    }
    public static <T> int recherche_interpolation(List<T> tab, T t) {
        return 0;
    }
    public static <T> int recherche_interpolation(T[] tab, T t) {
        return 0;
    }

    public static <T> boolean recherche_arbre_binaire(BinaryTree<T> tree, T val) {
        if(tree==null)
            return false;
        if(val.equals(tree.getVal()))
            return true;
        return recherche_arbre_binaire(tree.sub_tree_right(),val) || recherche_arbre_binaire(tree.sub_tree_left(),val);
    }
}
