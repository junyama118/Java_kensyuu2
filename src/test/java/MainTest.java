import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @org.junit.Test
    public void viewAvg() {
    }

    @Test
    public void calcAvg() {
        Main main = new Main("score.csv");

        assertEquals(main.calcAvg(),65.86, 0);
    }
}