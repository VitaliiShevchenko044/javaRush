package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers;
        if (n > 0) {
            numbers = new int[n];
            for (int i = 0; i < n; i++)
                numbers[i] = scanner.nextInt();
            if (n % 2 != 0) {
                for (int i = 0; i < numbers.length; i++)
                    System.out.println(numbers[i]);
            } else {
                for (int i = numbers.length - 1; i >= 0; i--)
                    System.out.println(numbers[i]);
            }
        }
        scanner.close();
    }
}
