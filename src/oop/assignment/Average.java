package oop.assignment;
public class Average {
    int num1, num2, num3;
    public Average(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public void calc() {
        int average = (num1 + num2 + num3) / 3;
        System.out.println("Average of three numbers is: " + average);
    }

    public static void main(String[] args) {
        Average av = new Average(6, 6, 3);
        av.calc();

    }
}
