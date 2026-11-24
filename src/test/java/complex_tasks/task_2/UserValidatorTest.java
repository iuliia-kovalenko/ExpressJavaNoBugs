package complex_tasks.task_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTest {
    public UserValidator userValidator;

    @BeforeEach
    public void setUp() {
        userValidator = new UserValidator();
        userValidator.setValidation(true);
    }

    @Test
    public void userNameIsValidTest() {
        User user = new User("Yulia", "email@email.com", 33);
        assertTrue(userValidator.validateName(user));
    }

    @ParameterizedTest
    @ValueSource(strings = {"yulia", ""})
    public void userNameIsNotValidTest(String name) {
        User user = new User(name, "email@email.com", 33);
        assertThrows(InvalidUserException.class, () -> {
            userValidator.validateName(user);
        }, "User name starts with lowercase letter or empty lead to InvalidUserException");
    }

    @Test
    public void userNameNullIsNotValidTest() {
        User user = new User(null, "email@email.com", 33);
        assertThrows(InvalidUserException.class, () -> {
            userValidator.validateName(user);
        }, "Null user name lead to InvalidUserException");
    }

    @ParameterizedTest
    @ValueSource(ints = {18, 19, 50, 99, 100})
    public void userAgeIsValidTest(int age) {
        User user = new User("Sophie", "email@email.com", age);
        assertTrue(userValidator.validateAge(user));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 17, 101, -1})
    public void userAgeIsNorValidTest(int age) {
        User user = new User("Sophie", "email@email.com", age);
        assertThrows(InvalidUserException.class, () -> {
            userValidator.validateAge(user);
        }, "User age must be more than 18 and less than 100");
    }

    @ParameterizedTest
    @ValueSource(strings = {"mail@mail.ru", "mail@mail.mail.ru", "mail.mail@mail.com"})
    public void userEmailIsValidTest(String email) {
        User user = new User("Sophie", email, 14);
        assertTrue(userValidator.validateEmail(user));
    }

    @ParameterizedTest
    @ValueSource(strings = {"@mail.ru", "mail.ru", "mail", "66666", "&^&^&^&^", "    "})
    public void userEmailIsNotValidTest(String email) {
        User user = new User("Sophie", email, 14);
        assertThrows(InvalidUserException.class, () -> {
            userValidator.validateEmail(user);
        }, "Not valid user email lead to InvalidUserException");
    }

    @Test
    public void userEmailNullIsNotValidTest() {
        User user = new User("Sophie", null, 14);
        assertThrows(InvalidUserException.class, () -> {
            userValidator.validateEmail(user);
        }, "Null user email lead to InvalidUserException");
    }

    public static Stream<Arguments> dataset() {
        return Stream.of(
                Arguments.of("sophie", "mail@mail.ru", 18),
                Arguments.of("Sophie", "mailmail.ru", 36),
                Arguments.of("Sophie", "mail@mail.ru", 1000)
        );
    }

    @ParameterizedTest
    @MethodSource("dataset")
    public void userDataIsValidIfValidationDisabled(String name, String email, int age) {
        User user = new User(name,email, age);
        userValidator.setValidation(false);
        assertTrue(userValidator.validateEmail(user));
        assertTrue(userValidator.validateName(user));
        assertTrue(userValidator.validateAge(user));
    }
}
