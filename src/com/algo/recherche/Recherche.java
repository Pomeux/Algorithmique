
/*
package com.algo.recherche;

public class Recherche<T> {



    public static int recherche_lineaire(T[] tab,T t) {
        ArrayList<T> s=new ArrayList<T>(2);

        int i=0;
        while(i<tab.length) {
            if(tab[i].equals(t)) {
                return i;
            }
        }
        return -1;
    }
    public static int recherche_lineaire(Array<T>[] tab,T t) {
        int i=0;
        while(i<tab.length) {
            if(tab[i].equals(t)) {
                return i;
            }
        }
        return -1;
    }

    public static int recherche_dichotomique(T[] tab,T t) {

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
    public static int recherche_dichotomique(Array<T> tab,T t) {

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
}
*/