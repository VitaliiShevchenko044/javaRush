package com.javarush.task.pro.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Arrays;

/* 
Получение информации по API
*/

public class Solution {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://javarush.ru/api/1.0/rest/projects");
            //напишите тут ваш код
            InputStream input = url.openStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(input));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //InputStream input = url.openStream;
        //byte[] buffer = input.readAllBytes();
        //String str = new String(buffer);
        //System.out.println(str);
    }
}