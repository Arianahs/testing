package tudelft.sum; //

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

class TwoNumbersSumTest {

    @Test
    void testSumaBasica() {
        TwoNumbersSum suma = new TwoNumbersSum();

        ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(2, 4, 3));
        ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(5, 6, 4));
        ArrayList<Integer> esperado = new ArrayList<>(Arrays.asList(8, 0, 7));

        assertEquals(esperado, suma.addTwoNumbers(num1, num2));
    }
}
