package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PointTest {

    private Point point1; // Point (0,0)

    private Point point2; // Point (4,2)

    private Point point3; // Point (3,3)

    @Before
    public void before() {
        point1 = new Point();
        point2 = new Point(4, 2);
        point3 = new Point(3);
    }

    @Test
    public void getXTest() {
        int x1 = point1.getX();
        int x2 = point2.getX();
        int x3 = point3.getX();
        assertEquals(0, x1);
        assertEquals(4, x2);
        assertEquals(3, x3);
    }

    @Test
    public void getYTest() {
        int y1 = point1.getY();
        int y2 = point2.getY();
        int y3 = point3.getY();
        assertEquals(0, y1);
        assertEquals(2, y2);
        assertEquals(3, y3);
    }

    @Test
    public void moduleTest() {
        double module1 = point1.module();
        double module2 = point2.module();
        double module3 = point3.module();
        assertEquals(0, module1, 10e-3);
        assertEquals(4.47, module2, 10e-3);
        assertEquals(4.24, module3, 10e-3);
    }

    @Test
    public void phaseTest() {
        double phase1 = point1.phase();
        double phase2 = point2.phase();
        double phase3 = point3.phase();
        assertEquals(Double.NaN, phase1, 10e-3);
        assertEquals(0.46, phase2, 10e-3);
        assertEquals(0.79, phase3, 10e-3);
    }

    @Test
    public void translateOriginTest() {
        Point origin = new Point(5, 1);
        point1.translateOrigin(origin);
        point2.translateOrigin(origin);
        point3.translateOrigin(origin);
        assertEquals(-5, point1.getX());
        assertEquals(-1, point1.getY());
        assertEquals(-1, point2.getX());
        assertEquals(1, point2.getY());
        assertEquals(-2, point3.getX());
        assertEquals(2, point3.getY());
    }

    @Test
    public void toStringTest() {
        String string1 = point1.toString();
        String string2 = point2.toString();
        String string3 = point3.toString();
        assertEquals("Point[0,0]", string1);
        assertEquals("Point[4,2]", string2);
        assertEquals("Point[3,3]", string3);
    }
    
    @Test
    public void sumTest() {
        Point sumPoint = point1.sum(point2);
        assertEquals(4, sumPoint.getX());
        assertEquals(2, sumPoint.getY());
    }
    
    @Test
    public void settersTest() {
    	assertEquals(4, point2.getX());
    	assertEquals(2, point2.getY());
    	point2.setX(5);
    	point2.setY(7);
    	assertEquals(5, point2.getX());
    	assertEquals(7, point2.getY());
    }
    
    
}
