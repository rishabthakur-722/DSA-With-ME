// Base class

class Vehicle {

    String name;
    String model;
    int year;
// Constructor

    public Vehicle(String name, String model, int year) {
        this.name = name;
        this.model = model;
        this.year = year;
    }
// Method to display vehicle information

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);

    }
}
