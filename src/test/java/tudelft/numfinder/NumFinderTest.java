package tudelft.numfinder;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumFinderTest {

    @Test
    void testFindWithDescendingNumbers() {
        NumFinder nf = new NumFinder();
        nf.find(new int[]{4, 3, 2, 1});
        assertEquals(4, nf.getLargest());
        assertEquals(1, nf.getSmallest());
    }

