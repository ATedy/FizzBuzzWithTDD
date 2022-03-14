import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
     FizzBuzz buzzer = new FizzBuzz();

    @Test
    void fizzBuzz(){
        assertAll(
                () -> assertEquals("FizzBuzz", buzzer.fizzBuzz(15)),
                () -> assertEquals("Fizz", buzzer.fizzBuzz(9)),
                () ->         assertEquals("Buzz", buzzer.fizzBuzz(10))
        );


    }
}