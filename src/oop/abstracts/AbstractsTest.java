package oop.abstracts;
public class AbstractsTest {
    public static void main(String[] args) {
        Bank bn = new BankA();
        bn.getBalance();
        Bank bn1 = new BankB();
        bn1.getBalance();
        Bank bn2 = new BankC();
        bn2.getBalance();
    }
}
