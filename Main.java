package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите два числа"); // объявление переменных
        Scanner scan = new Scanner(System.in);
        int val1 = 0;
        int val2 = 0;
        while(true) {
            val1 = scan.nextInt();
            if ((val1 >= 100) && (val1 <= 999)) {
                System.out.println("Введите второе число");
                break;
            }
            else {
                System.out.println("Первое число не подходит");
            }
        }
        do {
            val2 = scan.nextInt();
            System.out.println("Второе число не подходит");
        } while ((val2 < 100) || (val2 > 999));
        System.out.print("0 = посчитать кол-во четных/нечетных чисел \n1 = вывести четные/нечетные на экран: ");
        byte choice1 = scan.nextByte();
        int count_even = 0;
        int count_odd = 0;
        int a = 0;
        switch (choice1) {
            case 0:
                for (int i = val1; i <= val2; i++) {
                    a = i;
                    a = a % 2;
                    switch (a) {
                        case 0 -> count_even += 1;
                        case 1 -> count_odd += 1;
                    }
                }
                System.out.println("четные: " + count_even);
                System.out.println("нечетные: " + count_odd);
                break;
            case 1:
                System.out.println("нужны четные или нечетные? 0/1");
                byte choice2 = scan.nextByte();
                switch (choice2) {
                    case 0 -> {
                        for (int i = val1; i <= val2; i++) {
                            a = i;
                            a %= 2;
                            if (a == 0) {
                                System.out.print(i + " ");
                            }
                        }
                    }
                    case 1 -> {
                        for (int i = val1; i <= val2; i++) {
                            a = i;
                            a %= 2;
                            if (a == 1) {
                                System.out.print(i + " ");
                            }
                        }
                    }
                }
                break;
            default:
                System.out.print("ошибка ввода!");
        }
    }
}