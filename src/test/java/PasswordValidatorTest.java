import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by c0249298 on 01/03/2017.
 */
public class PasswordValidatorTest {

    private PasswordValidator passwordValidator;

    @Before
    public void setUp() throws Exception {
        passwordValidator = new PasswordValidator();
    }

    @Test
    public void validatePassword() throws Exception {
        //Given
        String password = "Ruairi_123";
        // When
        boolean result = passwordValidator.isValid(password);
        //Then
        assertTrue(result);
    }

}
