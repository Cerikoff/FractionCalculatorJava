package ru.croc.calculator.fraction.util;

import ru.croc.calculator.fraction.Fraction;

/**
 * Created by Igor Serikov on 22.05.2016.
 */
public class FractionOperations {

    private FractionOperations() {
    }

    /**
     * Return the result of adding two fractions
     *
     * @param  a Fraction - first operand
     * @param  b Fraction - second operand
     * @return Fraction
     * @see    Fraction
     */
    public static Fraction plus(Fraction a, Fraction b) {
        int newNom = a.getNom() * b.getDen() + b.getNom() * a.getDen();
        int newDen = a.getDen() * b.getDen();
        return new Fraction(newNom, newDen);
    }

    /**
     * Return the result of subtracting two fractions
     *
     * @param  a Fraction - first operand
     * @param  b Fraction - second operand
     * @return Fraction
     * @see    Fraction
     */
    public static Fraction minus(Fraction a, Fraction b) {
        int newNom = a.getNom() * b.getDen() - b.getNom() * a.getDen();
        int newDen = a.getDen() * b.getDen();
        return new Fraction(newNom, newDen);
    }

    /**
     * Return the result of multiplying two fractions
     *
     * @param  a Fraction - first operand
     * @param  b Fraction - second operand
     * @return Fraction
     * @see    Fraction
     */
    public static Fraction multiplication(Fraction a, Fraction b)   {
        int newNom = a.getNom() * b.getNom();
        int newDen = a.getDen() * b.getDen();
        return new Fraction(newNom, newDen);
    }

    /**
     * Return the result of division two fractions
     *
     * @param  a Fraction - first operand
     * @param  b Fraction - second operand
     * @return Fraction
     * @see    Fraction
     */
    public static Fraction division(Fraction a, Fraction b)   {
        int newNom = a.getNom() * b.getDen();
        int newDen = a.getDen() * b.getNom();
        return new Fraction(newNom, newDen);
    }

}
