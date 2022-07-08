package oop.abstracts;
public class Bank1Main {
    public static void main(String[] args) {
        Bank1 b = new BankAA();
        try {
        b.getMiniStatement();
    } catch (Exception e){
            System.out.println("Array Index Out of Bound.");
        } finally {
            System.out.println("Finally Block starts here.");
        }
}
}