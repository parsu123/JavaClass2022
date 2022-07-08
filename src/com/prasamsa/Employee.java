package com.prasamsa;

public class Employee {
    static String companyName = "ABC";
    static String address = "Kathmandu, Nepal";

    public static void main(String[] args) {
        String employeeName = "Ram";
        long employeeCode = 2345675;
        employeeCode = (int)2345675;


        System.out.println("Employee Name is: "+employeeName);
        System.out.println("Company Name is: "+companyName);
        System.out.println("Company Address is: "+address);
        System.out.println("EmployeeCode is: " +employeeCode);
    }
}
