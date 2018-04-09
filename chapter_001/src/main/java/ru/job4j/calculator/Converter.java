package ru.job4j.calculator;

/**
 * Корвертор валюты.
 */
public class Converter {
    private int value;

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        int e = 70;
        this.value = value / e;
        return this.value;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллоры
     */
    public int rubleToDollar(int value) {
        int d = 60;
        this.value = value / d;
        return this.value;
    }
    /**
     * Конвертируем доллоры в рубли.
     * @param value доллоры.
     * @return Рубли
     */
    public int dollarToRuble(int value) {
        int d = 60;
        this.value = value * d;
        return  this.value;
    }
    /**
     * Конвертируем евро в рубли.
     * @param value евро.
     * @return Рубли
     */
    public int euroToRuble(int value) {
        int e = 70;
        this.value = value * e;
        return this.value;
    }
}