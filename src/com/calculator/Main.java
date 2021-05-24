package com.calculator;

import java.util.Scanner;

public class Main {
    static int a;
    static int b;

    public static void main(String[] args) {
        String text = "Вас приветствует калькулятор 2a.legen!!!\n"+
        "Калькулятор производит операции сложения, вычитания, умножения и деления.\n"+
        "Выражение для вычисления вводятся в следующих форматах:\n"+
        "a + b либо a - b либо a * b либо a / b (обратите внимание на пробелы между символами)\n"+
        "где a и b - целые арабские цифры от 1 до 10, либо римские цифры от I до X\n"+
        "ВНИМАНИЕ: не допускается использование в одном выражении цифр разных систем (арабские и римские)!";
        System.out.println(text);

        Scanner in = new Scanner (System.in);

        do {
            try {
                System.out.println("Введите выражение ниже (для выхода введите - exit):");
                String input = in.nextLine();
                if (input.equalsIgnoreCase("exit")) break;
                String[] inputparts = input.split(" ");
                int l = inputparts.length;
                if (l > 3) {
                    System.out.println("Превышено количество элементов выражения!\nПриложение остановлено.");
                    break;
                }

                Analys a1 = new Analys();
                a1.inputanalys = inputparts[0];
                boolean aq1 = a1.AorR(a1.inputanalys);

                Analys a2 = new Analys();
                a2.inputanalys = inputparts[2];
                boolean aq2 = a2.AorR(a2.inputanalys);

                if (aq1) {
                    Arabic ar1 = new Arabic();
                    ar1.inputarabic = a1.inputanalys;
                    a = ar1.ArabicOutput(ar1.inputarabic);
                } else {
                    Roman ro1 = new Roman();
                    ro1.romaninput = a1.inputanalys;
                    a = ro1.RomanOutput(ro1.romaninput);
                }

                if (aq2) {
                    Arabic ar2 = new Arabic();
                    ar2.inputarabic = a2.inputanalys;
                    b = ar2.ArabicOutput(ar2.inputarabic);
                } else {
                    Roman ro2 = new Roman();
                    ro2.romaninput = a2.inputanalys;
                    b = ro2.RomanOutput(ro2.romaninput);
                }

                if (a == -1) {
                    System.out.println("Неверное значение числа a!\nПриложение остановлено.");
                    break;
                }

                if (b == -1) {
                    System.out.println("Неверное значение числа b!\nПриложение остановлено.");
                    break;
                }

                if (!aq1&aq2 | aq1&!aq2) {
                    System.out.println("Неверный формат ввода выражения!\nПриложение остановлено.");
                    break;
                }

                Operation c1 = new Operation();
                int c = c1.Oper(a, b, inputparts[1]);

                if (c == 1234567890) break;

                if (!aq1 | !aq2) {
                    RomanResult cstr = new RomanResult();
                    String cstr1 = cstr.RomResult(c);
                    System.out.println("Результат вычисления: " + cstr1);
                }
                else {
                    System.out.println("Результат вычисления: " + c);
                }
            } catch (Exception ex){
                System.out.println("Неверный формат ввода выражения!\nПриложение остановлено.");
                break;
            }
        }
        while (true);
    }
}