package Creational_Patterns.FactoryMethod;

public interface IBankFactory {
    IBank getBank(String cardCode);
}
