package com.javarush.task.task15.task1505;

/* 
ООП - исправь ошибки в наследовании
*/

public class Solution {
    public interface HasWeight {
        int getWeight();
    }

    public interface HasHeight {
        int getHeight();
    }

    public static class Human implements HasWeight, HasHeight {
        private int height;
        private int weight;

        @Override
        public int getHeight() {
            if (height > 0)
                return height;
            return 1;
        }

        @Override
        public int getWeight() {
            if (weight > 0)
                return weight;
            return 1;
        }
    }

    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human.getHeight());
        System.out.println(human.getWeight());
    }
}