package FactoryMethod;

import org.example.FactoryMethod.IRent;
import org.example.FactoryMethod.RentFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class RentFactoryTest {
    @Test
    public void throwServiceInvalidExceptionMessage() {
        try {
            IRent rent = RentFactory.getRent("Car");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Rent service invalid!", e.getMessage());
        }
    }

    @Test
    public void throwTheresNoServiceExceptionMessage() {
        try {
            IRent rent = RentFactory.getRent("Stadium");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("There's no rent service for this.", e.getMessage());
        }
    }
}
