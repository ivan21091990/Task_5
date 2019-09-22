package com.itProger;

import java.util.Scanner;

public class ConsoleInput {
    Scanner scanner = new Scanner(System.in);
    boolean replay;
    public  char getOperation(){
        char operation;
        System.out.println("Доступные операции: ");
        System.out.print("+\n-\n*\n/\n");
        System.out.print("Выберите операцию: ");

        do {
            replay=true;
            operation = scanner.next().charAt(0);
            if (operation == '-' | operation == '/' | operation == '*' | operation ==  '+') {
                replay = true;
            }
            else {
                replay = false;
                System.out.println("Такой операции нет.Повторите ввод:");
            }
        }while (replay == false);
        return operation;
    }

        public double getDouble(){
            double number;

        while (true) {
            System.out.println("Введите число:");
            String str = scanner.nextLine();
            try {
                number = Double.parseDouble(str);
                break;
            } catch (Exception e) {
                System.out.println("Упс. Вы ввели не число. Попробуйте еще раз. ");
            }
        }
            return number;
//        if(scanner.hasNextDouble()){
//            number = scanner.nextDouble();
//        } else {
//            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
//            scanner.next();
//            number = getDouble();
//        }

    }
}
