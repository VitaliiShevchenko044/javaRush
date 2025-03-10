package com.javarush.task.pro.task16.task1604;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* 
День недели рождения твоего
*/

public class Solution {

    static Calendar birthDate = new GregorianCalendar(1997, Calendar.DECEMBER, 21);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        //напишите тут ваш код
        return switch (calendar.get(Calendar.DAY_OF_WEEK)) {
            case  Calendar.SUNDAY -> "Воскресенье";
            case  Calendar.MONDAY -> "Понедельник";
            case  Calendar.TUESDAY -> "Вторник";
            case  Calendar.WEDNESDAY -> "Среда";
            case  Calendar.THURSDAY -> "Четверг";
            case  Calendar.FRIDAY -> "Пятница";
            case  Calendar.SATURDAY -> "Суббота";
            default -> throw new IllegalStateException("Unexpected value: " + birthDate.get(Calendar.DAY_OF_WEEK));
        };
    }
}