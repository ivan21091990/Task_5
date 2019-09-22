package com.itProger;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CalculatorTest {

    @org.junit.Test
    public void addOperationCheck() {
        ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
        double result = arithmeticOperations.addition(12.1,15);
        assertThat(result, is(27.1));
    }
    @Test(expected = ArithmeticException.class)
    public  void checkingExceptions() throws Exception {
        ArithmeticOperations calculator = new ArithmeticOperations();
        calculator.division(12.23,0);

    }

}