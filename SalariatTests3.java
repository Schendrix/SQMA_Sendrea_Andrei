import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SalariatTests3 {
    public Salariat salariat;

    @Before
    public void setUp(){
        salariat=new Salariat();
    }


    @Test
    public void testCalculSalariu(){
        double rezultat=salariat.calculSalariu(100);
        double rezultatAsteptat=80;
        assertEquals(rezultatAsteptat, rezultat,0.001);
    }


}