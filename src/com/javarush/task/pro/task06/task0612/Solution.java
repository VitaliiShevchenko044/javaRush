package com.javarush.task.pro.task06.task0612;

/* 
У всего есть корень
*/

public class Solution {
    public static void main(String[] args) {
        int[] array = {15,64,9,51,42};
        printSqrt(array);
    }

    public static void printSqrt(int[] array) {
        String printElementSqrt = "Корень квадратный для числа ";
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            double elementSqrt = Math.sqrt(element);
            System.out.println(printElementSqrt + element + " равен " + elementSqrt);
        }
    }
}
