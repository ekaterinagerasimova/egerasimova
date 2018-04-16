package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author egerasimova (evgerasimova13@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class MaxTest {
    @Test
    public void whenFirstMoreThanSecondAndThird() {
        Max maxim = new Max();
        int result = maxim.maxThree(3, 2, 1);
        assertThat(result, is(3));
    }

}