package oop.basics;

public class Member1Main {
    public static void main(String[] args) {
    Member1 member = new Member1();
    member.setName("Ram");
    System.out.println(member.getName());
    member.setAddress("Kathmandu");
    System.out.println(member.getAddress());
    member.setAge(25);
    System.out.println(member.getAge());
    member.setSalary(50000.0);
    System.out.println(member.getSalary());
    member.setPhoneNumber("898-498-9990");
    System.out.println(member.getPhoneNumber());
}
}
