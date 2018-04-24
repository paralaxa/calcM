package sk.stopangin.calc.impl;

import org.junit.Before;
import org.junit.Test;
import sk.stopangin.calc.BusinessException;
import sk.stopangin.calc.CalcService;

import static org.junit.Assert.assertEquals;

public class CalcServiceImplWithExceptionHandlingTest {

    private CalcService calc;

    @Before
    public void setUp() throws Exception {
//        calc = new CalcServiceImpl_1();
        calc = new CalcServiceImplWithExceptionHandling();
    }

    @Test
    public void divide() throws Exception {
        assertEquals(calc.divide(1, 2), 0.5, 0);
    }

//    @Test(expected = BusinessException.class)
    public void divide_with_zero_expect_exception() throws Exception {
        calc.divide(1, 0);
    }

}
