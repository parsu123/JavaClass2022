package oop.assignment;
public class Triangle {
    int side1 = 3, side2 = 4, side3 = 5;
    public static void main(String[] args) {
       double perimeter, s, areaOfTriangle;
       Triangle tr = new Triangle();
       perimeter = tr.side1 + tr.side2 + tr.side3;
       System.out.println("Parameter of triangle is: " + perimeter);
       s = perimeter / 2;
       areaOfTriangle = Math.sqrt(s * (s - tr.side1) * (s - tr.side2) * (s - tr.side3));
       System.out.println("Area of Triangle is: " + areaOfTriangle);


    }
}
