package W3L2.Assignment;


import java.util.Comparator;
import java.util.TreeSet;

public class Vehicle implements Comparable {

    private String VehicleName, Model;
    private Double VehiclePrice;

    public String getVehicleName() {
        return VehicleName;
    }

    public String getModel() {
        return Model;
    }

    public Double getVehiclePrice() {
        return VehiclePrice;
    }

    public Vehicle(String vehicleName, String model, Double vehicleDouble) {
        VehicleName = vehicleName;
        Model = model;
        VehiclePrice = vehicleDouble;
    }
    public int compareTo(Object o) {
        Vehicle obj = (Vehicle) o;
        return this.getVehicleName().compareTo((obj.getVehicleName()));
    }

    @Override
    public String toString(){
        return getVehicleName() + " " + getModel() + " " + getVehiclePrice()+ "\n";
    }

    public static void main(String[] args) {
        TreeSet<Vehicle> car = new TreeSet<>(new VehicleCompator());
        TreeSet<Vehicle> car1 = new TreeSet<>();

        // Sorting by price using Comparator
        car.add(new Vehicle("Toyota", "Camry" , 15999.99));
        car.add(new Vehicle("Mercedes", "C43" , 25999.99));
        car.add(new Vehicle("Lexus", "RX350" , 35999.99));
        car.add(new Vehicle("BMW", "X5" , 45999.99));
        car.add(new Vehicle("Audi", "q5" , 54999.99));

        // Sorting by name using Comparable
        car1.add(new Vehicle("Toyota", "Camry" , 15999.99));
        car1.add(new Vehicle("Mercedes", "C43" , 25999.99));
        car1.add(new Vehicle("Lexus", "RX350" , 35999.99));
        car1.add(new Vehicle("BMW", "X5" , 45999.99));
        car1.add(new Vehicle("Audi", "q5" , 54999.99));


        System.out.println(car);
        System.out.println("====================================");
        System.out.println(car1);
    }


}
