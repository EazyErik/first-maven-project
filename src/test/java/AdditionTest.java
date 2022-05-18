import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {
    @Test
    void shouldReturnTheCorrectResultsOfTwoNumbers() {
        //Given
        int number1 = 4;
        int number2 = 3;

        int result = 7;

        //When

        int actual = Addition.add(number1, number2);

        //Then

        Assertions.assertEquals(result,actual);


    }

    @Test
    void shouldReturnTheCorrectResultsOfAPositivAndANegaticNumber() {
        //Given
        int number1 = 4;
        int number2 = -2;

        int result = 2;

        //When

        int actual = Addition.add(number1, number2);

        //Then

        Assertions.assertEquals(result,actual);


    }
    @Test
    void shouldReturnTheCorrectResultOfTwoNegativNumbers() {
        //Given
        int number1 = -2;
        int number2 = -2;

        int result = -4;

        //When

        int actual = Addition.add(number1, number2);

        //Then

        Assertions.assertEquals(result,actual);


    }

    @Test
    void shouldReturnTheCorrectResultsOfTwoNegativNumbers() {
        //Given
        int number1 = -2;
        int number2 = -2;

        int result = -4;

        //When

        int actual = Addition.add(number1, number2);

        //Then

        Assertions.assertEquals(result,actual);


    }


}


