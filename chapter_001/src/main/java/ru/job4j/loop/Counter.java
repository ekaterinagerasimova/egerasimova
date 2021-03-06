package ru.job4j.loop;

/**
 * @author egerasimova (evgerasimova13@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Counter {

    public int add(int start, int finish) {
        int summa = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                summa += i;
            }
        }
        return summa;
    }
}