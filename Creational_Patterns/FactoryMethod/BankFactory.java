package Creational_Patterns.FactoryMethod;

public class BankFactory implements IBankFactory {

    public IBank getBank(String cardCode) {
        switch(cardCode){
            case "1111": return new BankA();
            case "2222": return new BankB(); 
        }
        return null;
    }
    
}
