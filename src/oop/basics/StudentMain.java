package oop.basics;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student("Prasamsa"+ " " , 5);
        System.out.println(student.name + student.rollNo);

        Student student1 = new Student("Ram"+ " ", 8);
        System.out.println(student1.name + student1.rollNo);

        Student student2 = new Student("Sita"+ " ", 1);
        System.out.println(student2.name + student2.rollNo);

        Student student3 = new Student("John"+ " ", 2);
        System.out.println(student3.name + student3.rollNo);
    }
}
