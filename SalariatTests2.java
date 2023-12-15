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

}