package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        for (boolean a: data) {
            if (!a) {
                return false;
            }
        }
        return true;
    }
}
