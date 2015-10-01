package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DecimalCollectionTest {

    private DecimalCollection decimalCollection;

    @Before
    public void before() {
        decimalCollection = new DecimalCollection();
    }

    @Test
    public void addTest() {
        assertEquals(0, decimalCollection.size());
        decimalCollection.add(1.14);
        assertEquals(1, decimalCollection.size());
        decimalCollection.add(12.65);
        assertEquals(2, decimalCollection.size());
        decimalCollection.add(5.78);
        assertEquals(3, decimalCollection.size());
    }

    @Test
    public void sizeTest() {
        assertEquals(0, decimalCollection.size());
        decimalCollection.add(18.29);
        assertEquals(1, decimalCollection.size());
        decimalCollection.add(56.215);
        assertEquals(2, decimalCollection.size());
        decimalCollection.add(3.1789);
        assertEquals(3, decimalCollection.size());
    }

    @Test
    public void sumTest() {
        assertEquals(0.0, decimalCollection.sum(), 10e-3);
        decimalCollection.add(1);
        assertEquals(1.0, decimalCollection.sum(), 10e-3);
        decimalCollection.add(2.5);
        assertEquals(3.5, decimalCollection.sum(), 10e-3);
        decimalCollection.add(3);
        assertEquals(6.5, decimalCollection.sum(), 10e-3);
    }

    @Test
    public void higherTest() {
        assertEquals(Double.NEGATIVE_INFINITY, decimalCollection.higher(), 10e-3);
        decimalCollection.add(1.17);
        assertEquals(1.17, decimalCollection.higher(), 10e-3);
        decimalCollection.add(0.5);
        assertEquals(1.17, decimalCollection.higher(), 10e-3);
        decimalCollection.add(35.89);
        assertEquals(35.89, decimalCollection.higher(), 10e-3);
    }
}
