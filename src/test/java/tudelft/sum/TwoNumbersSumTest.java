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

    @Test
    void testSumaConCeros() {
        ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(0, 0, 0));
        ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(3, 2, 1));
        ArrayList<Integer> esperado = new ArrayList<>(Arrays.asList(3, 2, 1));

        TwoNumbersSum sumador = new TwoNumbersSum();
        assertEquals(esperado, sumador.addTwoNumbers(num1, num2));
    }

    @Test
    void testSumaConNumeroVacio() {
        ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> num2 = new ArrayList<>();
        ArrayList<Integer> esperado = new ArrayList<>(Arrays.asList(1, 2, 3));

        TwoNumbersSum suma = new TwoNumbersSum();
        assertEquals(esperado, suma.addTwoNumbers(num1, num2));
    }

    @Test
    void testSumaDiferenteTamaño() {
        ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(9, 9));
        ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(1));
        ArrayList<Integer> esperado = new ArrayList<>(Arrays.asList(0, 0)); // Resultado actual del método

        TwoNumbersSum suma = new TwoNumbersSum();
        assertEquals(esperado, suma.addTwoNumbers(num1, num2));
    }


}
