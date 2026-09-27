package non.learn.sort.insertion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class InsertionTest {

    private final Insertion insertion = new Insertion();

    @Test
    void ascending_shouldReturnProperly() {
        int[] input = {4, 2, 1, 2, 1, 1, 2, 4, 4};
        System.out.println(Arrays.toString(input));
        int[] actual = insertion.ascending(input);
        System.out.println(Arrays.toString(actual));
        Assertions.assertArrayEquals(new int[] {1, 1, 1, 2, 2, 2, 4, 4, 4}, actual);
    }

    @Test
    void deAscending_shouldReturnProperly() {
        int[] input = {4, 2, 1, 2, 1, 1, 2, 4, 4};
        System.out.println(Arrays.toString(input));
        int[] actual = insertion.deAscending(input);
        System.out.println(Arrays.toString(actual));
        Assertions.assertArrayEquals(new int[] {4, 4, 4, 2, 2, 2, 1, 1, 1}, actual);
    }
}