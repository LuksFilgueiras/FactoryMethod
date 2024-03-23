package FactoryMethod;

import org.example.FactoryMethod.IRent;
import org.example.FactoryMethod.RentFactory;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class RentWarehouseTest {
    @Test
    public void shouldExecuteRentPerDay() {
        IRent rent = RentFactory.getRent("Warehouse");

        assertEquals(Double.valueOf(400.0), rent.RentPerDay(LocalDate.of(2024,3,21), LocalDate.of(2024,3,25), 100.0));
    }

    @Test
    public void shouldExecuteRentPerMonth() {
        IRent rent = RentFactory.getRent("Warehouse");

        assertEquals(Double.valueOf(1000.0), rent.RentPerMonth(LocalDate.of(2024,3,21), LocalDate.of(2024,5,25), 500.0));
    }
}
