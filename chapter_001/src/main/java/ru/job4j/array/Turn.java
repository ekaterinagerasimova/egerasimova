package ru.job4j.array;

/**
 * @author egerasimova (evgerasimova13@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Turn {
    public int[] turn(int[] array) {
        int i, tmp, hLenght = array.length >> 1;
        for (i = 0; i < hLenght; ++i) {
            tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
        return array;
    }
}


