package ru.job4j.max;

/**
 * @author egerasimova (evgerasimova13@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Max {
    public int max(int first, int second) {
        int value = (first > second) ? first : second;
        return value;
    }
}