package org.example.FactoryMethod;

public class RentFactory {
    public static IRent getRent(String name) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.example.FactoryMethod.Rent" + name);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Rent service invalid!");
        }
        if (!(objeto instanceof IRent)) {
            throw new IllegalArgumentException("There's no rent service for this.");
        }
        return (IRent) objeto;
    }
}
