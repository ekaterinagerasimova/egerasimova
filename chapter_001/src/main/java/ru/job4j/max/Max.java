package ru.job4j.max;

/**
 * @author egerasimova (evgerasimova13@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Max {
    public int max(int first, int second) {
        return first > second ? first : second;
    }
    public int max(int first, int second, int third) {
        int temp = this.max(first, second);
        return Math.max(temp, third);
    }
}