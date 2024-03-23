package org.example.FactoryMethod;

import java.time.LocalDate;

public class RentStadium {
    public Double RentPerDay(LocalDate enterDate, LocalDate leaveDate, double pricePerDay) {
        if(enterDate.isAfter(leaveDate)){
            throw new IllegalArgumentException("Invalid date!");
        }

        int difference = leaveDate.getDayOfYear() - enterDate.getDayOfYear();

        return difference * pricePerDay;
    }

    public Double RentPerMonth(LocalDate enterDate, LocalDate leaveDate, double pricePerMonth) {
        if(enterDate.getMonthValue() >= leaveDate.getMonthValue()){
            throw new IllegalArgumentException("Invalid month!");
        }

        int difference = leaveDate.getMonthValue() - enterDate.getMonthValue();

        return difference * pricePerMonth;
    }
}
