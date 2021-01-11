import java.util.ArrayList;

public class Car {
    private String make;
    private String model;
    private int year;
    private double max_speed;
    private String transmission;
    private String type;
    private int seats;
    private int wheels;  // size of wheels

    public Car(){}   // Default constructor

    public Car(String make,String model){
        this.make = make;
        this.model = model;
    }

    // constructor containing all the properties/instance variables
    public Car(String make, String model, int year, double max_speed, String type, int seats, int wheels, String Transmission) {
        this(make,model);
        this.year = year;
        this.max_speed = max_speed;
        this.type = type;
        this.seats = seats;
        this.wheels = wheels;
        this.transmission = Transmission;
    }

    // Getter and Setter methods Start

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMax_speed() {
        return max_speed;
    }

    public void setMax_speed(double max_speed) {
        this.max_speed = max_speed;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;




    }

    // Getter and Setter methods END


    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", max_speed=" + max_speed +
                ", transmission='" + transmission + '\'' +
                ", type='" + type + '\'' +
                ", seats=" + seats +
                ", wheels=" + wheels +
                '}';
    }
}


class Dealership {
    private String name;
    private String location;
    // number of managers and Employees are not known in advance so can be changed
   private ArrayList<String>managers = new ArrayList<String>();
    private ArrayList<String>employees = new ArrayList<String>();
     ArrayList<Car>cars = new ArrayList<Car>();  // Using Array list we can modify the values

    public Dealership(){

    }

    public Dealership(String name,String location){
        this.name = name;
        this.location = location;
    }

    // getter and setter method Start here
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<String> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<String> employees) {
        this.employees = employees;
    }

    public ArrayList<String> getManagers() {
        return managers;
    }

    public void setManagers(ArrayList<String> managers) {
        this.managers = managers;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    // getter and setter method End here

    // methods for adding cars , Managers and Employees to class Dealership

    public void addManager(String M){
        this.managers.add(M);

    }

    public void addEmployee(String E){
        this.employees.add(E);
    }

    public void addCars(Car c){
        this.cars.add(c);
    }
}


