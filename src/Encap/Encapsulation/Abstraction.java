package Encap.Encapsulation;

abstract class Vehicle
{
    void testRide()
    {
        System.out.println("This is Test Ride");
    }
    abstract void buy();
    abstract void price();
}
class Car extends Vehicle{
    @Override
    void buy(){
        System.out.println("This is Car Ride");
    }

    @Override
    void price() {
        System.out.println("This is the price of car");
    }
}
public class Abstraction{

}