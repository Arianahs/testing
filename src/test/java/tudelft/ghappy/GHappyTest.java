package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    @Test
    public void todasLasGsFelices() {
        GHappy gHappy = new GHappy();
        boolean resultado = gHappy.gHappy("xxggxx");
        Assertions.assertTrue(resultado);
    }

    @Test
    public void gSolaInfeliz() {
        GHappy gHappy = new GHappy();
        boolean resultado = gHappy.gHappy("xxgxx");
        Assertions.assertFalse(resultado);
    }


}
