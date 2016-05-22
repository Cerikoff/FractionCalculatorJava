package ru.croc.calculator.fraction;

import org.junit.Test;
import ru.croc.calculator.fraction.util.FractionOperations;

import static org.junit.Assert.assertEquals;

/**
 * Created by Igor Serikov on 22.05.2016.
 */
public class Tests {

    @Test
    public void testMultiplication(){
        Fraction a = new Fraction(4, 3);
        Fraction b = new Fraction(3, 6);
        assertEquals("2/3", FractionOperations.multiplication(a, b).toString());
    }
    @Test
    public void testDivision(){
        Fraction a = new Fraction(4, 3);
        Fraction b = new Fraction(3, 6);
        try {
            assertEquals("8/3", FractionOperations.division(a, b).toString());
        }
        catch(Exception e){

        }
    }
    @Test
    public void testAddition(){
        Fraction a = new Fraction(4, 3);
        Fraction b = new Fraction(3, 6);
        assertEquals("11/6", FractionOperations.plus(a, b).toString());
    }
    @Test
    public void testSubtraction(){
        Fraction a = new Fraction(4, 3);
        Fraction b = new Fraction(3, 6);
        assertEquals("5/6", FractionOperations.minus(a, b).toString());
    }

}
