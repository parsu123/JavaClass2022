package controlstatement.selectionpractice;

import java.util.Scanner;

public class IfElsePractice {

    public static void main(String[] args) {
        int a, b, c, d;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = scanner.nextInt();
        System.out.println("a is: " + a);

        System.out.println("Enter b: ");
        b = scanner.nextInt();
        System.out.println("b is: " + b);

         c = a+ b;
         System.out.println("The sum of a and b is: " + c);
         d = a - b;
         System.out.println("The diffrenece of a and b is: " + d);

         if((c>100) && (d>100)){
             System.out.println("The sum and difference is is greater than 100.");
         } else {
             System.out.println("The sum and difference is less than 100");
         }


    }
}
