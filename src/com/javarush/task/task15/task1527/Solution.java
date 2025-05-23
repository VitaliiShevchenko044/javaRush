package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        //напишите тут ваш код
        String paramsString = url.substring(url.lastIndexOf("?") + 1);
        String[] splitParams = paramsString.split("&");
        String objValue = null;

        StringBuilder builder = new StringBuilder();
        for (String param : splitParams) {
            String[] paramAndValue = param.split("=");
            builder.append(paramAndValue[0]);
            builder.append(" ");

            if (paramAndValue[0].equals("obj")) {
                objValue = paramAndValue[1];
            }
        }

        System.out.println(builder.toString().trim());

        if(objValue != null) {
            try {
                alert(Double.parseDouble(objValue));
            } catch (NumberFormatException e) {
                alert(objValue);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
