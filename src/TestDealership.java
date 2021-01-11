import java.util.ArrayList;

public class TestDealership {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("Ford","Mustang",2019,350.0,"Sedan",2,13,"Auto");

        c1.setMake("Audi");
        c1.setModel("R8");
        c1.setMax_speed(400);
        c1.setSeats(4);
        c1.setTransmission("Manual");
        c1.setYear(2012);
        c1.setType("SUV");
        c1.setWheels(12);  // wheels size (Radius)

        Dealership ds = new Dealership("Motor-City","Windsor");

        ArrayList<String>E = new ArrayList<>();  // creating new list of managers,employees and Cars
        ArrayList<String>M = new ArrayList<>();
        ArrayList<Car>cars = new ArrayList<>();

        E.add("Employee1");
        E.add("Employee2");

        M.add("Manager1");
        M.add("Manager2");
        M.set(1,"Rakesh");


        cars.add(c1);
        cars.add(c2);
        cars.set(1,c1);
        cars.set(1,c2);

        ds.setEmployees(E);
        ds.setManagers(M);
        ds.setCars(cars);

        // Testing out the Changes Implemented :

        System.out.println("Name of DealerShip  : " + ds.getName());
        System.out.println("Location of DealerShip  : " + ds.getLocation());
        System.out.println("Managers  : " + ds.getManagers());
        System.out.println("Employees  : " + ds.getEmployees());
        System.out.println("Cars in Dealership  : \n" + ds.getCars());  // prints all cars in given dealership




    }
}
