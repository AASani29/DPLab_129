public class Vehicle {
String vehicleType;
String licensePlate;
int capacity;


Vehicle(String vehicleType, String licensePlate, int capacity) {
    this.vehicleType = vehicleType;
    this.licensePlate = licensePlate;
    this.capacity = capacity;
}


void displayVehicle() {
    System.out.println("Vehicle Type: " + vehicleType + " | License Plate: " + licensePlate + " | Capacity: " + capacity);
}
}
