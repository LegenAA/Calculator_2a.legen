package com.calculator;

public class RomanResult {

    public String RomResult (int a){
        String i[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String x[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String c[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};

        String ones = i[a%10];
        String tens = x[(a%100)/10];
        String hundereds = c[(a%1000)/100];

        String result = hundereds + tens + ones;
        return result;
    }

}
