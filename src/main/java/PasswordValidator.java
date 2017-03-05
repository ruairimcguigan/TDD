import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Requirements for password to be valid:
 * - Must be at least 6 characters long
 * - Must start with a capital letter
 * - Must contain at least 2 numbers
 * - must contain an underscore
 *
 * ((?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})
 *
 * (			# Start of group
 (?=.*\d)		#   must contains one digit from 0-9
 (?=.*[a-z])		#   must contains one lowercase characters
 (?=.*[A-Z])		#   must contains one uppercase characters
 (?=.*[@#$%])		#   must contains one special symbols in the list "@_$%"
 .		#     match anything with previous condition checking
 {6,20}	#        length at least 6 characters and maximum of 20
 )			# End of group


 */
public class PasswordValidator {

    private Pattern pattern;
    private Matcher matcher;

    public static final String PASSWORD_PATTERN = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@_$%]).{6,20})";

    public PasswordValidator() {
        pattern = Pattern.compile(PASSWORD_PATTERN);
    }

    public boolean isValid(String password) {
        matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
