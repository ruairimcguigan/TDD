import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by c0249298 on 02/03/2017.
 */
public class StringParser {

    private Pattern numberPattern, alphaNumericPattern;
    private Matcher matcher;

    public static final String AT_LEAST_THREE_DIGITS_PATTERN = "(.*[0-9]){3}";
    public static final String MUST_HAVE_ALPHA_AND_NUMERIC_PATTERN = "^([0-9]+[a-zA-Z]+|[a-zA-Z]+[0-9]+)[0-9a-zA-Z]*$";

    public StringParser() {
        numberPattern = Pattern.compile(AT_LEAST_THREE_DIGITS_PATTERN);
        alphaNumericPattern = Pattern.compile(MUST_HAVE_ALPHA_AND_NUMERIC_PATTERN);
    }

    public boolean parseForNumbers(String input) {

        matcher = numberPattern.matcher(input);
        return matcher.matches();
    }

    public boolean checkForAlphabeticAndNumericCharacters(String input) {
        matcher = alphaNumericPattern.matcher(input);
        return matcher.matches();
    }
}
