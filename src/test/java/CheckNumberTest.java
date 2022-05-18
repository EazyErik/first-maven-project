import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CheckNumberTest {
    @Test
    void checkIfNumberGreaterThan100() {


        //Given

        int number = 103;

        //When

        boolean actual = Addition.CheckNumber.checkNumber(number);

        //Then

        Assertions.assertTrue(actual);


    }

    @Test
    void checkIfNumberNotGreaterThan100() {


        //Given

        int number = 70;

        //When

        boolean actual = Addition.CheckNumber.checkNumber(number);

        //Then

        Assertions.assertFalse(actual);


    }

    @Test
    void checkIfNumberIsEqualTo100() {


        //Given

        int number = 100;

        //When

        boolean actual = Addition.CheckNumber.checkNumber(number);

        //Then

        Assertions.assertFalse(actual);


    }
}