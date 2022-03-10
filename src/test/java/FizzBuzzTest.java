import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
     FizzBuzz buzzer = new FizzBuzz();

    @Test
    void fizzBuzz(){
        assertAll("Lists",
                () -> assertEquals("Fizz", buzzer.fizzBuzz(5)),
                () -> assertEquals("Buzz", buzzer.fizzBuzz(7)),
                () ->  assertEquals("Fizz", buzzer.fizzBuzz(9)),
                () ->  assertEquals("Buzz", buzzer.fizzBuzz(8))
        );

    }
}