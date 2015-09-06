package fr.john;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by John on 06/09/2015.
 */
public class BeerTest {

    @Test
    public void testFizzbuzz() {
        String fizzbuzz = new Beer(15).fizzbuzz();
        Assert.assertEquals("Buzz Fizz Buzz Buzz Fizz Buzz Buzz Fizz ", fizzbuzz);

    }
}