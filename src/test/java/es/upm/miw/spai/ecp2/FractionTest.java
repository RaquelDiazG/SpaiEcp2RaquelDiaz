package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {

    private Fraction fraction1; // Fraction 1/1

    private Fraction fraction2; // Fraction 4/2

    private Fraction fraction3; // Fraction 9/2

    @Before
    public void before() {
        fraction1 = new Fraction();
        fraction2 = new Fraction(4, 2);
        fraction3 = new Fraction(9, 2);
    }

    @Test
    public void getNumeratorTest() {
        int numerator1 = fraction1.getNumerator();
        int numerator2 = fraction2.getNumerator();
        int numerator3 = fraction3.getNumerator();
        assertEquals(1, numerator1);
        assertEquals(4, numerator2);
        assertEquals(9, numerator3);
    }

    @Test
    public void getDenominatorTest() {
        int denominator1 = fraction1.getDenominator();
        int denominator2 = fraction2.getDenominator();
        int denominator3 = fraction3.getDenominator();
        assertEquals(1, denominator1);
        assertEquals(2, denominator2);
        assertEquals(2, denominator3);
    }

    @Test
    public void decimalTest() {
        double decimal1 = fraction1.decimal();
        double decimal2 = fraction2.decimal();
        double decimal3 = fraction3.decimal();
        assertEquals(1, decimal1, 10e-3);
        assertEquals(2, decimal2, 10e-3);
        assertEquals(4.5, decimal3, 10e-3);
    }
    
    @Test
    public void isEquivalentTest() {
        Fraction fractionEqui = new Fraction(8,4);
        assertFalse(fraction1.isEquivalent(fraction2));
        assertTrue(fraction2.isEquivalent(fractionEqui));       
    }
    
    
}
