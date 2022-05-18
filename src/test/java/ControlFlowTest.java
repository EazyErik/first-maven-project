import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControlFlowTest {

    @Test
    void checkIfMoreThan30Guests() {
        //Given

        int customers = 31;

        //When

        boolean actual = ControlFlow.checkIfMoreThan30Guests(customers);

        //Then

        Assertions.assertTrue(actual);
    }

    @Test
    void checkIfLessThan30Guests() {
        //Given

        int customers = 29;

        //When

        boolean actual = ControlFlow.checkIfMoreThan30Guests(customers);

        //Then

        Assertions.assertFalse(actual);
    }
    @Test
    void checkIfExactly30Guests() {
        //Given

        int customers = 30;

        //When

        boolean actual = ControlFlow.checkIfMoreThan30Guests(customers);

        //Then

        Assertions.assertFalse(actual);
    }

}