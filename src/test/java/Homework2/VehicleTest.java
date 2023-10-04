package Homework2;

import org.example.Homework2.Car;
import org.example.Homework2.Motorcycle;
import org.example.Homework2.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Тестовый класс для класса Vehicle, Car, Motorcycle .
 */

class VehicleTest {

    private Car car;
    private Motorcycle motorcycle;

    @BeforeEach
    public void setUp() {
        car = new Car("Volvo", "X5", 2020);
        motorcycle = new Motorcycle("Mercedes", "A1", 2018);
    }

    /**
     * Тест на проверку что экземпляр объекта Car также является экземпляром транспортного средства
     */
    @Test
    public void testCarExtendVehicle() {
        boolean result = car instanceof Vehicle;

        assertTrue(result);

    }

    /**
     * Тест для проверку что объект Car создается с 4-мя колесами
     */
    @Test
    public void CarNumWheels() {
        assertEquals(4, car.getNumWheels());

    }

    /**
     * Тест для проверку что объект Motorcycle создается с 2-мя колесами
     */
    @Test
    public void MotorcycleNumWheels() {
        assertEquals(2, motorcycle.getNumWheels());
    }

    /**
     * Тест для проверку  что объект Car развивает скорость 60 в режиме тестового вождения
     */
    @Test
    public void CarTestDrive() {
        car.testDrive();

        assertEquals(60, car.getSpeed());
    }

    /**
     * Тест для проверку  что объект Motorcycle развивает скорость 60 в режиме тестового вождения
     */
    @Test
    public void MotorcycleTestDrive() {
        motorcycle.testDrive();

        assertEquals(75, motorcycle.getSpeed());
    }

    /**
     * Тест для проверку  что в режиме парковки  машина останавливается
     */
    @Test
    public void CarTestDrivePark() {
        car.testDrive();
        car.park();

        assertEquals(0, car.getSpeed());
    }

    /**
     * Тест для проверку  что в режиме парковки мотоцикл останавливается
     */
    @Test
    public void MotorcycleTestDrivePark() {
        motorcycle.testDrive();
        motorcycle.park();

        assertEquals(0, motorcycle.getSpeed());
    }
}