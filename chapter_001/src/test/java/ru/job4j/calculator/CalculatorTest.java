package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author egerasimova (evgerasimova13@gmail.com)
 * @version $Id$
 * @since 04.04.18
 */
public class CalculatorTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        assertThat(result, is(2D));
    }
    @Test
    public void whenDiv2On2Then1() {
        Calculator calc1 = new Calculator();
        calc1.div(2D, 2D);
        double result = calc1.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenSubtract2Minus1Then1() {
        Calculator calc2 = new Calculator();
        calc2.subtract(2D, 1D);
        double result = calc2.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenMiltiple1On1Then1() {
        Calculator calc3 = new Calculator();
        calc3.multiple(1D, 1D);
        double result = calc3.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }
}