package com.itProger;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CalculatorTest {

    @org.junit.Test
    public void addOperationCheck() {
        ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
        double result = arithmeticOperations.addition(12.1,15);
        assertThat(result, is(27.1));
    }
}