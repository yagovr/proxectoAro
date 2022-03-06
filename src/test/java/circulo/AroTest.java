/**
 * Probas para a clase Circulo
 * @author A21YagoVR
 */
package circulo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author A21YagoVR
 */
public class AroTest {
    
    public AroTest() {
    }
    
    /**
     * Test of setCoordenadaX method, of class Aro.
     */
    @Test
    public void testEstablecerX() {
        System.out.println("setCoordenadaX");
        int valorX = 0;
        Aro instance = new Aro();
        instance.setCoordenadaX(valorX);
    }

    /**
     * Test of getCoordenadaX method, of class Aro.
     */
    @Test
    public void testObterX() {
        System.out.println("getCoordenadaX");
        Aro instance = new Aro(0,0,0.1);
        int expResult = 0;
        int result = instance.getCoordenadaX();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCoordenadaY method, of class Aro.
     */
    @Test
    public void testEstablecerY() {
        System.out.println("setCoordenadaY");
        int valorY = 0;
        Aro instance = new Aro();
        instance.setCoordenadaY(valorY);
    }

    /**
     * Test of getCoordenadaY method, of class Aro.
     */
    @Test
    public void testObterY() {
        System.out.println("getCoordenadaY");
        Aro instance = new Aro(0,0,0.1);
        int expResult = 0;
        int result = instance.getCoordenadaY();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRadio method, of class Aro.
     */
    @Test
    public void testEstablecerRadio() {
        System.out.println("setRadio");
        Aro instance = new Aro();
        instance.setRadio(0.0);
        instance.setRadio(0.1);
        instance.setRadio(-0.1);
    }

    /**
     * Test of getRadio method, of class Aro.
     */
    @Test
    public void testObterRadio() {
        System.out.println("getRadio");
        Aro instance = new Aro(0,0,0.1);
        double result = instance.getRadio();
        assertEquals(0.1, result,0);

        instance.setRadio(0.1);
        result= instance.getRadio();
        assertEquals(0.1, result,0);

        instance.setRadio(-0.1);
        result= instance.getRadio();
        assertEquals(0.0, result,0);
    }

    /**
     * Test of obterDiametro method, of class Aro.
     */
    @Test
    public void testObterDiametro() {
        System.out.println("obterDiametro");
        Aro instance = new Aro(0,0,0.1);
        double result = instance.obterDiametro();
        assertEquals(0.2, result,0);
    }

    /**
     * Test of obterCircunferencia method, of class Aro.
     */
    @Test
    public void testObterCircunferencia() {
        System.out.println("obterCircunferencia");
        Aro instance = new Aro(0,0,0.1);
        double expResult = 0.6283185;
        double result = instance.obterCircunferencia();
        assertEquals(expResult, result,1e-6);
    }

    /**
     * Test of obterSuperficie method, of class Aro.
     */
    @Test
    public void testObterSuperficie() {
        System.out.println("obterArea");
        Aro instance = new Aro(0,0,0.1);
        double expResult = 0.0314159;
        double result = instance.obterSuperficie();
        assertEquals(expResult, result,1e-6);
    }

    /**
     * Test of trasladarCentro method, of class Aro.
     */
    @Test
    public void testTrasladarCentro() {
        System.out.println("trasladarCentro");
        Aro instance = new Aro();
        int resultx=instance.getCoordenadaX();
        int resulty=instance.getCoordenadaY();
        instance.trasladarCentro(5, 6);
        int resultnx = instance.getCoordenadaX();
        int resultny = instance.getCoordenadaY();
        assertEquals(resultx+5, resultnx);
        assertEquals(resulty+6, resultny);
    }

    /**
     * Test of toString method, of class Aro.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Aro instance = new Aro(37,43,2.5);
        String expResult = "Centro = [" + 37 + "," + 43 + "]; Radio = " + 2.5;
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLIMITERADIO method, of class Aro.
     */
    @Test
    public void testGetLIMITERADIO() {
        System.out.println("getLIMITERADIO");
        Aro instance = new Aro();
        double expResult = 0.0;
        double result = instance.getLIMITERADIO();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setLIMITERADIO method, of class Aro.
     */
    @Test
    public void testSetLIMITERADIO() {
        System.out.println("setLIMITERADIO");
        double LIMITERADIO = 0.0;
        Aro instance = new Aro();
        instance.setLIMITERADIO(LIMITERADIO);
    }
    
}
