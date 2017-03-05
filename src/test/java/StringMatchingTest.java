import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by c0249298 on 02/03/2017.
 */
public class StringMatchingTest {

    private StringParser stringParser;
    private final static String input = "aaa123";

    @Before
    public void setUp() throws Exception {
        stringParser = new StringParser();
    }

    @Test
    public void shouldCheckIfStringHasMoreThanThreeDigits() throws Exception {

        //When
        boolean result = stringParser.parseForNumbers(input);

        //Then
        Assert.assertTrue("String must contain at least 3 digits", result);
    }

    @Test
    public void parserMustAcceptBothAlphabeticalAndNumericCharacters() throws Exception {

        boolean result = stringParser.checkForAlphabeticAndNumericCharacters(input);
        Assert.assertTrue("String must accept both alphabetical and numeric characters", result);

    }

    @Test
    public void shouldReturnAListOfNumbersFromString() throws Exception {

    }
}
