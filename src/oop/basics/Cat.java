package oop.basics;

public class Cat {
    String type;
    String name;
    String color;
    int age;

    public void eat() {
    System.out.println("Cat eats meat.");
    }
    public void speed(){
    System.out.println("Cat runs faster.");
    }
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.type = "ABC";
        cat.name = "Kitty";
        cat.color = "Black";
        cat.age = 3;
        cat.eat();
        cat.speed();
        System.out.println("Cat1's type is: " + cat.type);
        System.out.println("Cat1's name is: " + cat.name);
        System.out.println("Cat1's color is: " + cat.color);
        System.out.println("Cat1's age is: " + cat.age);

        Cat cat1 = new Cat();
        cat1.type = "XYZ";
        cat1.name = "Kiwi";
        cat1.color = "White";
        cat1.age = 2;

        System.out.println("Cat2's type is: " + cat1.type);
        System.out.println("Cat2's name is: " + cat1.name);
        System.out.println("Cat2's color is: " + cat1.color);
        System.out.println("Cat2's age is: " + cat1.age);
    }
}
