package com.javarush.task.task15.task1522;

public class Earth implements Planet {
    private static Earth instance;

    private Earth() {}

    public static Earth getInstance() {
        if (instance == null) {
            synchronized (Earth.class) {
                if (instance == null)
                    return instance = new Earth();
            }
        }
        return instance;
    }
}
