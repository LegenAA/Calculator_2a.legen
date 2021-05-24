package com.calculator;

public class Operation {
    public int Oper (int a, int b, String znak){
        int c;
        switch (znak){
            case "+":
                c = a + b;
                break;
            case "-":
                c = a - b;
                break;
            case "*":
                c = a * b;
                break;
            case "/":
                c = a / b;
                break;
            default:
                System.out.println("Неверный арифметический знак!\nПриложение остановлено.");
                c = 1234567890;
                break;
        }
        return c;
    }
}
