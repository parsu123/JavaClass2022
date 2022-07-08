package oop.basics;
public class ABC {
    public static void main(String[] args) {


    Employee e1 = new Employee();
    e1.name = "John";
    e1.age = 20;
    e1.phoneNumber = "902-789-456";
    e1.address = "X-Y-Z";
    e1.salary = 60000.0;

    System.out.println(e1.name + " " + e1.age + " " + e1.phoneNumber + " "+ e1.address + " " + e1.salary);
}
}
