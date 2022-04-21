package project1;

 interface Vehicle1 {

    static void cleanVehicle(){
        System.out.println("I am cleaning vehicle");
    }
}


public class Car implements Vehicle1 {
    
    public void cleanVehicle() {
        System.out.println("Cleaning the vehicle");
    }

    public static void main(String args[]) {
        Car car = new Car();
        Vehicle1 vehicle;
        Vehicle1.cleanVehicle();

    }
}