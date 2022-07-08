package oop.abstracts;

import java.util.Scanner;

public class BankAA implements Bank1 {
    public void getMiniStatement() {
        double salary[] = {500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500};
        for (int i = 0; i < 12; i++) {
            System.out.println("Salary of month" + i + "is: " + salary[i]);
        }
        System.out.println(salary[12]);
    }
}
