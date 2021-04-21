import java.util.ArrayList;

public class ParkingLot {
    private int capacity;
    private ArrayList<Car> vehicles = new ArrayList<Car>();

    public ParkingLot(int capacity) {
        this.capacity = capacity;
    }

    public void park(Car car) {
        if(capacity >= 1) {
            car.setStatus("Parked");
            vehicles.add(car);
            capacity -= 1;
        }
    }
}
