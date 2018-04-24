package sk.stopangin.calc.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import sk.stopangin.calc.CalcService;


public class CalcServiceImpl_1Test {
    private CalcService calc;

    @Before
    public void setUp() throws Exception {
        calc = new CalcServiceImpl_1();
    }

    @Test
    public void add() throws Exception {
        assertEquals(calc.add(1, 2), 3, 0);
    }

    @Test
    public void substract() throws Exception {
        assertEquals(calc.substract(1, 2), -1, 0);

    }

    @Test
    public void divide() throws Exception {
        assertEquals(calc.divide(1, 2), 0.5, 0);

    }

    @Test
    public void multiplicate() throws Exception {
        assertEquals(calc.multiplicate(1, 2), 2, 0);

    }

    @Test
    public void log() throws Exception {
        assertEquals(calc.log10(100), 2, 0);
    }
}
