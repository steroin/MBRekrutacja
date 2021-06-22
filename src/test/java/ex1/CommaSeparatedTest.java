package ex1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CommaSeparatedTest {

    @Test
    public void firstTest() {
        assertEquals("p4,n7,n11,n15,n23,p8,p0", CommaSeparated.toString(List.of(4, 7, 11, 15, 23, 8, 0)));
    }

    @Test
    public void secondTest() {
        assertEquals("n1,n3,n99999,p14,n-1", CommaSeparated.toString(List.of(1, 3, 99999, 14, -1)));
    }

    @Test
    public void thirdTest() {
        assertEquals("", CommaSeparated.toString(List.of()));
    }

    @Test
    public void fourthTest() {
        assertThrows(IllegalArgumentException.class, () -> CommaSeparated.toString(null));
    }
}