import startegy.DriveStrategy;

/***
 @author: Pratiksha Kulkarni
 date: 3/12/2023
 */
public class Vehicle {

    DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
