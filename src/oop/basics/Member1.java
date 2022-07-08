package oop.basics;
public class Member1 {
    private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private double salary;
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress() {
        return this.address;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary() {
        return this.salary;
    }
}
