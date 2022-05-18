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

    @Test
    void checkForAlarmcolor() {
        // Given

        String alert = "rot";
        int customers = 10;
        //When

        String actual = ControlFlow.checkTooManyCustomers(alert,customers);

        //Then

        Assertions.assertEquals("Keine Personen erlaubt",actual);
    }
    @Test
    void checkForAlarmcolorAndMoreThan30Customers() {
        // Given

        String alert = "gelb";
        int customers = 32;
        //When

        String actual = ControlFlow.checkTooManyCustomers(alert,customers);

        //Then

        Assertions.assertEquals("Zu viele Personen",actual);
    }

    @Test
    void checkForAlarmcolorAndLessThan30Customers() {
        // Given

        String alert = "gelb";
        int customers = 23;
        //When

        String actual = ControlFlow.checkTooManyCustomers(alert,customers);

        //Then

        Assertions.assertEquals("Max Anzahl nicht erreicht",actual);
    }

    @Test
    void checkForAlarmcolorAndLessThan60Customers() {
        // Given

        String alert = "gruen";
        int customers = 59;
        //When

        String actual = ControlFlow.checkTooManyCustomers(alert,customers);

        //Then

        Assertions.assertEquals("Max Anzahl nicht erreicht",actual);
    }

}