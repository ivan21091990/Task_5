package com.itProger;

public class ArithmeticOperations {

        public void addition(double x, double y){
            System.out.printf(x + " + " + y + " = %.4f", (x + y));
        }

        public  void subtraction(double x, double y){
            System.out.printf(x + " - " + y + " = %.4f", (x - y));
        }

        public  void multiplication(double x, double y){
            System.out.printf(x + " * " + y + " = %.4f", (x * y));
        }

        public void  division(double x, double y) throws Exception{System.out.printf(x + " / " + y + " = %.4f", (x / y));
                throw new Exception("На 0 делить нельзя");
        }
}


