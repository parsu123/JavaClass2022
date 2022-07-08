package oop.basics;
public class Triangle {
    double a;
    double b;
    double c;
    public void sum(){
        double sum;
        sum = a + b + c;
        System.out.println("sum is: " + sum);
    }
    public void difference() {
        double difference;
        difference = a - b - c;
        System.out.println("difference is: " + difference);
    }


    public static void main(String[] args) {
        Triangle pt = new Triangle();
        pt.a = 3.0;
        pt.b = 4.0;
        pt.c = 5.0;

        pt.difference();
        pt.sum();


    }
}
 /*void average() {
        int average;
        average = sum /3; ;
    }*/