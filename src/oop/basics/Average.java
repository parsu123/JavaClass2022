package oop.basics;
public class Average {
    int num1, num2, num3;
    public Average(int num1,int num2,int num3) {
    this.num1 = num1;
    this.num2 = num2;
    this.num3 = num3;
    }
    void sum() {
        int sum, average;
        sum = num1 + num2 + num3;
        average = sum / 3;
        System.out.println("The sum of three numbers is: " + sum);
        System.out.println("The average of three numbers is: " + average);
    }
    public static void main(String[] args) {
        Average av = new Average(5, 6, 7);
        av.sum();



    }
}
