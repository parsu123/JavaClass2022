package oop.polymorphism;

public class ElectricBus extends Bus{
    @Override
    public void seatingCapacity() {
        System.out.println("Child class Seats = 30");
        super.seatingCapacity();
    }

    public static void main(String[] args) {
    ElectricBus eb = new ElectricBus();
    eb.seatingCapacity();

    }
}
