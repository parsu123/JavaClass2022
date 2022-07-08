package oop.collection;

import java.util.ArrayList;
import java.util.List;

public class Students {
    public static void main(String[] args) {
    List studentList = new ArrayList<>();
    studentList.add("Keepa");
    studentList.add("Prabin");
    studentList.add("Prasamsa");
    studentList.add("Pratikshya");
    studentList.add("Rupees");
    studentList.add("Saru");
    studentList.add("Sagar");

    try {
        System.out.println(studentList.size());
        System.out.println("Before Removing");
        System.out.println("Student1: " + studentList.get(0));
        System.out.println("Student2: " + studentList.get(1));
        System.out.println("Student3: " + studentList.get(2));
        System.out.println("Student4: " + studentList.get(3));
        System.out.println("Student5: " + studentList.get(4));
        System.out.println("Student6: " + studentList.get(5));
        System.out.println("Student7: " + studentList.get(6));

        studentList.remove("Sagar");

        System.out.println("After Removing");
        System.out.println("Student1: " + studentList.get(0));
        System.out.println("Student2: " + studentList.get(1));
        System.out.println("Student3: " + studentList.get(2));
        System.out.println("Student4: " + studentList.get(3));
        System.out.println("Student5: " + studentList.get(4));
        System.out.println("Student6: " + studentList.get(5));
        System.out.println("Student7: " + studentList.get(6));


        System.out.println("After Removing index");
        studentList.remove(5);
        System.out.println("Student1 " + studentList.get(0));
        System.out.println("Student2 " + studentList.get(1));
        System.out.println("Student3 " + studentList.get(2));
        System.out.println("Student4 " + studentList.get(3));
        System.out.println("Student5 " + studentList.get(4));
    }  catch (Exception e) {
        System.out.println("Array Index Out of Bound.");
    }

}
}