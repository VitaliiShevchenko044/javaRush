package com.javarush.task.task13.task1326;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(fileName);
        Scanner scanner = new Scanner(fileInputStream);
        List<Integer> evenNums = new ArrayList<>();
        while (scanner.hasNext()) {
            int value = scanner.nextInt();
            if(value % 2 == 0) evenNums.add(value);
        }

        Collections.sort(evenNums);
        for (Integer value : evenNums) {
            if (value % 2 == 0) {
                System.out.println(value);
            }
        }
        scanner.close();
        reader.close();
    }
}
