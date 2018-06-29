package sk.stopangin.calc.impl;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import sk.stopangin.calc.CalcService;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
//test
@RunWith(JUnitParamsRunner.class)
public class CalcServiceImpl_1_ParametrizedTest {
    private CalcService calc;
//test
    @Parameterized.Parameters(name = "{index}: add({0}+{1})={2}")
    public static Collection<Object[]> dataForAdd() {
        return Arrays.asList(new Object[][]{
                {1.0, 1.0, 2.0}, {2.0, 1.0, 3.0}, {3.0, 2.0, 5.0}, {4.0, 3.0, 7.0}, {5.0, 5.0, 10.0}, {6.0, 8.0, 14.0}
        });
    }
//test2
    @Parameterized.Parameters(name = "{index}: subtract({0}+{1})={2}")
    public static Collection<Object[]> dataForSubstraction() {
        return Arrays.asList(new Object[][]{
                {1.0, 1.0, 0.0}, {2.0, 1.0, 1.0}, {3.0, 2.0, 1.0}, {4.0, 3.0, 1.0}, {5.0, 5.0, 0.0}, {6.0, 8.0, -2.0}
        });
    }
//test cf-118
//test
    @Before
    public void setUp() throws Exception {
        calc = new CalcServiceImpl_1();
    }

    @Test
    @Parameters(method = "dataForAdd")
    public void add(double x, double y, double result) throws Exception {
        assertEquals(calc.add(x, y), result, 0);
    }

    @Test
    @Parameters(method = "dataForSubstraction")
    public void subtract(double x, double y, double result) throws Exception {
        assertEquals(calc.substract(x, y), result, 0);

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
