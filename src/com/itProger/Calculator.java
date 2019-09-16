package com.itProger;

public class Calculator {
    public static void main(String[] args) {

        ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
        ConsoleInput consoleInput = new ConsoleInput();

        double x = consoleInput.getDouble();
        double y = consoleInput.getDouble();
        char z = consoleInput.getOperation();

            switch (z) {
                case '+':
                    arithmeticOperations.addition(x, y);
                    break;
                case '-':
                    arithmeticOperations.subtraction(x, y);
                    break;
                case '*':
                    arithmeticOperations.multiplication(x, y);
                    break;
                case '/':
                        arithmeticOperations.division(x, y);
                    break;
            }
        }
    }



