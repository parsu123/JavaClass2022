package oop.assignment;
//Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'.
// Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
public class Student {
    String name;
    int roll_no;
    String address;
    public static void main(String[] args) {
        Student st = new Student();
        st.name = "John";
        st.roll_no = 2;
        System.out.println("Name of Student1 is: " +st.name);
        System.out.println("Roll number of Student1 is: " + st.roll_no);
    }


}
