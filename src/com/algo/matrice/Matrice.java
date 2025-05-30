package com.algo.matrice;

public class Matrice {
	private double[][] matrice;
	
	private int ligne;
	private int colonne;
	
	//faire en sorte que matrice soit bien défini(car là on peut avoir [[5,1,3] [1,3]]
	
	public Matrice(double[][] matrice) {
		this.matrice=matrice;
		ligne=matrice.length;
		colonne=matrice[0].length;

		for(int i=0;i<ligne;i++) {
			if(matrice[i].length!=colonne) {
				throw new IllegalArgumentException("Mauvaise initialisation d'une matrice, taille différente pour la colonne "+i+" "+getClass().getSimpleName());
			}
		}
	}
	public Matrice(int ligne, int colonne,double val) {
		//T[][] matrice=new T[ligne][colonne];

		this.ligne=ligne;
		this.colonne=colonne;
		matrice=new double[ligne][colonne];
		for(int i=0;i<ligne;i++) {
			for(int j=0;j<colonne;j++) {
				matrice[i][j]=val;
			}
		}
	}


	public Matrice(int ligne, int colonne) {
		this.ligne=ligne;
		this.colonne=colonne;
		matrice=new double[ligne][colonne];
	}

	public double get(int i,int j) {
		
		if(1<=i && i<=ligne && 1<=j &&j<=colonne) 		
			return matrice[i-1][j-1];
		throw new IllegalArgumentException("ligne ou colonne a pas la bonne dimension de la matrice"+ getClass().getSimpleName());
	}
	public void somme(Matrice M2) {
		if(colonne== M2.colonne && ligne==M2.ligne) {
			for(int i=0;i<ligne;i++) {
				for(int j=0;j<colonne;j++) {
					matrice[i][j]=matrice[i][j]+M2.matrice[i][j];
				}
			}
		} else {
			throw new IllegalArgumentException("Les matrices n'ont pas le même nombre de ligne et de colonne"+getClass().getSimpleName());
		}
	}
	public static Matrice somme(Matrice M1,Matrice M2) {
		double[][] M=new double[M1.ligne][M1.colonne];
		if(M1.colonne== M2.colonne && M1.ligne==M2.ligne) {

			for(int i=0;i<M1.ligne;i++) {
				for(int j=0;j<M1.colonne;j++) {
					M[i][j]=M1.matrice[i][j]+M2.matrice[i][j];
				}
			}
		} else {
			throw new IllegalArgumentException("Les matrices n'ont pas le même nombre de ligne et de colonne");
		}
		return new Matrice(M);
	}
	public void soustraction(Matrice M2) {
		if(colonne== M2.colonne && ligne==M2.ligne) {
			for(int i=0;i<ligne;i++) {
				for(int j=0;j<colonne;j++) {
					matrice[i][j]=matrice[i][j]-M2.matrice[i][j];
				}
			}
		} else {
			throw new IllegalArgumentException("Les matrices n'ont pas le même nombre de ligne et de colonne"+getClass().getSimpleName());
		}
	}
	public static Matrice soustraction(Matrice M1,Matrice M2) {
		double[][] M=new double[M1.ligne][M1.colonne];
		if(M1.colonne== M2.colonne && M1.ligne==M2.ligne) {

			for(int i=0;i<M1.ligne;i++) {
				for(int j=0;j<M1.colonne;j++) {
					M[i][j]=M1.matrice[i][j]-M2.matrice[i][j];
				}
			}
		} else {
			throw new IllegalArgumentException("Les matrices n'ont pas le même nombre de ligne et de colonne");
		}
		return new Matrice(M);
	}

	public Matrice transpose() {
		Matrice trans=new Matrice(colonne,ligne);

		for(int i=0;i<ligne;i++) {
			for(int j=0;j<colonne;j++) {
				trans.matrice[i][j]=matrice[j][i];
			}
		}
		return trans;
	}
	//matrice M1_m,n et M2_n,p donne M3_m,p
	public void multiplication(Matrice M2) {
		double[][] M=new double[ligne][M2.colonne];
		if(colonne==M2.ligne) {

			for(int m=0;m<ligne;m++) {
				for(int p=0;p<M2.colonne;p++) {
					double sum=0;
					for(int n=0;n<colonne;n++) {
						sum+=matrice[m][n]*M2.matrice[n][p];
					}
					M[m][p]=sum;
				}
			}
		matrice=M;

		} else {
			throw new IllegalArgumentException("Produit impossible");
		}
	}

	public static Matrice multiplication(Matrice M1,Matrice M2) {
		double[][] M=new double[M1.ligne][M2.colonne];
		if(M1.colonne==M2.ligne) {

			for(int m=0;m<M1.ligne;m++) {
				for(int p=0;p<M2.colonne;p++) {
					double sum=0;
					for(int n=0;n<M1.colonne;n++) {
						sum+=M1.matrice[m][n]*M2.matrice[n][p];
					}
					M[m][p]=sum;
				}
			}
			return new Matrice(M);

		} else {
			throw new IllegalArgumentException("produit impossible"); //à modif
		}
	}
	public String toString() {
		String s="";
		
		for(int i=0;i<ligne;i++) {
			for(int j=0;j<colonne;j++) {
				s+= ""+matrice[i][j]+" ";
			}
			s+="\n";
		}
		return s;
	}
}
