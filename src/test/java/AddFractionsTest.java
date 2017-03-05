import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by c0249298 on 05/03/2017.
 */
public class AddFractionsTest {

    @Test
    public void zeroPlusZero() throws Exception {
        Fraction sum = new Fraction (0).plus(new Fraction(0));
        assertEquals(0, sum.intValue());
    }

    @Test
    public void nonZeroPlusZero() throws Exception {
        Fraction sum = new Fraction(3).plus(new Fraction(0));
        assertEquals(3, sum.intValue());
    }

    @Test
    public void zeroPlusNonZero() throws Exception {
        Fraction sum = new Fraction(0).plus(new Fraction(5));
        assertEquals(5, sum.intValue());
    }

    @Test
    public void nonZeroPlusNonNegativeOperands() throws Exception {

        Fraction sum = new Fraction(3).plus(new Fraction(4));
        assertEquals(7, sum.intValue());
    }

    @Test
    public void negativeInputsAndNegativeOutputs() throws Exception {
        Fraction sum = new Fraction(-3).plus(new Fraction(1));
        assertEquals(-2, sum.intValue());

    }
}
