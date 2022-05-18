import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void shouldReturnTrueStringLengthGreater20AndContainsFancy() {
        // Given
        String  toTest = "Hallo ziemlich langer fancy Text";

        // When
        boolean actual = Main.checkString(toTest);

        // Then

        Assertions.assertTrue(actual);
    }

    @Test
    void shouldReturnFalseStringLengthIsSmallerThan20AndContainsFancy() {
        // Given
        String  toTest = "Hallo lange fancy";

        // When
        boolean actual = Main.checkString(toTest);

        // Then

        Assertions.assertFalse(actual);
    }

    @Test
    void shouldReturnFalseStringLengthIsSmallerThan20AndDoesNotContainFancy() {
        // Given
        String  toTest = "Hallo ziemlich langer Text";

        // When
        boolean actual = Main.checkString(toTest);

        // Then

        Assertions.assertFalse(actual);
    }


}