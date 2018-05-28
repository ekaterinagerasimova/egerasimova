package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean a: data) {
            if (!a) {
                result =  false;
            }
        }
        return result;
    }
}
