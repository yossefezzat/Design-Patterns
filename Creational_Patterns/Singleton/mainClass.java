package Creational_Patterns.Singleton;

public class mainClass{
    public static void main(String[] args) {
        Singleton.getInstance();
        Singleton inst = Singleton.instance;
        System.out.println(inst);
    }
}