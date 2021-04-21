import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParkingTest {
    @Test
    public void testIfCarIsParked() {
        String expected = "Parked";
        String actual;
        ParkingLot parkingLot = new ParkingLot(1);
        Car car = new Car("Unparked");

        parkingLot.park(car);
        actual = car.getStatus();

        assertEquals(expected, actual);
    }
}
