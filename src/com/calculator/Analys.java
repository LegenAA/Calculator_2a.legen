package com.calculator;

public class Analys {
    public String inputanalys;

    public boolean AorR (String inputanalys) {
        switch (inputanalys) {
            case "0":
            case "10":
            case "9":
            case "8":
            case "7":
            case "6":
            case "5":
            case "4":
            case "3":
            case "2":
            case "1":
                return true;
            default:
                return false;
        }
    }
}
