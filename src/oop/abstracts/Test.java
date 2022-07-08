package oop.abstracts;
public class Test {
    public static void main(String[] args) {
        Animal an = new Human();
        an.eat();
        an.sleep();
       Monkey mn = new Monkey();
       mn.bite();
       mn.jump();
    }
}
