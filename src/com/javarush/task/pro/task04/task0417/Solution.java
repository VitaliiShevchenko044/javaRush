package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Скорость ветра
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speedOfWind = scanner.nextInt();
        int x = (int) Math.round(3.6 * speedOfWind);
        System.out.println(x);

    }
}