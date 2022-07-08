package oop.collection;
import java.util.HashMap;
import java.util.Map;
public class HashMapPractice {
    public static void main(String[] args) {
    Map<String, Object> studentMap = new HashMap<>();
    studentMap.put("name","Josh");
    studentMap.put("rollNo",2);
    studentMap.put("designation","student");
    studentMap.put("mobileNo","404-789-324");
        studentMap.remove("rollNo");

    for(Map.Entry studentData: studentMap.entrySet()) {
    System.out.println(studentData.getKey());
    System.out.println(studentData.getValue());
}
}
}