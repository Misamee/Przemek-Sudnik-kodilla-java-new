package com.kodilla.testing;

import com.kodilla.testing.CalculatorDo62;

class TestingCalc{
    public static void main(String[] args){
        CalculatorDo62 calculatorDo62 = new CalculatorDo62();

        int result = calculatorDo62.add( 3,3);

        if (result == (6)){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        result = calculatorDo62.subtract( 3,3);

        if (result == (6)){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}