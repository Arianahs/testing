package tudelft.numfinder;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumFinderTest {

    @Test
    void testFindWithMixedNumbers() {
        NumFinder nf = new NumFinder();
        nf.find(new int[]{4, 25, 7, 9});
        assertEquals(25, nf.getLargest());
        assertEquals(4, nf.getSmallest());
    }
}

