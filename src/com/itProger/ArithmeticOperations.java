package com.itProger;

public class ArithmeticOperations {

        public double addition(double x, double y){
            System.out.printf(x + " + " + y + " = %.4f", (x + y));
            return x+y;
        }

        public double subtraction(double x, double y){
            System.out.printf(x + " - " + y + " = %.4f", (x - y));
            return x-y;
        }

        public double multiplication(double x, double y){
            System.out.printf(x + " * " + y + " = %.4f", (x * y));
            return x * y;
        }

        public double division(double x, double y) throws IllegalArgumentException {
            if (y == 0){
                throw new IllegalArgumentException("На 0 делить нельзя");
            }
            System.out.printf(x + " / " + y + " = %.4f", (x / y));
            return x/y;
        }
}


