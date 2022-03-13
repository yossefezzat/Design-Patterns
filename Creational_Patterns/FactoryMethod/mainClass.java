package Creational_Patterns.FactoryMethod;
import java.util.Scanner;

public class mainClass {
    public static void main(String[] args) {

        BankFactory process = new BankFactory();
    
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the card Number: ");
        String cardCode = input.nextLine();

        // call the object from object creater (FactoryBank)
        IBank bank = process.getBank(cardCode);
        System.out.println(bank.withDraw());

    }
}
