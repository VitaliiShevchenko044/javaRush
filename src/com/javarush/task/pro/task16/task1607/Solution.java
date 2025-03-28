package com.javarush.task.pro.task16.task1607;

import java.time.LocalDate;
import java.time.Month;

/* 
Освоение нового API
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        //напишите тут ваш код
        return LocalDate.now();
    }

    static LocalDate ofExample() {
        //напишите тут ваш код
        return LocalDate.of(2020, Month.SEPTEMBER, 12);
    }

    static LocalDate ofYearDayExample() {
        //напишите тут ваш код
        int year = LocalDate.of(2020, Month.SEPTEMBER, 12).getYear();
        int day = LocalDate.of(2020, Month.SEPTEMBER, 12).getDayOfYear();
        return LocalDate.ofYearDay(year, day);
    }

    static LocalDate ofEpochDayExample() {
        //напишите тут ваш код
        return LocalDate.ofEpochDay(LocalDate.of(2020, Month.SEPTEMBER, 12).toEpochDay());
    }
}
