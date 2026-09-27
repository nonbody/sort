package non.learn.sort.gnome;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class GnomeTest {

    private final Gnome gnome = new Gnome();

    @Test
    void ascending() {
        List<Integer> actual = gnome.ascending(Arrays.asList(4, 2, 1, 2, 1, 1, 2, 4, 4));
        Assertions.assertEquals(List.of(1, 1, 1, 2, 2, 2, 4, 4, 4), actual);
    }

    @Test
    void deAscending() {
        List<Integer> actual = gnome.deAscending(Arrays.asList(4, 2, 1, 2, 1, 1, 2, 4, 4));
        Assertions.assertEquals(List.of(4, 4, 4, 2, 2, 2, 1, 1, 1), actual);
    }
}