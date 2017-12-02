package sk.stopangin.calc;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StatefulOneShotCalcTest {

    private static StatefulOneShotCalc calc;


    //    @BeforeClass
    @Before
    public void setUp() throws Exception {
        calc = new StatefulOneShotCalc(2, 1);
    }

    @After
    public void tearDown() throws Exception {
        calc.clearResult();
    }

    @Test
    public void add() throws Exception {
        calc.add();
        assertEquals(calc.getResult(), 3, 0);
    }

    @Test
    public void substract() throws Exception {
        calc.substract();
        assertEquals(calc.getResult(), 1, 0);

    }

}
