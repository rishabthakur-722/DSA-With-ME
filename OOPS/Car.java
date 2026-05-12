// Vehicle.java

class Car extends Vehicle {

    int numberOfDoors;
// Constructor

    public Car(String name, String model, int year, int numberOfDoors) {
        super(name, model, year);
        this.numberOfDoors = numberOfDoors;
    }
// Override the displayInfo method to include number of doors

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}
