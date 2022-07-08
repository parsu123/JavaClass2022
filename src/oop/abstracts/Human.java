package oop.abstracts;
public class Human extends Monkey implements Animal{
    public void eat(){
        System.out.println("Humans and animals eat.");
    }
    public void sleep() {
        System.out.println("Humans and animals sleep.");
    }

}
