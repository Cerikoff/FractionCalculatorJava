package com.company;

public class Fraction {
    private int nom;
    private int den;

    public int getNom() {
        return nom;
    }

    public void setNom(int nom) {
        this.nom = nom;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }

    public Fraction(int nom, int den) {

        this.den = den;
        this.nom = nom;
        euclid();
    }

    private void euclid() {
        int gcdVar = gcd(nom, den);
        if (gcdVar != 1) {
            nom /= gcdVar;
            den /= gcdVar;
        }
    }

    @Override
    public String toString() {
        if(den<0)
            return  -nom + "/" + -den;
        else
            return  nom + "/" + den;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

}
