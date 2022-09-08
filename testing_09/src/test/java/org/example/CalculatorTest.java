package org.example;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest extends TestCase {

    private int a;
    private int b;

    @Before
    public void setUp() throws Exception {
        System.out.println("Before");
        a = 2;
        b = 2;
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After");
    }

    @Test
    public void testPlus() {
        var calculator = new Calculator();
        int res = a + b;

        System.out.println("Test plus");
        Assert.assertEquals("2 + 2 = 4?", res, calculator.plus(a, b));
    }

    @Test
    public void testDivide() {
        var calculator = new Calculator();
        double res = (double)a / (double)b;

        System.out.println("Test plus");
        Assert.assertEquals("2 / 2 = 1?", res, calculator.divide(a, b), 0.001);
    }
}