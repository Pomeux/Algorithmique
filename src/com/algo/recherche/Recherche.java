

package com.algo.recherche;

import java.util.ArrayList;

public class Recherche {

    regarder comment voir si une classe générique implémente une interface
    public static <T> int  recherche_lineaire(T[] tab,T t) {

        int i=0;
        while(i<tab.length) {
            if(tab[i].equals(t)) {
                return i;
            }
        }
        return -1;
    }
    public static <T> int recherche_lineaire(ArrayList<T> tab,T t) {
        int i=0;
        while(i<tab.size()) {
            if(tab.get(i).equals(t)) {
                return i;
            }
        }
        return -1;
    }

    public static <T> int recherche_dichotomique(T[] tab,T t) {

        int median=tab.length/2;
        int debut=0;
        int fin=tab.length-1;

        while(debut<fin) {
            if(tab[median].equals(t)) {
                return median;
            } else if(tab[median]<t) {
                debut=median+1;
            } else {
                fin=median-1;
            }
        }
        return -1;

    }
    public static <T> int recherche_dichotomique(ArrayList<T> tab, T t) {

        int median=tab.size()/2-1;
        int debut=0;
        int fin=tab.size()-1;

        while(debut<fin) {
            if(tab.get(median).equals(t)) {
                return median;
            } else if(tab.get(median)<t) {
                debut=median+1;
            } else {
                fin=median-1;
            }
        }
        return -1;

    }
}
