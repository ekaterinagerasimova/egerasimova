package ru.job4j.loop;

/**
 * @author egerasimova (evgerasimova13@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Factorial {
    public int calc(int n) {
        int m = 1;
        for (int i = 1; i <= n; i++) {
           m = m * i;
        }
        return m;
    }
}