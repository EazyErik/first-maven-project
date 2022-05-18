import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoopsTest {
    @Test
    void shouldReturn1IfInput0() {
        //Given

        int number = 0;

        //When

        int actual = Loops.faculty(0);

        //Then

        Assertions.assertEquals(1,actual);
    }

    @Test
    void shouldReturn1IfInput1() {
        //Given

        int number = 1;

        //When

        int actual = Loops.faculty(number);

        //Then

        Assertions.assertEquals(1,actual);
    }

    @Test
    void shouldReturn2IfInput2() {
        //Given

        int number = 2;

        //When

        int actual = Loops.faculty(number);

        //Then

        Assertions.assertEquals(2,actual);
    }


    @Test
    void shouldReturn6IfInput3() {
        //Given

        int number = 3;

        //When

        int actual = Loops.faculty(number);

        //Then

        Assertions.assertEquals(6,actual);
    }

}