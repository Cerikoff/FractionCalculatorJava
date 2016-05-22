package ru.croc.calculator.fraction.util;

/**
 * Created by Igor Serikov on 22.05.2016.
 */
import ru.croc.calculator.fraction.Fraction;

public class FractionOperations {

    private FractionOperations() {
    }

    public static Fraction plus(Fraction a, Fraction b) {
        int newNom = a.getNom() * b.getDen() + b.getNom() * a.getDen();
        int newDen = a.getDen() * b.getDen();
        return new Fraction(newNom, newDen);
    }

    public static Fraction minus(Fraction a, Fraction b) {
        int newNom = a.getNom() * b.getDen() - b.getNom() * a.getDen();
        int newDen = a.getDen() * b.getDen();
        return new Fraction(newNom, newDen);
    }

    public static Fraction multiplication(Fraction a, Fraction b)   {
        int newNom = a.getNom() * b.getNom();
        int newDen = a.getDen() * b.getDen();
        return new Fraction(newNom, newDen);
    }

    public static Fraction division(Fraction a, Fraction b)   {
        int newNom = a.getNom() * b.getDen();
        int newDen = a.getDen() * b.getNom();
        return new Fraction(newNom, newDen);
    }

}
