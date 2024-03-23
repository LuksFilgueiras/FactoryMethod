package org.example.FactoryMethod;

import java.time.LocalDate;

public interface IRent {
    public Double RentPerDay(LocalDate enterDate, LocalDate leaveDate, double pricePerDay);
    public Double RentPerMonth(LocalDate enterDate, LocalDate leaveDate, double pricePerMonth);
}
