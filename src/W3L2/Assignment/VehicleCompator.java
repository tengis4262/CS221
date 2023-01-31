package W3L2.Assignment;

import java.util.Comparator;

public class VehicleCompator implements Comparator<Vehicle> {

    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        return Double.compare(o1.getVehiclePrice(),o2.getVehiclePrice());
    }
}
