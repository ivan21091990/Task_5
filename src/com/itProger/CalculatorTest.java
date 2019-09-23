package com.itProger;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    @Test
    public void addOperationCheck() {
        ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
        double result = arithmeticOperations.addition(12.122,15);
        assertThat(result, is(27.122));
    }

    @Test
    public void operationCheckSubtraction() {
        ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
        double result = arithmeticOperations.subtraction(14.166,11.066);
        assertThat(result, is(3.1));
    }

    @Test
    public void multiplicationOperationCheck() {
        ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
        double result = arithmeticOperations.multiplication(14.2,2);
        assertThat(result, is(28.2));
    }

    @Test
    public void divisionCheckOperation() {
        ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
        double result = arithmeticOperations.division(9.99,3.3);
        assertThat(result, is(3.0272));
    }

    @Test(expected = IllegalArgumentException.class)
    public  void checkingExceptions() throws IllegalArgumentException {
        ArithmeticOperations calculator = new ArithmeticOperations();
        calculator.division(12.23,0);
    }
}