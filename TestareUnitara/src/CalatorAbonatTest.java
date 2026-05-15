import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalatorAbonatTest {

    @org.junit.Test
    public void testPlatesteBilet() {
        CalatorAbonat calator= new CalatorAbonat("Ion");
        calator.setSold(5.5f);
        calator.platesteBilet(2.5f);
        assertEquals(2.5f, calator.getSold(), 0.001);
    }

    @org.junit.Test
    public void testPlatesteBiletInsuficient() {
        CalatorAbonat calator= new CalatorAbonat("Ion");
        calator.setSold(1f);
        calator.platesteBilet(2.5f);
        assertEquals(1f, calator.getSold(), 0.001);
    }
}


