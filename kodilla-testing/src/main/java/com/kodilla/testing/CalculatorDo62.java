package com.kodilla.testing;
public class CalculatorDo62 {
    public void Calculator() {

    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
    public static void main(String[] args) {
        CalculatorDo62 myCalculator = new CalculatorDo62();
        System.out.println(myCalculator.add(5, 7));
        System.out.println(myCalculator.subtract(45, 11));

    }
}