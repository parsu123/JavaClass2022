package oop.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student {
    private String name;
    private String address;
    private int age;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Ram");
        s.setAddress("Arizona");
        s.setAge(25);
        s.setGender("Male");
        Student s1 = new Student();
        s1.setName("Hari");
        s1.setAddress("New York");
        s1.setAge(20);
        s1.setGender("Male");
        Student s2 = new Student();
        s2.setName("Sita");
        s2.setAddress("Japan");
        s2.setAge(22);
        s2.setGender("Female");
        ArrayList<Student>studentList=new ArrayList<>();
       studentList.add(s);
        studentList.add(s1);
        studentList.add(s2);
        for(int i=0; i<studentList.size(); i++){
            System.out.println(studentList.get(i).getName());
        }


    }
}
