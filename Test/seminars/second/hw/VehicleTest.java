package seminars.second.hw;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {

    private Car car;
    private Motorcycle motorcycle;

    @BeforeEach
    public void setUp() {
        car = new Car("Toyota", "Camry", 2023);
        motorcycle = new Motorcycle("Jawa", "Jawa-5", 1985);
    }
  
    @Test //проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
    public void testCarIsInstanceOfVehicle() {
        assertTrue(car instanceof Vehicle);
    }

    @Test //проверка того, объект Car создается с 4-мя колесами
    public void testCarHasFourWheels() {
        assertEquals(4, car.getNumWheels());
    }

    @Test //проверка того, объект Motorcycle создается с 2-мя колесами
    public void testMotorcycleHasTwoWheels() {
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test //проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
    public void testCarTestDrive() {
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test //проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
    public void testMotorcycleTestDrive() {
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test //проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)
    public void testCarPark() {
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test //проверить, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
    public void testMotorcyclePark() {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}
