package com.javarush.task.pro.task13.task1316;

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        JavarushQuest[] javaRushQuests = JavarushQuest.values();
        for (JavarushQuest quest : javaRushQuests) {
            System.out.println(quest.ordinal());
        }
    }
}
