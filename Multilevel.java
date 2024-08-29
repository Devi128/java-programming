// Multilevel Inheritance Example
class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car drives");
    }
}

class ElectricCar extends Car {
    void charge() {
        System.out.println("Electric Car is charging");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        ElectricCar myElectricCar = new ElectricCar();
        myElectricCar.start();  // Inherited from Vehicle class
        myElectricCar.drive();  // Inherited from Car class
        myElectricCar.charge(); // Method in ElectricCar class
    }
}




