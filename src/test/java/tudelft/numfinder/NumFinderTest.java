package tudelft.numfinder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumFinderTest {

    @Test
    void encontrarMayorMenorDesc() {
        NumFinder nf = new NumFinder();
        nf.find(new int[]{4, 3, 2, 1});
        assertEquals(4, nf.getLargest());
        assertEquals(1, nf.getSmallest());
    }
    @Test
    void encontrarUnicoNumero() {
        NumFinder nf = new NumFinder();
        nf.find(new int[]{5});
        assertEquals(5, nf.getLargest());
        assertEquals(5, nf.getSmallest());
    }
    @Test
    void encontrarConNumerosNegativos() {
        NumFinder nf = new NumFinder();
        nf.find(new int[]{-10, -20, -30, -40});
        assertEquals(-10, nf.getLargest());
        assertEquals(-40, nf.getSmallest());
    }

    @Test
    void encontrarConArrayVacio() {
        NumFinder nf = new NumFinder();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> nf.find(new int[]{}));
        assertEquals("El array no puede estar vacío", exception.getMessage());
    }


}




