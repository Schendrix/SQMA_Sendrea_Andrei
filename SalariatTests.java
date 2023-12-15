import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SalariatTests {
    public Salariat salariat;

    @Before
    public void setUp(){
        salariat=new Salariat();
    }

    @Test
    public void testVarsta() {
        assertTrue(salariat.esteMajor(18));
    }

    @Test
    public void testCalculSalariu(){
        double rezultat=salariat.calculSalariu(100);
        double rezultatAsteptat=80;
        assertEquals(rezultatAsteptat, rezultat,0.001);
    }

    @Test
    public void testMajorareSalariu(){
        try{
            salariat.majorareSalariu(8, 100);
            fail("Metoda nu arunca exceptie");
        }catch(IllegalArgumentException er){

        }
    }
    @Test
    public void testRaportVirgulaMobila(){
        double rezultat=salariat.majorareSalariu(12, 100);
        double rezultatAsteptat=100;
        assertEquals(rezultatAsteptat, rezultat,0.001);
    }


}