import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.util.StringUtils;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
     FizzBuzz buzzer = new FizzBuzz();
    @DisplayName("Takes a number as an Input Return FizzBuzz, Fizz, Buzz or number itself as a String ")
    @Test
    void checksWhatFizzBuzzMethodReturns(){
        assertAll("Should Return Fizz, Buzz, or FizzBuzz",
                () -> assertEquals("FizzBuzz", buzzer.fizzBuzz(15)),
                () -> assertEquals("Fizz", buzzer.fizzBuzz(9)),
                () -> assertEquals("Buzz", buzzer.fizzBuzz(5)),
                () -> assertEquals("8", buzzer.fizzBuzz(8))
        );
    }
}

