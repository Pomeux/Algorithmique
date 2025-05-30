package com.algo.matrice;

public class MatriceCarre extends Matrice {

    public MatriceCarre() {
        super(0,0);
    }
    public double trace() {
        return 9;
    }
    public double[] valeurPropre() {
        return null;
    }
    public boolean estValeurPropre() {
        return false;
    }
    public double determinant() {
        return 0;
    }
    public Matrice inverse() {
        return null;
    }
    public boolean possedeInverse() {
        return false;
    }

}
