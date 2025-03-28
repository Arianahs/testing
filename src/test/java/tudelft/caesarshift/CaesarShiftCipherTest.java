package tudelft.caesarshift;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaesarShiftCipherTest {

    @Test
    public void cifradoBasico() {
        CaesarShiftCipher cifrador = new CaesarShiftCipher();
        String resultado = cifrador.CaesarShiftCipher("abc", 3);
        assertEquals("def", resultado, "El cifrado básico no funciona correctamente");
    }

    @Test
    public void cifradoConDesplazamientoNegativo() {
        CaesarShiftCipher cifrador = new CaesarShiftCipher();
        String resultado = cifrador.CaesarShiftCipher("def", -3);
        assertEquals("abc", resultado, "El desplazamiento negativo no funciona correctamente");
    }

    @Test
    public void cifradoConEspacios() {
        CaesarShiftCipher cifrador = new CaesarShiftCipher();
        String resultado = cifrador.CaesarShiftCipher("abc xyz", 3);
        assertEquals("def abc", resultado, "Los espacios deberían mantenerse igual");
    }

    @Test
    public void cifradoConCaracteresInvalidos() {
        CaesarShiftCipher cifrador = new CaesarShiftCipher();
        String resultado = cifrador.CaesarShiftCipher("abc123", 3);
        assertEquals("invalid", resultado, "Los caracteres inválidos deben devolver 'invalid'");
    }
}
