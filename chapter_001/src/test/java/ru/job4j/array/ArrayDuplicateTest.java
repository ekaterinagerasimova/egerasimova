package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        String[] input = {"1", "4", "4", "2", "2", "1"};
        String[] except = {"1", "4", "2"};
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] result = duplicate.remove(input);
        assertThat(result, arrayContainingInAnyOrder(except));
    }
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicates() {
        String[] input = {"Mercedes", "BMW", "BMW", "Audi", "Mercedes"};
        String[] except = {"Mercedes", "BMW", "Audi"};
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] result = duplicate.remove(input);
        assertThat(result, arrayContainingInAnyOrder(except));
    }
}